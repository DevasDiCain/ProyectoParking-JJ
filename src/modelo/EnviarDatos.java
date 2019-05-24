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

    //<editor-fold defaultstate="collapsed" desc="COMUNICACIÓN CON TABLA ABONADO">
    public static void insertarAbonado(AbonadoVO abonado) {
        AbonadoDAO estandar = new AbonadoDAO();
        try {
            estandar.insertPersona(abonado);
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

    public static void borrarTablaAbonado() {
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

    public static int ultimoAbonado() {
        AbonadoDAO x = new AbonadoDAO();
        int resultado = 0;
        try {
            resultado = x.hallarPk();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido encontrar el último abonado");
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="COMUNICACIÓN CON TABLA VEHÍCULO">
    public static void insertarVehiculo(VehiculoVO vehiculo) {
        VehiculoDAO estandar = new VehiculoDAO();
        try {
            estandar.insertVehiculo(vehiculo);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido introducir el vehiculo:");
            System.out.println(sqle.getMessage());
        }
    }
    
    public static VehiculoVO obtenerVehiculoSegunPk(String pk) {
        VehiculoDAO abonado = new VehiculoDAO();
        VehiculoVO obtenido = new VehiculoVO();
        try {
            return obtenido = abonado.findByPk(pk);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener al vehículo según la pk");
            System.out.println(sqle.getMessage());
        }
        return obtenido;
    }
    
    public static List<VehiculoVO> obtenerVehiculos() {
        List<VehiculoVO> listado = new ArrayList();
        try {
            return listado = new VehiculoDAO().getAll();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener la lista de Vehículos");
            System.out.println(sqle.getMessage());
        }
        return listado;
    }
    
    public static void borrarTablaVehiculo() {
        try {
            new AbonadoDAO().deletePersona();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar la tabla:");
            System.out.println(sqle.getMessage());
        }
    }
    
    public static void borrarVehiculo(VehiculoVO vehiculo) {
        try {
            new VehiculoDAO().deleteVehiculo(vehiculo);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }
    
    public static void cambiarVehiculo(String pk, VehiculoVO nuevosDatos) {
        try {
            new VehiculoDAO().updateVehiculo(pk, nuevosDatos);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }

    public static int ultimoVehiculo() {
        VehiculoDAO x = new VehiculoDAO();
        int resultado = 0;
        try {
            resultado = x.hallarPlaza();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido encontrar la ultima plaza");
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="COMUNICACIÓN CON TABLA TICKET">
    public static void insertarTicket(TicketVO ticket) {
        TicketDAO estandar = new TicketDAO();
        try {
            estandar.insertTicket(ticket);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido introducir al abonado:");
            System.out.println(sqle.getMessage());
        }
    }

    public static TicketVO obtenerTicketSegunPk(int pk) {
        TicketDAO ticket = new TicketDAO();
        TicketVO obtenido = new TicketVO();
        try {
            return obtenido = ticket.findByPk(pk);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener al abonado según la pk");
            System.out.println(sqle.getMessage());
        }
        return obtenido;
    }

    public static List<TicketVO> obtenerTickets() {
        List<TicketVO> listado = new ArrayList();
        try {
            return listado = new TicketDAO().getAll();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener la lista de Abonados");
            System.out.println(sqle.getMessage());
        }
        return listado;
    }

    public static void borrarTicketAbonado() {
        try {
            new TicketDAO().deleteTicket();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar la tabla:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void borrarTicket(TicketVO ticket) {
        try {
            new TicketDAO().deleteTicket(ticket);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void cambiarTicket(int pk, TicketVO nuevosDatos) {
        try {
            new TicketDAO().updateTicket(pk, nuevosDatos);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }

    public static int ultimoTicket() {
        AbonadoDAO x = new AbonadoDAO();
        int resultado = 0;
        try {
            resultado = x.hallarPk();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido encontrar el último abonado");
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="COMUNICACIÓN CON TABLA PLAZA">
    //</editor-fold>
    public static void main(String[] args) {
        AbonadoVO x = new AbonadoVO("Eva", "ANUAL", LocalDate.of(1995, Month.MARCH, 10), LocalDate.of(1995, Month.MARCH, 10), "", "", "", LocalDate.of(1995, Month.MARCH, 10), "abc 1234");
        EnviarDatos.insertarAbonado(x);

    }

}
