/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidad;

/**
 *
 * @author Usuario
 */
public class Abonado {
    private String dni;
    private String nombre;
    private String apellidos;
    private int numTarjeta;
    private TipoAbono tipo;
    private enum TipoAbono {
        MENSUAL,
        TRIMESTRAL,
        SEMETRAL,
        ANUAL
    }
    private String email;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Abonado(){
        dni = "1234567";
        nombre = "nombredefault";
        apellidos = "apellidosdefault";
        numTarjeta = 1111111;
        email = "email@default.com";
    }
}
