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
public class Vehiculo {

    // Atributos
    private String matricula;
    private TipoVehiculo tipoDeVehiculo;

    enum TipoVehiculo {
        TURISMO,
        MOTOCICLETA,
        CARAVANA
    }

    public static TipoVehiculo conversion(String vehiculo) {
        TipoVehiculo converso = TipoVehiculo.TURISMO;
        if (vehiculo.equals("turismo") || vehiculo.equals("Turismo") || vehiculo.equals("TURISMO")) {
            converso = TipoVehiculo.TURISMO;
        }
        if (vehiculo.equals("motocicleta") || vehiculo.equals("Motocicleta") || vehiculo.equals("MOTOCICLETA")) {
            converso = TipoVehiculo.MOTOCICLETA;
        }
        if (vehiculo.equals("caravana") || vehiculo.equals("Caravana") || vehiculo.equals("CARAVANA")) {
            converso = TipoVehiculo.CARAVANA;
        }
        return converso;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoVehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(TipoVehiculo tipo) {
        this.tipoDeVehiculo = tipo;
    }

    public Vehiculo(String matricula, TipoVehiculo tipo) {
        this.matricula = matricula;
        this.tipoDeVehiculo = tipo;
    }

    // Constructor
    public Vehiculo() {
        this.matricula = "123456789";
    }
}
