/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author jose
 */
public class AbonadoVO {

    private int pk;
    private LocalDate FechaNacimiento;
    private String dni, nombre, apellidos, email;
    private int numTarjeta;
    private TipoAbono tipoDeAbono;

    private enum TipoAbono {
        MENSUAL,
        TRIMESTRAL,
        SEMETRAL,
        ANUAL
    }

    public AbonadoVO() {
    }

    public AbonadoVO(String dni, String nombre, String apellidos, String email, int numTarjeta, TipoAbono tipoDeAbono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.numTarjeta = numTarjeta;
        this.tipoDeAbono = tipoDeAbono;
    }
    public AbonadoVO(int pk, String nombre, LocalDate FechaNacimiento){
        this.pk= pk;
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
    }
    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
     public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.dni);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellidos);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + this.numTarjeta;
        hash = 47 * hash + Objects.hashCode(this.tipoDeAbono);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbonadoVO other = (AbonadoVO) obj;
        if (this.numTarjeta != other.numTarjeta) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (this.tipoDeAbono != other.tipoDeAbono) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AbonadoVO{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", numTarjeta=" + numTarjeta + ", tipoDeAbono=" + tipoDeAbono + '}';
    }

}
