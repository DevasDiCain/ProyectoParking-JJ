/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidad;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
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
        double precio = 0;
        int minutosTotalesAparcado = 0;
        int contador = 1;
        List<TicketVO> listaDeTickets = EnviarDatos.obtenerTickets();
       
        for (TicketVO ticket : listaDeTickets) {
            if (ticket.getMatricula().equalsIgnoreCase(matricula) && ticket.getImporte() == 0) {
                int diasEntreDepositoYRetiro = (int) Duration.between(ticket.getFechaEntrada().atStartOfDay(), LocalDate.now().atStartOfDay()).toDays();
                int minutosTotalesHoy = (LocalTime.now().getHour() * 60) + LocalTime.now().getMinute();
                int minutosTotalesTicket = (ticket.getHoraEntrada().getHour() * 60) + ticket.getHoraEntrada().getMinute();
                if (diasEntreDepositoYRetiro == 0) {
                    minutosTotalesAparcado = minutosTotalesHoy - minutosTotalesTicket;
                } else {
                    minutosTotalesAparcado = 1440 * diasEntreDepositoYRetiro - minutosTotalesTicket + minutosTotalesHoy;
                } 
                PlazaVO plaza = EnviarDatos.obtenerPlazaSegunPk(ticket.getCodPlaza());
                switch (plaza.getTipoPlaza()) {
                    case "turismo":
                        precio = (minutosTotalesAparcado * 0.12);
                        break;
                    case "motocicletas":
                        precio = (minutosTotalesAparcado * 0.08);
                        break;
                    case "caravanas":
                        precio = (minutosTotalesAparcado * 0.45);
                        break;
                    default:
                        break;
                }
                ticket.setHoraSalida(LocalTime.now());
                ticket.setImporte((int) precio);
                EnviarDatos.cambiarTicket(ticket.getCodTicket(), ticket);
            } else {
                System.out.println("El ticket " + contador + " no era el correcto");
            }
            contador++;
        }
        return precio;
    }
}
