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
    String dni;
    String nombre;
    String apellidos;
    int numTarjeta;
    enum tipoAbono {
        MENSUAL,
        TRIMESTRAL,
        SEMETRAL,
        ANUAL
    }
}
