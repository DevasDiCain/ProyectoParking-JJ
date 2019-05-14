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
    // Atributos
    private String dni,nombre,apellidos,email;
    private int numTarjeta;
    private TipoAbono tipoDeAbono;
    
    private enum TipoAbono {
        MENSUAL,
        TRIMESTRAL,
        SEMETRAL,
        ANUAL
    }

    // Getters y Setters
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

    public TipoAbono getTipoDeAbono() {
        return tipoDeAbono;
    }

    public void setTipoDeAbono(TipoAbono tipoDeAbono) {
        this.tipoDeAbono = tipoDeAbono;
    }
    
    // Constructor por defecto
    public Abonado(){
        dni = "1234567";
        nombre = "nombredefault";
        apellidos = "apellidosdefault";
        numTarjeta = 1111111;
        email = "email@default.com";
    }

    // Constructor parametrizado
    public Abonado(String dni, String nombre, String apellidos, int numTarjeta, TipoAbono tipoDeAbono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numTarjeta = numTarjeta;
        this.tipoDeAbono = tipoDeAbono;
        this.email = email;
    }
}
