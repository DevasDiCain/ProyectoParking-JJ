/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

/**
 *
 * @author jose
 */
public class AbonadoVO {

    private int pk;
    private LocalDate FechaNacimiento;
    private String dni, nombre, email;
    private String numTarjeta;
    private String tipoDeAbono;
    private LocalDate feciniabo;
    private LocalDate fecfinabo;
    private String matricula;

  

    public AbonadoVO() {
        this.pk= EnviarDatos.ultimoAbonado();
    }
    public AbonadoVO(String especial){}
        
    public AbonadoVO(String nombre,String tipoDeAbono, LocalDate fecfinabo,LocalDate FechaNacimiento, String dni, String email, String numTarjeta,LocalDate feciniabo, String matricula) {
        this.pk = EnviarDatos.ultimoAbonado();
        this.FechaNacimiento = FechaNacimiento;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.numTarjeta = numTarjeta;
        this.tipoDeAbono = tipoDeAbono;
        this.feciniabo = feciniabo;
        this.fecfinabo = fecfinabo;
        this.matricula = matricula;
    }

   
    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public LocalDate getFeciniabo() {
        return feciniabo;
    }

    public void setFeciniabo(LocalDate feciniabo) {
        this.feciniabo = feciniabo;
    }

    public LocalDate getFecfinabo() {
        return fecfinabo;
    }

    public void setFecfinabo(LocalDate fecfinabo) {
        this.fecfinabo = fecfinabo;
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


    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDeAbono() {
        return tipoDeAbono;
    }

    public void setTipoDeAbono(String tipoDeAbono) {
        this.tipoDeAbono = tipoDeAbono;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.dni);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Integer.parseInt(this.numTarjeta);
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
        return "AbonadoVO{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + ", email=" + email + ", numTarjeta=" + numTarjeta + ", tipoDeAbono=" + tipoDeAbono + '}';
    }
    public static void main(String[] args) {
        AbonadoVO apestoso = new AbonadoVO();
        apestoso.setFecfinabo(LocalDate.of(1995, Month.MARCH, 12));
        System.out.println(apestoso.getFecfinabo());
    }

}
