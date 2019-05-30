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
public interface IAbonado {
     // Método para obtener todos los registros de la tabla
    List<AbonadoVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    AbonadoVO findByPk(int pk) throws SQLException;
    
    // Método para insertar un registro
    int insertPersona (AbonadoVO persona) throws SQLException;
    
    // Método para insertar varios registros
    int insertPersona (List<AbonadoVO> lista) throws SQLException;
    
    // Método para borrar una persona
    int deletePersona (AbonadoVO p) throws SQLException;
    
    // Método para borrar toda la tabla
    int deleteFullPersona() throws SQLException;
    
    // Método para modificar una persona. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updatePersona (int pk, AbonadoVO nuevosDatos) throws SQLException;
    
    int hallarPk()throws SQLException;
}
