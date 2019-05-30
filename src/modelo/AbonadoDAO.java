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
public class AbonadoDAO implements IAbonado {

    private Connection con = null;

    public AbonadoDAO(){
        con = Conexion.getInstance();
    }

    @Override
    public List<AbonadoVO> getAll() throws SQLException {
        List<AbonadoVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from Abonado");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                AbonadoVO p = new AbonadoVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setPk(res.getInt("codabonado"));
                p.setNombre(res.getString("nombre"));
                p.setTipoDeAbono((res.getString(2)));
                p.setFeciniabo(res.getDate("feciniabo").toLocalDate());
                p.setFecfinabo(res.getDate("fecfinabo").toLocalDate());
                p.setFechaNacimiento(res.getDate("fecnacimiento").toLocalDate());
                p.setDni(res.getString("dni"));
                p.setEmail(res.getString("email"));
                p.setNumTarjeta(res.getString("numTarjeta"));

                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }

        return lista;
    }

   
    @Override
    public AbonadoVO findByPk(int pk) throws SQLException {

        ResultSet res = null;
        AbonadoVO abonado = new AbonadoVO();

        String sql = "select * from Abonado where codabonado=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.first()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                abonado.setPk(res.getInt("codabonado"));
                abonado.setNombre(res.getString("nombre"));
                abonado.setTipoDeAbono(res.getString(2));
                abonado.setFeciniabo(res.getDate("feciniabo").toLocalDate());
                abonado.setFecfinabo(res.getDate("fecfinabo").toLocalDate());
                abonado.setFechaNacimiento(res.getDate("fecnacimiento").toLocalDate());
                abonado.setDni(res.getString("dni"));
                abonado.setEmail(res.getString("email"));
                abonado.setNumTarjeta(res.getString("numTarjeta"));
                return abonado;
            }

            return null;
        }
    }

    @Override
    public int insertPersona(AbonadoVO abonado) throws SQLException {

        int numFilas = 0;
        String sql = "insert into Abonado values (?,?,?,?,?,?,?,?,?,?)";

        if (findByPk(abonado.getPk()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
             
                prest.setInt(1, abonado.getPk());
                prest.setString(2, abonado.getNombre());
                prest.setString(3, abonado.getTipoDeAbono());
                prest.setDate(4, Date.valueOf(abonado.getFeciniabo()));
                prest.setDate(5, Date.valueOf(abonado.getFecfinabo()));
                prest.setDate(6, Date.valueOf(abonado.getFechaNacimiento()));
                prest.setString(7, abonado.getDni());
                prest.setString(8, abonado.getEmail());
                prest.setString(9, abonado.getNumTarjeta());
                prest.setString(10, abonado.getMatricula());
        

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertPersona(List<AbonadoVO> lista) throws SQLException {
        int numFilas = 0;

        for (AbonadoVO tmp : lista) {
            numFilas += insertPersona(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteFullPersona() throws SQLException {

        String sql = "delete from Abonado";

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
    public int deletePersona(AbonadoVO abonado) throws SQLException {
        int numFilas = 0;

        String sql = "delete * from Abonado where codabonado = ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, abonado.getPk());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updatePersona(int pk, AbonadoVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update Abonado set nombre = ?,abono = ?, feciniabo = ? , fecfinabo = ?, fecnacimiento = ? , dni = ? , email = ?, numTarjeta = ? , matricula = ? where codabonado=?";

        if (findByPk(pk) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
               
                prest.setInt(1, nuevosDatos.getPk());
                prest.setString(2, nuevosDatos.getNombre());
                prest.setString(3, nuevosDatos.getTipoDeAbono());
                prest.setDate(4, Date.valueOf(nuevosDatos.getFeciniabo()));
                prest.setDate(5, Date.valueOf(nuevosDatos.getFecfinabo()));
                prest.setDate(6, Date.valueOf(nuevosDatos.getFechaNacimiento()));
                prest.setString(7, nuevosDatos.getDni());
                prest.setString(8, nuevosDatos.getEmail());
                prest.setString(9, nuevosDatos.getNumTarjeta());
                prest.setString(10, nuevosDatos.getMatricula());

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
    
    public int hallarPk()throws SQLException{
        int r = 0;
        try (Statement st = con.createStatement()) {
            ResultSet res = st.executeQuery("select max(codabonado)+1 from Abonado");
            res.next();
            return res.getInt(1);
        }
    }
      public  ArrayList<AbonadoVO>  unaSemanaParaCaducar() throws SQLException{
        ArrayList<AbonadoVO>abonados = new ArrayList();
        ResultSet res = null;

        String sql = "select * from Abonado where dayofweek(fecfinabo) = dayofweek(curdate()) or dayofweek(curdate())+1";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
          

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

         
            while (res.next()) {
                AbonadoVO p = new AbonadoVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setPk(res.getInt("codabonado"));
                p.setNombre(res.getString("nombre"));
                p.setTipoDeAbono((res.getString(2)));
                p.setFeciniabo(res.getDate("feciniabo").toLocalDate());
                p.setFecfinabo(res.getDate("fecfinabo").toLocalDate());
                p.setFechaNacimiento(res.getDate("fecnacimiento").toLocalDate());
                p.setDni(res.getString("dni"));
                p.setEmail(res.getString("email"));
                p.setNumTarjeta(res.getString("numTarjeta"));


                //Añadimos el objeto a la lista
                abonados.add(p);
            }
            return abonados;
        }
      
    }
       public  ArrayList<AbonadoVO>  unMesParaCaducar(int mes) throws SQLException{
        ArrayList<AbonadoVO>abonados = new ArrayList();
        ResultSet res = null;

        String sql = "select * from Abonado where month(fecfinabo) = ? ";// PREPARAR BIEN ESTA SENTENCIA

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
          
            prest.setInt(1, mes);
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

         
            while (res.next()) {
                AbonadoVO p = new AbonadoVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setPk(res.getInt("codabonado"));
                p.setNombre(res.getString("nombre"));
                p.setTipoDeAbono((res.getString(2)));
                p.setFeciniabo(res.getDate("feciniabo").toLocalDate());
                p.setFecfinabo(res.getDate("fecfinabo").toLocalDate());
                p.setFechaNacimiento(res.getDate("fecnacimiento").toLocalDate());
                p.setDni(res.getString("dni"));
                p.setEmail(res.getString("email"));
                p.setNumTarjeta(res.getString("numTarjeta"));


                //Añadimos el objeto a la lista
                abonados.add(p);
            }
            return abonados;
        }
      
    }
        public AbonadoVO findByMatricula(String matricula) throws SQLException {

        ResultSet res = null;
        AbonadoVO abonado = new AbonadoVO();

        String sql = "select * from Abonado where matricula=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setString(1, matricula);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.first()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                abonado.setPk(res.getInt("codabonado"));
                abonado.setNombre(res.getString("nombre"));
                abonado.setTipoDeAbono(res.getString(2));
                abonado.setFeciniabo(res.getDate("feciniabo").toLocalDate());
                abonado.setFecfinabo(res.getDate("fecfinabo").toLocalDate());
                abonado.setFechaNacimiento(res.getDate("fecnacimiento").toLocalDate());
                abonado.setDni(res.getString("dni"));
                abonado.setEmail(res.getString("email"));
                abonado.setNumTarjeta(res.getString("numTarjeta"));
                return abonado;
            }

            return null;
        }
    }
}
