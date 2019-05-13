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
    // Atributos
    private boolean ocupado;
    private boolean reservado;
    private TipoPlaza tipo;
    private enum TipoPlaza {
        TURISMO,
        MOTOCICLETA,
        CARAVANA
    }

    // GETTERS y SETTERS 
   public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public TipoPlaza getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlaza tipo) {
        this.tipo = tipo;
    }

    public Plaza(boolean ocupado, boolean reservado, TipoPlaza tipo) {
        this.ocupado = ocupado;
        this.reservado = reservado;
        this.tipo = tipo;
    }
}
