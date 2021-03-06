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
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class PlazaDAO implements IPlaza {

    private Connection con = null;

    public PlazaDAO() {
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
                p.setTipoPlaza(res.getString("tipoPlaza"));                //Añadimos el objeto a la lista
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
                plaza.setTipoPlaza(res.getString("tipoPlaza"));

                return plaza;
            }

            return plaza;
        }
    }

    @Override
    public int insertPlaza(PlazaVO plaza) throws SQLException {

        int numFilas = 0;
        String sql = "insert into Plaza values (?,?,?,?)";

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
                prest.setString(4, plaza.getTipoPlaza());

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
        String sql = "update Plaza set  ocupado = ?, reservado= ? where codplaza=?";
        if (findByPk(codPlaza) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setBoolean(1, nuevosDatos.isOcupado());
                prest.setBoolean(2, nuevosDatos.isReservado());
                prest.setInt(3, nuevosDatos.getCodPlaza());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    public void sacarVehiculoParkingNormal(int codPlaza, VehiculoVO x) throws SQLException {

        int numFilas = 0;
        String sql = "update Plaza set  ocupado = ?, reservado= ? where codplaza=?";
        if (findByPk(codPlaza) == null) {
            // La persona a actualizar no existe
            JOptionPane.showMessageDialog(null, "El vehículo introducido no existe");
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setBoolean(1,false);
                prest.setBoolean(2, false);
                prest.setInt(3, x.getCodPlaza());

                numFilas = prest.executeUpdate();
            }
            
        }
    }
     public void vaciarParkingCompletamente() throws SQLException {

        int numFilas = 0;
        String sql = "update Plaza set  ocupado = false, reservado= false";
       
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                

                numFilas = prest.executeUpdate();
            }
            
        
    }
      public void vaciarParkingSinQuitarReservas() throws SQLException {

        int numFilas = 0;
        String sql = "update Plaza set  ocupado = ?, reservado= ? where codplaza=?";
       
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                

                numFilas = prest.executeUpdate();
            }
            
        }
    
     public int sacarVehiculoParkingAbonado(int codPlaza, VehiculoVO x) throws SQLException {

        int numFilas = 0;
        String sql = "update Plaza set  ocupado = ?, reservado= ? where codplaza=?";
        if (findByPk(codPlaza) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setBoolean(1,false);
                prest.setBoolean(2, true);
                prest.setInt(3, x.getCodPlaza());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }
      public void reservar(int codPlaza) throws SQLException {

        int numFilas = 0;
        String sql = "update Plaza set   ocupado =false , reservado= true where codplaza=?";
        
       
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia

                prest.setInt(1, codPlaza);
                numFilas = prest.executeUpdate();
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

    public int hallarCodPlaza() throws SQLException {
        int r = 0;
        try (Statement st = con.createStatement()) {
            ResultSet res = st.executeQuery("select max(codplaza)+1 from Plaza");
            res.next();
            return res.getInt(1);
        }
    }
}
