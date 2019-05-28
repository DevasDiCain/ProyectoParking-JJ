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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.AbonadoVO;
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
        String idFichero = "./backup/2019-05-2814:08:16.738/Abonado.txt";

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

    public static void main(String[] args) {
        System.out.println(restaurarCopiaDeSeguridad.restaurarTablaAbonados());

        
    }

}
