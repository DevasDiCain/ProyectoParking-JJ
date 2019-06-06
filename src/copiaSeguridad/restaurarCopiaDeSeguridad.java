/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiaSeguridad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.AbonadoVO;
import modelo.EnviarDatos;
import modelo.PlazaVO;
import modelo.TicketVO;
import modelo.VehiculoVO;

/**
 *
 * @author José
 */
public class restaurarCopiaDeSeguridad {

    public static ArrayList<AbonadoVO> restaurarTablaAbonados() {
        ArrayList<AbonadoVO> abonados = new ArrayList<>();
        AbonadoVO abonado = new AbonadoVO("");
        
        // Fichero a leer
        String idFichero = "./backup/"+restaurarCopiaDeSeguridad.hallarUltimaCarpeta()+"/Abonado.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea = "";

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
              

             

                //convert String to LocalDate
                System.out.println(linea);
                tokens = linea.split("\\|");
                  for(int i = 0; i < tokens.length ; i++){
                      System.out.println(tokens[i]);
                  } 
                abonado.setPk(Integer.parseInt(tokens[0]));
                abonado.setNombre(tokens[1]);
                abonado.setTipoDeAbono(tokens[2]);
                abonado.setFeciniabo(LocalDate.parse(tokens[3]));
                abonado.setFecfinabo(LocalDate.parse(tokens[4]));
                abonado.setFechaNacimiento(LocalDate.parse(tokens[5]));
                abonado.setDni(tokens[6]);
                abonado.setEmail(tokens[7]);
                abonado.setNumTarjeta(tokens[8]);
                abonado.setMatricula(tokens[9]);
                abonado.setDuracion(Integer.parseInt(tokens[10]));

            }
            abonados.add(abonado);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return abonados;
    }

    public static String hallarUltimaCarpeta() {
        File f = new File("./backup");
        File[] ficheros = f.listFiles();
      

        return ficheros[ficheros.length - 1].getName();
    }
     public static ArrayList<VehiculoVO> restaurarTablaVehiculos() {
        ArrayList<VehiculoVO> vehiculos = new ArrayList<>();
        VehiculoVO vehiculo = new VehiculoVO();
        
        // Fichero a leer
        String idFichero = "./backup/"+restaurarCopiaDeSeguridad.hallarUltimaCarpeta()+"/Vehiculo.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea = "";

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
       
                System.out.println(linea);
                tokens = linea.split("\\|");
                 
                int x = Integer.parseInt(tokens[2]);
               
                
                 vehiculo.setMatricula(tokens[0]);
                 vehiculo.setTipoVehiculo(tokens[1]);
                 vehiculo.setCodPlaza(x);

            }
            vehiculos.add(vehiculo);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }
     
     public static ArrayList<PlazaVO> restaurarTablaPlazas() {
        ArrayList<PlazaVO> plazas = new ArrayList<>();
        PlazaVO plaza = new PlazaVO();
        
        // Fichero a leer
        String idFichero = "./backup/"+restaurarCopiaDeSeguridad.hallarUltimaCarpeta()+"/Plaza.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea = "";

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
             

             

                //convert String to LocalDate
                System.out.println(linea);
                tokens = linea.split("\\|");
          
                
                   plaza.setCodPlaza(Integer.parseInt(tokens[0]));
                   plaza.setOcupado(Boolean.parseBoolean(tokens[1]));
                   plaza.setReservado(Boolean.parseBoolean(tokens[2]));
                   plaza.setTipoPlaza(tokens[3]);
                   
                
                

            }
            plazas.add(plaza);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return plazas;
    }
     public static ArrayList<TicketVO> restaurarTablaTickets() {
        ArrayList<TicketVO> tickets = new ArrayList<>();
        TicketVO ticket = new TicketVO();
        
        // Fichero a leer
        String idFichero = "./backup/"+restaurarCopiaDeSeguridad.hallarUltimaCarpeta()+"/Ticket.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea = "";

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                

             

                //convert String to LocalDate
                System.out.println(linea);
                tokens = linea.split("\\|");
                 
                
                 ticket.setCodTicket(Integer.parseInt(tokens[0]));
                 ticket.setCodPlaza(Integer.parseInt(tokens[1]));
                 ticket.setMatricula(tokens[2]);
                 ticket.setFechaEntrada(LocalDate.parse(tokens[3]));
                 ticket.setImporte(Double.parseDouble(tokens[4]));
                 ticket.setPin(tokens[5]);
                 ticket.setHoraEntrada(LocalTime.parse(tokens[6]));
                 ticket.setHoraSalida(LocalTime.parse(tokens[7]));
                 ticket.setFechaSalida(LocalDate.parse(tokens[8]));
          

            }
            tickets.add(ticket);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return tickets;
    }

     public static void restaurarBaseDeDatos(){
         ArrayList<AbonadoVO> abonados = restaurarCopiaDeSeguridad.restaurarTablaAbonados();
         ArrayList<PlazaVO> plazas =  restaurarCopiaDeSeguridad.restaurarTablaPlazas();
         ArrayList<TicketVO> tickets = restaurarCopiaDeSeguridad.restaurarTablaTickets();
         ArrayList<VehiculoVO> vehiculos = restaurarCopiaDeSeguridad.restaurarTablaVehiculos();
         EnviarDatos.resetBaseDeDatos();
         EnviarDatos.restaurarBaseDeDatos(tickets,plazas,abonados,  vehiculos);
         
     }

    public static void main(String[] args) {
//        System.out.println(restaurarCopiaDeSeguridad.restaurarTablaAbonados());
        
        System.out.println(restaurarCopiaDeSeguridad.restaurarTablaVehiculos());
       
   

        
    }

}
