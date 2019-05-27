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
    private int id;
    private boolean ocupado, reservado;
    private String tipo;


    // Getters y Setters
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Constructor parametrizado
    public Plaza(boolean ocupado, boolean reservado, String tipo) {
        this.ocupado = ocupado;
        this.reservado = reservado;
        this.tipo = tipo;
    }
}
