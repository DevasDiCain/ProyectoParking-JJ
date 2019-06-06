/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidad;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.EnviarDatos;
import modelo.PlazaVO;
import modelo.TicketVO;

/**
 *
 * @author juan
 */
public class CalcularPrecio {
    public static double calcularPrecioTicket(String matricula, String identificador, String pin) {
        int contador = 0;
        double precio = 0;
        int minutosTotalesAparcado = 0;
        int minutosEntreDias = 0;
        
        List<TicketVO> listaDeTickets = EnviarDatos.obtenerTickets();
        for (TicketVO ticket : listaDeTickets) {
            if (ticket.getMatricula().equalsIgnoreCase(matricula) && ticket.getImporte() == 0) {
                System.out.println("Ticket: " + ticket.getCodPlaza());
                // Devuelve un número entero, los días entre que se aparcó y que se retiró
                long diasEntreEntradaSalida = ChronoUnit.DAYS.between(ticket.getFechaEntrada(), LocalDate.now());
               
                diasEntreEntradaSalida = diasEntreEntradaSalida -1;
                 System.out.println("Dias entre entrada y salida: " + diasEntreEntradaSalida);
                // Número entero de minutos transcurridos hoy
                int minutosTotalesHoy = (LocalTime.now().getHour() * 60) + LocalTime.now().getMinute();
                System.out.println("Minutos totales hoy: " + minutosTotalesHoy);
                
                // Número entero de minutos transcurridos el día del ticket
                int minutosTotalesTicket = (ticket.getHoraEntrada().getHour() * 60) + ticket.getHoraEntrada().getMinute();
                System.out.println("Minutos totales ticket: " + minutosTotalesTicket);
                // Si el retiro se ha realizado el mismo día del ingreso, para calcular el número de minutos
                // aparcado se resta los minutos del retiro menos los minutos de cuando se realizó el depósito
                if (diasEntreEntradaSalida < 1) {
                    minutosTotalesAparcado = minutosTotalesHoy - minutosTotalesTicket;
                    System.out.println("Minutos totales aparcado: " + minutosTotalesAparcado);
                } else {
                    // Si hay MÁS DE UN DÍA de diferencia, esos minutos de días extras se añadirán
                    // al total de minutos
                    if (diasEntreEntradaSalida > 1) {
                        System.out.println("Más de 1 día entre entrada y salida");
                        diasEntreEntradaSalida -= 1;
                        minutosEntreDias = (int) (diasEntreEntradaSalida * 1440);
                    }
                    // Se calcula al sumar las 3 variables con minutos: los del día en que se ha realizado el retiro,
                    // los restantes del día del depósito y los de los días transcurridos entre cada uno
                    minutosTotalesAparcado = minutosEntreDias + minutosTotalesHoy + (1440 - minutosTotalesTicket);
                    System.out.println("Minutos totales aparcado más de un día: " + minutosTotalesAparcado);
                }
                // Se calcula según el tipo de plaza
                PlazaVO plaza = EnviarDatos.obtenerPlazaSegunPk(ticket.getCodPlaza());
                switch (plaza.getTipoPlaza()) {
                    case "turismo":
                        precio = (minutosTotalesAparcado * 0.12);
                        System.out.println("Turismo");
                        break;
                    case "motocicleta":
                        precio = (minutosTotalesAparcado * 0.08);
                        System.out.println("Motocicleta");
                        break;
                    case "caravana":
                        precio = (minutosTotalesAparcado * 0.45);
                        System.out.println("Caravana");
                        break;
                    default:
                        break;
                }
                // Se edita el ticket para reflejar la nueva información
                ticket.setHoraSalida(LocalTime.now());
                ticket.setImporte(precio);
                EnviarDatos.cambiarTicket(ticket.getCodTicket(), ticket);
            } else {
                System.out.println("El ticket " + contador + " no era el correcto");
            }
            contador++;
        }
        System.out.println("Precio: " + precio);
        return precio;
    }
}
