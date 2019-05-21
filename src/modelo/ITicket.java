/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author jose
 */
public interface ITicket {
     // Método para obtener todos los registros de la tabla
    List<TicketVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    TicketVO findByPk(int codticket) throws SQLException;
    
    // Método para insertar un registro
    int insertTicket (TicketVO ticket) throws SQLException;
    
    // Método para insertar varios registros
    int insertTicket (List<TicketVO> lista) throws SQLException;
    
    // Método para borrar una persona
    int deleteTicket (TicketVO ticket) throws SQLException;
    
    // Método para borrar toda la tabla
    int deleteTicket() throws SQLException;
    
    // Método para modificar un ticket. Se modifica al ticket que tenga esa 'pk'
    // con los nuevos datos que traiga el ticket 'nuevosDatos'
    int updateTicket (int codTicket, TicketVO nuevosDatos) throws SQLException;
}
