/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiaSeguridad;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author jose
 */
public class crearFicheros {

    public static void crearSubCarpeta(LocalDate dia, LocalTime hora) {
        Path directory = Paths.get(String.valueOf(dia)+"---"+String.valueOf(hora)+"./files");
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        crearFicheros.crearSubCarpeta(LocalDate.of(1998, Month.MARCH, 1), LocalTime.of(15, 0));
    }
}
