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
import javax.swing.JOptionPane;

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
    public static AbonadoVO obtenerAbonadoSegunMatricula(String matricula) {
        AbonadoDAO abonado = new AbonadoDAO();
        AbonadoVO obtenido = new AbonadoVO();
        try {
            return obtenido = abonado.findByMatricula(matricula);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener al abonado según la matricula");
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
            new AbonadoDAO().deleteFullPersona();

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

    public static ArrayList<AbonadoVO> unaSemanaCaducan() {
        AbonadoDAO x = new AbonadoDAO();
        ArrayList<AbonadoVO> abonados = new ArrayList();
        try {
            abonados = x.unaSemanaParaCaducar();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido encontrar los abonos que caducan en 1 semana");
            System.out.println(sqle.getMessage());
        }
        return abonados;
    }
       public static ArrayList<AbonadoVO> unMesCaducan(int mes) {
        AbonadoDAO x = new AbonadoDAO();
        ArrayList<AbonadoVO> abonados = new ArrayList();
        try {
            abonados = x.unMesParaCaducar(mes);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido encontrar los abonos que caducan en este mes");
            System.out.println(sqle.getMessage());
        }
        return abonados;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="COMUNICACIÓN CON TABLA VEHÍCULO">
    public static void insertarVehiculo(VehiculoVO vehiculo) {
        VehiculoDAO estandar = new VehiculoDAO();
        PlazaDAO ocupar = new PlazaDAO();
        PlazaVO ocupada = new PlazaVO();
        try {
            estandar.insertVehiculo(vehiculo);
            
            ocupada.setCodPlaza(vehiculo.getCodPlaza());
            ocupada.setOcupado(true);
            
            
            
            ocupar.updatePlaza(vehiculo.getCodPlaza(), ocupada);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido introducir el vehiculo:");
            System.out.println(sqle.getMessage());
        }
    }

    public static VehiculoVO obtenerVehiculoSegunPk(String pk) {
        VehiculoDAO vehiculo = new VehiculoDAO();
        VehiculoVO obtenido = new VehiculoVO();
        try {
            return obtenido = vehiculo.findByPk(pk);
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
            new VehiculoDAO().deleteVehiculo();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar la tabla:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void borrarVehiculo(VehiculoVO vehiculo) {
        try {
            new VehiculoDAO().deleteVehiculo(vehiculo);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar al vehiculo:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void cambiarVehiculo(String pk, VehiculoVO nuevosDatos) {
        try {
            new VehiculoDAO().updateVehiculo(pk, nuevosDatos);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al vehiculo:");
            System.out.println(sqle.getMessage());
        }
    }

    public static int ultimoVehiculo(VehiculoVO y) {
        VehiculoDAO x = new VehiculoDAO();
        int resultado = 0;
        try {
            resultado = x.hallarPlaza(y);
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
            System.out.println("No se ha podido introducir el ticket:");
            System.out.println(sqle.getMessage());
        }
    }
     public static void insertarTicketAbonado(TicketVO ticket) {
        TicketDAO estandar = new TicketDAO();
        try {
            estandar.insertTicketAbonado(ticket);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido introducir el ticket:");
            System.out.println(sqle.getMessage());
        }
    }
     public static void reservar(int codplaza) {
        PlazaDAO estandar = new PlazaDAO();
        try {
            estandar.reservar(codplaza);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido introducir el ticket:");
            System.out.println(sqle.getMessage());
        }
    }

    public static TicketVO obtenerTicketSegunPk(int pk) {
        TicketDAO ticket = new TicketDAO();
        TicketVO obtenido = new TicketVO();
        try {
            return obtenido = ticket.findByPk(pk);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener el ticket según la pk");
            System.out.println(sqle.getMessage());
        }
        return obtenido;
    }
     public static TicketVO obtenerTicketSegunMatricula(String matricula) {
        TicketDAO ticket = new TicketDAO();
        TicketVO obtenido = new TicketVO();
        try {
            return obtenido = ticket.buscarSegunMatricula(matricula);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener el ticket según la pk");
            System.out.println(sqle.getMessage());
        }
        return obtenido;
    }
       public static List<TicketVO> obtenerTicketEntreDosFechas(LocalDate x , LocalDate y ) {
        TicketDAO ticket = new TicketDAO();
        List<TicketVO> obtenidos = new ArrayList();
        try {
            return obtenidos = ticket.hallarTicketsPorFechas(x, y);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener el ticket según la pk");
            System.out.println(sqle.getMessage());
        }
        return obtenidos;
    }

    public static List<TicketVO> obtenerTickets() {
        List<TicketVO> listado = new ArrayList();
        try {
            return listado = new TicketDAO().getAll();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener la lista de Tickets");
            System.out.println(sqle.getMessage());
        }
        return listado;
    }
     public static int obtenerUltimoTicket() {
        TicketDAO x = new TicketDAO();
        int y = 0;
        try {
             y = x.ultimoTicket();
            return y;
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener el Tickets");
            System.out.println(sqle.getMessage());
        }
        return y;
    }

    public static void borrarTicketAbonado() {
        try {
            new TicketDAO().deleteTicket();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar el ticket:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void borrarTicket(TicketVO ticket) {
        try {
            new TicketDAO().deleteTicket(ticket);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar el ticket:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void cambiarTicket(int pk, TicketVO nuevosDatos) {
        try {
            new TicketDAO().updateTicket(pk, nuevosDatos);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar el ticket:");
            System.out.println(sqle.getMessage());
        }
    }

    public static int ultimoTicket() {
        TicketDAO x = new TicketDAO();
        int resultado = 0;
        try {
            resultado = x.hallarCodTicket();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido encontrar el último ticket");
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="COMUNICACIÓN CON TABLA PLAZA">
    public static void insertarPlaza(PlazaVO plaza) {
        PlazaDAO estandar = new PlazaDAO();
        try {
            estandar.insertPlaza(plaza);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido introducir la plaza:");
            System.out.println(sqle.getMessage());
        }
    }

    public static PlazaVO obtenerPlazaSegunPk(int pk) {
        PlazaDAO plaza = new PlazaDAO();
        PlazaVO obtenido = new PlazaVO();
        try {
            return obtenido = plaza.findByPk(pk);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener la plaza según la pk");
            System.out.println(sqle.getMessage());
        }
        return obtenido;
    }

    public static List<PlazaVO> obtenerPlazas() {
        List<PlazaVO> listado = new ArrayList();
        try {
            return listado = new PlazaDAO().getAll();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido obtener la lista de Plazas");
            System.out.println(sqle.getMessage());
        }
        return listado;
    }

    public static void borrarTablaPlaza() {
        try {
            new PlazaDAO().deletePlaza();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar la tabla:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void borrarPlaza(PlazaVO plaza) {
        try {
            new PlazaDAO().deletePlaza(plaza);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido borrar la plaza:");
            System.out.println(sqle.getMessage());
        }
    }

    public static void cambiarPlaza(int pk, PlazaVO nuevosDatos) {
        try {
            new PlazaDAO().updatePlaza(pk, nuevosDatos);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }
    public static void vaciarParkingCompletamente() {
        try {
            new PlazaDAO().vaciarParkingCompletamente();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }
    public static void vaciarParkingSinAbonados() {
        try {
            new PlazaDAO().vaciarParkingSinQuitarReservas();
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }
     public static void sacarVehiculoPlaza(int pk, VehiculoVO x) {
        try {
            new PlazaDAO().sacarVehiculoParkingNormal(pk, x);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }
    } public static void sacarVehiculoAbonadoPlaza(int pk, VehiculoVO x) {
        try {
            new PlazaDAO().sacarVehiculoParkingAbonado(pk, x);
        } catch (SQLException sqle) {
            System.out.println("No se ha podido modificar al abonado:");
            System.out.println(sqle.getMessage());
        }
    }


    public static int ultimaPlaza() {
        PlazaDAO x = new PlazaDAO();
        int resultado = 0;
        try {
            resultado = x.hallarCodPlaza();

        } catch (SQLException sqle) {
            System.out.println("No se ha podido encontrar la última plaza");
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="ENVIAR EMAILS">
    public static void enviarEmailUnaSemana(ArrayList<AbonadoVO> abonados) {
        // ESTE MÉTODO ENVIARÁ UN EMAIL A LOS ABONADOS QUE ESTÉN APUNTO DE CADUCAR
        String email;
        for (AbonadoVO x : abonados) {
            email = x.getEmail();
            System.out.println("Enviando email a " + email);
        }
        JOptionPane.showConfirmDialog(null, "Emails enviados");
    }

    public static void enviarEmailUnMes(ArrayList<AbonadoVO> abonados) {
        // ESTE MÉTODO ENVIARÁ UN EMAIL A LOS ABONADOS QUE ESTÉN APUNTO DE CADUCAR
        String email;
        for (AbonadoVO x : abonados) {
            email = x.getEmail();
            System.out.println("Enviando email a " + email);
        }
        JOptionPane.showMessageDialog(null, "Email enviado");
    }
    //</editor-fold>

    public static void main(String[] args) {
     EnviarDatos.vaciarParkingCompletamente();

    }

}
