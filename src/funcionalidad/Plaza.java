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
public class Plaza {
    private boolean ocupado;
    private boolean reservado;
    private TipoPlaza tipo;
    private enum TipoPlaza {
        TURISMO,
        MOTOCICLETA,
        CARAVANA
    }
}