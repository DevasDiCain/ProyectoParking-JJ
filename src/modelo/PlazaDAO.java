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
public class PlazaDAO implements IPlaza {

    private Connection con = null;

    public PlazaDAO(){
        con = Conexion.getInstance();
    }

    @Override
    public List<PlazaVO> getAll() throws SQLException {
        List<PlazaVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from Plaza");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                PlazaVO p = new PlazaVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setCodPlaza(res.getInt("codplaza"));
                p.setOcupado(res.getBoolean("ocupado"));
                p.setReservado(res.getBoolean("reservado"));
                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }
        return lista;
    }

   
    @Override
    public PlazaVO findByPk(int codPlaza) throws SQLException {

        ResultSet res = null;
        PlazaVO plaza = new PlazaVO();

        String sql = "select * from Plaza where codplaza=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, codPlaza);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.first()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                plaza.setCodPlaza(res.getInt("codplaza"));
                plaza.setOcupado(res.getBoolean("ocupado"));
                plaza.setReservado(res.getBoolean("reservado"));
                return plaza;
            }

            return null;
        }
    }

    @Override
    public int insertPlaza(PlazaVO plaza) throws SQLException {

        int numFilas = 0;
        String sql = "insert into Abonado values (?,?,?,?,?,?,?,?,?,?)";

        if (findByPk(plaza.getCodPlaza()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
          
                prest.setInt(1, plaza.getCodPlaza());
                prest.setBoolean(2, plaza.isOcupado());
                prest.setBoolean(3, plaza.isReservado());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    @Override
    public int insertPlaza(List<PlazaVO> lista) throws SQLException {
        int numFilas = 0;

        for (PlazaVO tmp : lista) {
            numFilas += insertPlaza(tmp);
        }

        return numFilas;
    }

    @Override
    public int deletePlaza() throws SQLException {

        String sql = "delete from Plaza";

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
    public int deletePlaza(PlazaVO plaza) throws SQLException {
        int numFilas = 0;

        String sql = "delete from Plaza where codplaza = ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, plaza.getCodPlaza());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updatePlaza(int codPlaza, PlazaVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update Plaza set nombre = ?,abono = ?, feciniabo = ? , fecfinabo = ?, fecnacimiento = ? , dni = ? , email = ?, numTarjeta = ? , matricula = ? where codplaza=?";

        if (findByPk(codPlaza) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
               
                prest.setInt(1, nuevosDatos.getCodPlaza());
                prest.setBoolean(2, nuevosDatos.isOcupado());
                prest.setBoolean(3, nuevosDatos.isReservado());

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

}

