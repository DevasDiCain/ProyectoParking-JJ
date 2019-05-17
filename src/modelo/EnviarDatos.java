/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class EnviarDatos {

    public static void insertarAbonado(AbonadoDAO abonado, List<AbonadoVO> abonados) {
        try {
            abonado.insertPersona(abonados);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido introducir al abonado:");
            System.out.println(sqle.getMessage());
        }
    }

    public static AbonadoVO obtenerAbonadoSegunPk(int pk) {
        AbonadoDAO abonado = new AbonadoDAO();
        AbonadoVO obtenido = new AbonadoVO();
        try {

            return obtenido = abonado.findByPk(pk);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener al abonado según la pk");
            System.out.println(sqle.getMessage());
        }
        return obtenido;
    }

    public static List<AbonadoVO> obtenerAbonados() {
        List<AbonadoVO> listado = new ArrayList();
        try {

            return listado = new AbonadoDAO().getAll();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener la lista de Abonados");
            System.out.println(sqle.getMessage());
        }
        return listado;
    }

    public static void borrarTabla() {
        try {

            new AbonadoDAO().deletePersona();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar la tabla:");
            System.out.println(sqle.getMessage());
        }

    }

    public static void borrarAbonado(AbonadoVO abonado) {

        try {

            new AbonadoDAO().deletePersona(abonado);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void cambiarAbonado(int pk, AbonadoVO nuevosDatos) {
        try {

            new AbonadoDAO().updatePersona(pk, nuevosDatos);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }

    }

    public static void main(String[] args) {
       AbonadoVO x = new AbonadoVO(1,"Prueba 1","ANUAL",LocalDate.of(2010, Month.MARCH, 1),LocalDate.of(2010, Month.MARCH, 1),"dni","email","tarjeta",LocalDate.of(2010, Month.MARCH, 1));
       EnviarDatos.cambiarAbonado(1, x);
    }
}
