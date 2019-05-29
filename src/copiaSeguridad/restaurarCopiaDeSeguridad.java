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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.AbonadoVO;
import modelo.PlazaVO;
import modelo.VehiculoVO;

/**
 *
 * @author José
 */
public class restaurarCopiaDeSeguridad {

    public static ArrayList<AbonadoVO> restaurarTablaAbonados() {
        ArrayList<AbonadoVO> abonados = new ArrayList<>();
        AbonadoVO abonado = new AbonadoVO();
        
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
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");

             

                //convert String to LocalDate
                System.out.println(linea);
                tokens = linea.split("\\|");
                   System.out.println(tokens[3]+""+tokens[4]+""+tokens[5]);
                   String date = tokens[3];
                   String date1 =tokens[4];
                   String date2=tokens[5];
                
                 LocalDate x = LocalDate.parse(date, formatter);
                 LocalDate y = LocalDate.parse(date1,formatter);
                 LocalDate e = LocalDate.parse(date2,formatter);
                
                abonado.setPk(Integer.parseInt(tokens[0]));
                abonado.setNombre(tokens[1]);
                abonado.setTipoDeAbono(tokens[2]);
                abonado.setFeciniabo(x);
                abonado.setFecfinabo(y);
                abonado.setFechaNacimiento(e);
                abonado.setDni(tokens[6]);
                abonado.setEmail(tokens[7]);
                abonado.setNumTarjeta(tokens[8]);
                abonado.setMatricula(tokens[9]);

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

    public static void main(String[] args) {
//        System.out.println(restaurarCopiaDeSeguridad.restaurarTablaAbonados());
        
        System.out.println(restaurarCopiaDeSeguridad.restaurarTablaVehiculos());
       
   

        
    }

}
