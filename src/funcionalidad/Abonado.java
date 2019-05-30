/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Abonado {

    // Atributos
    private int pk;//Será la clave primaria
    private LocalDate FechaNacimiento;
    private String dni, nombre, apellidos, email;
    private int numTarjeta;//Dnd se realizará el cobro
    private TipoAbono tipoDeAbono;

    private enum TipoAbono {
        MENSUAL,
        TRIMESTRAL,
        SEMETRAL,
        ANUAL
    }

    public static String generarPin(String matricula) {
        String pin;
        pin = String.valueOf(matricula.charAt(0));
        pin = pin + String.valueOf(matricula.charAt(4));
        pin = pin + String.valueOf(matricula.charAt(5));
        pin = pin + String.valueOf(matricula.charAt(2));
        pin = pin + String.valueOf(matricula.charAt(3));
        pin = pin + String.valueOf(matricula.charAt(4)); 
        File archivo = new File("pin/" + matricula + ".txt");
        File directorio = new File("pin");

        if (!directorio.exists()){
            new File("/path/directory").mkdirs();
        }
        if (!archivo.exists()){
            String idfichero = "pin/" + matricula + ".txt";
            try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {
                flujo.write(pin);
                flujo.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return pin.toUpperCase();
    }
    
    public static String generarPin(String matricula, String dni) {
        String pin;
        pin = String.valueOf(matricula.charAt(0));
        pin = pin + String.valueOf(matricula.charAt(4));
        pin = pin + String.valueOf(matricula.charAt(5));
        pin = pin + String.valueOf(matricula.charAt(2));
        pin = pin + String.valueOf(matricula.charAt(3));
        pin = pin + String.valueOf(matricula.charAt(4)); 
        
        File archivo = new File("pin/" + dni + ".txt");
        File directorio = new File("pin");
        if (!directorio.exists()){
            new File("/path/directory").mkdirs();
        }
        if (!archivo.exists()){
            String idfichero = "pin/" + dni + ".txt";
            try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {
                flujo.write(pin);
                flujo.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return pin.toUpperCase();
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
    public Abonado() {
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
