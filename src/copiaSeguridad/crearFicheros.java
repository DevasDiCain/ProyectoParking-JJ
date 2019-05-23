/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiaSeguridad;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import modelo.AbonadoVO;
import modelo.EnviarDatos;

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
    
    public static void crearCopiaSeguridadAbonado(List<AbonadoVO>  lista){
       // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "Abonado.txt";
        
        // Array a escribir
         lista =EnviarDatos.obtenerAbonados();

       // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
       // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))){
            
            
            for (int i = 0 ; i < lista.size(); i++) {
                for (int j = 0; j < lista.size(); j++) {
                    // Usamos metodo write() para escribir en el buffer
                    flujo.write(i + ",");
                }
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 

    }

        
    
    public static void restaurarCopiaSeguridad(){}
    
}


