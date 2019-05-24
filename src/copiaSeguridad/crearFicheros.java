/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiaSeguridad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import modelo.AbonadoVO;
import modelo.EnviarDatos;
import modelo.PlazaVO;
import modelo.TicketVO;
import modelo.VehiculoVO;

/**
 *
 * @author jose
 */
public class crearFicheros {

    public static String crearSubCarpeta() {
        Path directory = Paths.get("./backup/" + String.valueOf(LocalDate.now()) + "" + String.valueOf(LocalTime.now()));
        try {
            Files.createDirectories(directory);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }
        return String.valueOf(directory);
    }

    public static void main(String[] args) {
        crearFicheros.crearCopiaSeguridad();
    }

    public static String hallarCarpeta() {
        File f = new File("./backup");
        File[] ficheros = f.listFiles();
        if (f.exists()) {
            for (File file2 : ficheros) {
                System.out.println(file2.getName());

            }
        } else {
            System.out.println("El directorio a listar no existe");
        }

        return ficheros[ficheros.length - 1].getName();
    }

    public static void crearCopiaSeguridadAbonado() {
        List<AbonadoVO> lista = new ArrayList<>();
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "backup/" + crearFicheros.hallarCarpeta() + "/Abonado.txt";

        // Array a escribir
        lista = EnviarDatos.obtenerAbonados();

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (AbonadoVO x : lista) {
                flujo.write(x.toString());
                flujo.newLine();
            }
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void crearCopiaSeguridadPlaza() {
        List<PlazaVO> lista = new ArrayList<>();
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "backup/" + crearFicheros.hallarCarpeta() + "/Plaza.txt";

        // Array a escribir
        lista = EnviarDatos.obtenerPlazas();

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (PlazaVO x : lista) {
                flujo.write(x.toString());
                flujo.newLine();
            }
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void crearCopiaSeguridadVehiculo() {
        List<VehiculoVO> lista = new ArrayList<>();
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "backup/" + crearFicheros.hallarCarpeta() + "/Vehiculo.txt";

        // Array a escribir
        lista = EnviarDatos.obtenerVehiculos();

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (VehiculoVO x : lista) {
                flujo.write(x.toString());
                flujo.newLine();
            }
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void crearCopiaSeguridadTicket() {
        List<TicketVO> lista = new ArrayList<>();
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "backup/" + crearFicheros.hallarCarpeta() + "/Ticket.txt";

        // Array a escribir
        lista = EnviarDatos.obtenerTickets();

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            lista.forEach(System.out::println);
            for (TicketVO x : lista) {
                flujo.write(x.toString());
                flujo.newLine();
            }
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void crearCopiaSeguridad() {
        crearFicheros.crearSubCarpeta();
        crearFicheros.crearCopiaSeguridadAbonado();
        crearFicheros.crearCopiaSeguridadPlaza();
        crearFicheros.crearCopiaSeguridadTicket();
        crearFicheros.crearCopiaSeguridadVehiculo();
    }

    public static void restaurarCopiaSeguridad() {
    }
}