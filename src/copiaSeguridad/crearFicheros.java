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

    public static String crearSubCarpeta() {
        Path directory = Paths.get("./backup/"+String.valueOf(LocalDate.now())+"---"+String.valueOf(LocalTime.now()));
        try {
            Files.createDirectories(directory);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }
        return String.valueOf(directory);
    }
    public static void main(String[] args) {
       crearFicheros.crearCopiaSeguridad("Abonado");
    }
    
    public static void crearCopiaSeguridad(String carpeta){
        String subCarpeta=crearFicheros.crearSubCarpeta();
        Path origen  = Paths.get("./Aparka_"+carpeta+".sql");
        Path destino = Paths.get("./"+subCarpeta+"copia"+carpeta+".txt");
        try
        {  
            Files.copy(origen, destino);
        }
        catch(IOException e) {     
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }

        
    }
    public static void restaurarCopiaSeguridad(){}
    
}

