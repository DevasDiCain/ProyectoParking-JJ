/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiaSeguridad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.AbonadoVO;
import modelo.VehiculoVO;


/**
 *
 * @author José
 */
public class restaurarCopiaDeSeguridad {





    public static String[] restaurarTablaAbonados(){
         ArrayList<VehiculoVO> abonados = new ArrayList<>();
        // Fichero a leer
        String idFichero = "Abonado.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea ="";

        System.out.println("Leyendo el fichero: " + idFichero);
        
     // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){
            
            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

               
               tokens = linea.split("|");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        return
    }
    public static void main(String[] args) {
        restaurarCopiaDeSeguridad.restaurarTablaAbonados(idFichero);
    }
  

}


