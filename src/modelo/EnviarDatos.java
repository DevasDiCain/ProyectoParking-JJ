/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class EnviarDatos {
     public static void main(String[] args) {
        
    
        AbonadoDAO daoAbonado = new AbonadoDAO();
        List<AbonadoVO> listaAbonados = new ArrayList<>();
        listaAbonados.add(new AbonadoVO(1,"Hugo Weston", LocalDate.of(1997, 6, 6)));
        listaAbonados.add(new AbonadoVO(2,"María Weston", LocalDate.of(1967, 6, 6)));
        listaAbonados.add(new AbonadoVO(3,"Pablo Pérez", LocalDate.of(1997, 12, 5)));
        listaAbonados.add(new AbonadoVO(4,"Lucía Weston", LocalDate.of(2000, 6, 5)));
        listaAbonados.add(new AbonadoVO(5,"Pedro Moreno", LocalDate.of(2001, 6, 15)));
        
        try {
            
            System.out.println("Nº personas insertadas " + daoAbonado.insertPersona(listaAbonados));
            System.out.println("-----------------------------------------");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<AbonadoVO> nuevaLista = daoAbonado.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Persona con primary key 1: ");
            System.out.println(daoAbonado.findByPk(1));
            System.out.println("-----------------------------------------");
       
            nuevaLista = daoAbonado.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de borrar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Modificación de la persona con pk 5");
            System.out.println("Nº Personas modificadas " + 
                    daoAbonado.updatePersona(5, new AbonadoVO(7,"NuevoNombre", LocalDate.of(2019, 6, 5))));
            System.out.println("-----------------------------------------");
            nuevaLista = daoAbonado.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de modificar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Ejecución del procedimiento almacenado");
            System.out.println("Se cambia María Weston por Felipe Román");
            System.out.println("Nombres cambiados " + daoAbonado.cambiarNombres("María Weston", "Felipe Román"));
            System.out.println("-----------------------------------------");
            nuevaLista = daoAbonado.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de ejecutar proced. -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
        System.out.println();
        listaAbonados.forEach(System.out::println);

    }
}
