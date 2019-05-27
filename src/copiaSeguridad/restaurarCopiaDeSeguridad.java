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





    public static String[] restaurarTablaAbonados(String idFichero){
        
         ArrayList<VehiculoVO> abonados = new ArrayList<>();
        FileInputStream fich = null;
        String[]tokens = new String[100];
        String linea;
       
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){

            System.out.println("Separando cada elemento del fichero: ");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split("|");

                for (String string : tokens) {
                    System.out.print(string + "\t");
                }

                System.out.println();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 


        return tokens;
    }
    public static void main(String[] args) {
        restaurarCopiaDeSeguridad.restaurarTablaAbonados(idFichero);
    }
  

}


