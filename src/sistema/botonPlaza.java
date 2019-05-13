/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author jose
 */
public class botonPlaza extends JButton {
    
     private boolean ocupada;
     private boolean reservada;
     
     public botonPlaza() {
        this.ocupada = false;
        this.setBackground(Color.white);
    }
      public void ocupar(){
        this.ocupada=true;
        this.setBackground(Color.black);
    }
    public void vaciar(){
        this.ocupada=true;
        this.setBackground(Color.white);
    }

    public boolean estaOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean estaReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
    
     
     
}
