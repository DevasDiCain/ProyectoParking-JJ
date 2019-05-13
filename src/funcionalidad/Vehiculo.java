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
    private String matricula;
    private TipoVehiculo tipo;
    enum TipoVehiculo{
        TURISMO,
        MOTOCICLETA,
        CARAVANA
    }
}
