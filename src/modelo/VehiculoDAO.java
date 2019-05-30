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
public class VehiculoDAO implements IVehiculo {

    private Connection con = null;

    public VehiculoDAO() {
        con = Conexion.getInstance();
    }

    @Override
    public List<VehiculoVO> getAll() throws SQLException {
        List<VehiculoVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from Vehiculo");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                VehiculoVO p = new VehiculoVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setMatricula(res.getString("matricula"));
                //p.setTipoVehiculo(res.getObject("tipoVehiculo"));
                p.setCodPlaza((res.getInt("codplaza")));

                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }

        return lista;
    }

    @Override
    public VehiculoVO findByPk(String pk) throws SQLException {

        ResultSet res = null;
        VehiculoVO vehiculo = new VehiculoVO();

        String sql = "select * from Vehiculo where matricula=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setString(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.first()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                vehiculo.setMatricula(res.getString("matricula"));
                vehiculo.setTipoVehiculo(res.getString("tipoVehiculo"));
                vehiculo.setCodPlaza((res.getInt("codplaza")));
                return vehiculo;
            }

            return null;
        }
    }
    

    @Override
    public int insertVehiculo(VehiculoVO vehiculo) throws SQLException {

        int numFilas = 0;
        String sql = "insert into Vehiculo values (?,?,?)";

        if (findByPk(vehiculo.getMatricula()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, vehiculo.getMatricula());
                prest.setString(2, vehiculo.getTipoVehiculo());
                prest.setInt(3, vehiculo.getCodPlaza());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertVehiculo(List<VehiculoVO> lista) throws SQLException {
        int numFilas = 0;

        for (VehiculoVO tmp : lista) {
            numFilas += insertVehiculo(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteVehiculo() throws SQLException {

        String sql = "delete from Vehiculo";

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
    public int deleteVehiculo(VehiculoVO vehiculo) throws SQLException {
        int numFilas = 0;

        String sql = "delete from Vehiculo where codvehiculo = ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setString(1, vehiculo.getMatricula());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updateVehiculo(String pk, VehiculoVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update Vehiculo set matricula = ?,tipoVehiculo = ? where codplaza = ?";

        if (findByPk(pk) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, nuevosDatos.getMatricula());
                prest.setString(2, nuevosDatos.getTipoVehiculo());
                prest.setInt(3, nuevosDatos.getCodPlaza());

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

    public static int turismosLibres() {
        List<PlazaVO> listaDePlazas = EnviarDatos.obtenerPlazas();
        int numeroVehiculosLibres = 1;
        for (int x = 1; x < listaDePlazas.size(); x++) {
            if (!listaDePlazas.get(x).isOcupado() && !listaDePlazas.get(x).isReservado() && listaDePlazas.get(x).getTipoPlaza().equals("turismo")){
                numeroVehiculosLibres++;
            }
        }
        return numeroVehiculosLibres;
    }
    
    public static int motocicletasLibres() {
        List<PlazaVO> listaDePlazas = EnviarDatos.obtenerPlazas();
        int numeroVehiculosLibres = 0;
        for (int x = 1; x < listaDePlazas.size(); x++) {
            if (!listaDePlazas.get(x).isOcupado() && !listaDePlazas.get(x).isReservado() && listaDePlazas.get(x).getTipoPlaza().equals("motocicleta")){
                numeroVehiculosLibres++;
            }
        }
        return numeroVehiculosLibres;
    }
    
    public static int caravanasLibres() {
        List<PlazaVO> listaDePlazas = EnviarDatos.obtenerPlazas();
        int numeroVehiculosLibres = 0;
        for (int x = 1; x < listaDePlazas.size(); x++) {
            if (!listaDePlazas.get(x).isOcupado() && !listaDePlazas.get(x).isReservado() && listaDePlazas.get(x).getTipoPlaza().equals("caravana")){
                numeroVehiculosLibres++;
            }
        }
        return numeroVehiculosLibres;
    }

    @Override
    public int hallarPlaza(VehiculoVO x) throws SQLException {

        int numFilas = 0;

        String sql = "select ifnull(max(codplaza),0) as Ultimo from Plaza where tipoPlaza = ? and ocupado= false";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setString(1, x.getTipoVehiculo());
            // Ejecutamos la sentencia
            ResultSet r = prest.executeQuery();
            r.next();
            numFilas = r.getInt("Ultimo");
        }
        return numFilas;
    }
}
    
       