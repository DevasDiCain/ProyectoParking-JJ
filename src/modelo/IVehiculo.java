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
public interface IVehiculo {
     // Método para obtener todos los registros de la tabla
    List<VehiculoVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    VehiculoVO findByPk(int pk) throws SQLException;
    
    // Método para insertar un registro
    int insertVehiculo (VehiculoVO vehiculo) throws SQLException;
    
    // Método para insertar varios registros
    int insertVehiculo (List<VehiculoVO> lista) throws SQLException;
    
    // Método para borrar una persona
    int deleteVehiculo (VehiculoVO p) throws SQLException;
    
    // Método para borrar toda la tabla
    int deleteVehiculo() throws SQLException;
    
    // Método para modificar una persona. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updateVehiculo (int pk, VehiculoVO nuevosDatos) throws SQLException;
}
