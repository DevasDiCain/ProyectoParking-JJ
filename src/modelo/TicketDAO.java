/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jose
 */
public class TicketDAO implements ITicket {

    private Connection con = null;

    public TicketDAO(){
        con = Conexion.getInstance();
    }

    @Override
    public List<TicketVO> getAll() throws SQLException {
        List<TicketVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from Ticket");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                TicketVO p = new TicketVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setCodTicket(res.getInt("codticket"));
                p.setCodPlaza(res.getInt("codplaza"));
                p.setMatricula(res.getString("matricula"));
                p.setFecha(res.getDate("fecha").toLocalDate());
                p.setImporte(res.getInt("importe"));
                p.setPin(res.getString("pin"));

                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }

        return lista;
    }

   
    @Override
    public TicketVO findByPk(int pk) throws SQLException {

        ResultSet res = null;
        TicketVO ticket = new TicketVO();

        String sql = "select * from Ticket where codticket=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.first()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                ticket.setCodTicket(res.getInt("codticket"));
                ticket.setCodPlaza(res.getInt("codplaza"));
                ticket.setMatricula(res.getString("matricula"));
                ticket.setFecha(res.getDate("fecha").toLocalDate());
                ticket.setImporte(res.getInt("importe"));
                ticket.setPin(res.getString("pin"));
                return ticket;
            }

            return null;
        }
    }

    @Override
    public int insertTicket(TicketVO ticket) throws SQLException {

        int numFilas = 0;
        String sql = "insert into Ticket values (?,?,?,?,?,?,?,?,?,?)";

        if (findByPk(ticket.getCodTicket()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
          
                prest.setInt(1, ticket.getCodTicket());
                prest.setInt(2, ticket.getCodPlaza());
                prest.setString(3, ticket.getMatricula());
                prest.setDate(4, Date.valueOf(ticket.getFecha()));
                prest.setInt(5, ticket.getImporte());
                prest.setString(6, ticket.getPin());
  
                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertTicket(List<TicketVO> lista) throws SQLException {
        int numFilas = 0;

        for (TicketVO tmp : lista) {
            numFilas += insertTicket(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteTicket() throws SQLException {

        String sql = "delete from Ticket";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;

    }

    @Override
    public int deleteTicket(TicketVO ticket) throws SQLException {
        int numFilas = 0;

        String sql = "delete from Ticket where codticket= ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, ticket.getCodTicket());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updateTicket(int pk, TicketVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update Ticket set codticket = ?,codplaza = ?, matricula = ? , fecha = ?, importe = ? , pin = ? where codticket=?";

        if (findByPk(pk) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
               
                prest.setInt(1, nuevosDatos.getCodTicket());
                prest.setInt(2, nuevosDatos.getCodPlaza());
                prest.setString(3, nuevosDatos.getMatricula());
                prest.setDate(4, Date.valueOf(nuevosDatos.getFecha()));
                prest.setInt(5, nuevosDatos.getImporte());
                prest.setString(6, nuevosDatos.getPin());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    public int cambiarNombres(String newName, String oldName) throws SQLException {

        int res = 0;
        // Dos ?, uno para newName y otro para oldName

        String sql = "{call cambiar_nombres (?,?)}";

        // Preparamos la llamada al procedimiento almacenado
        try (CallableStatement call = con.prepareCall(sql)) {
            // Establecemos parámetros a pasar al procedimiento
            call.setString(1, newName);
            call.setString(2, oldName);
            // Ejecutamos el procedimiento
            res = call.executeUpdate();
            
        }
        return res;
    }

    public int hallarCodTicket()throws SQLException{
        int r = 0;
        try (Statement st = con.createStatement()) {
            ResultSet res = st.executeQuery("select max(codticket)+1 from Ticket");
            res.next();
            return res.getInt(1);
        }
    }
    public  ArrayList<TicketVO>  hallarTicketsPorFechas(LocalDate desde, LocalDate hasta) throws SQLException{
        ArrayList<TicketVO>tickets = new ArrayList();
        ResultSet res = null;

        String sql = "select * from Ticket where horaEntrada=? and horaSalida=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setDate(7, Date.valueOf(desde));
            prest.setDate(8, Date.valueOf(hasta));

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

         
            while (res.next()) {
                TicketVO p = new TicketVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setCodTicket(res.getInt("codticket"));
                p.setCodPlaza(res.getInt("codplaza"));
                p.setMatricula(res.getString("matricula"));
                p.setFecha(res.getDate("fecha").toLocalDate());
                p.setImporte(res.getInt("importe"));
                p.setPin(res.getString("pin"));

                //Añadimos el objeto a la lista
                tickets.add(p);
            }
            return null;
        }
      
    }
     public  ArrayList<TicketVO>  hallarTicketsPorAño(LocalDate fecha) throws SQLException{
        ArrayList<TicketVO>tickets = new ArrayList();
        ResultSet res = null;

        String sql = "select * from Ticket where year(fecha) = ?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(4, fecha.getYear()); // ESTO HAY QUE COMPROBAR SI FUNCIONA PORQUE CREO QUE NO SE PUEDE USAR EL YEAR(FECHA) EN EL WHERE

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

         
            while (res.next()) {
                TicketVO p = new TicketVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setCodTicket(res.getInt("codticket"));
                p.setCodPlaza(res.getInt("codplaza"));
                p.setMatricula(res.getString("matricula"));
                p.setFecha(res.getDate("fecha").toLocalDate());
                p.setImporte(res.getInt("importe"));
                p.setPin(res.getString("pin"));

                //Añadimos el objeto a la lista
                tickets.add(p);
            }
            return null;
        }
      
    }
}