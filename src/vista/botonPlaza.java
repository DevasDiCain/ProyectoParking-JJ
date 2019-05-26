/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.Plaza;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import modelo.EnviarDatos;
import modelo.PlazaVO;

/**
 *
 * @author jose
 */
public class botonPlaza extends JButton {

    // Atributo
    private PlazaVO plaza;

    public PlazaVO getPlaza() {
        return plaza;
    }

    private final Border reservado = new LineBorder(Color.red);
    private final Border noReservado = new LineBorder(Color.black);

    // Dibujará cada uno de los botones
    public botonPlaza(int x) {
        // Según el parámetro x (clave primaria), se creará una PlazaVO con los datos
        // de la plaza en esa ubicación (de la 1 a la 45)
        plaza = EnviarDatos.obtenerPlazaSegunPk(x);
        switch (plaza.getTipoPlaza()) {
            case "turismo":
                this.setBackground(Color.red);
                break;

            case "motocicleta":
                this.setBackground(Color.yellow);
                break;

            case "caravana":
                this.setBackground(Color.blue);
                break;
        }
        
        if (plaza.isOcupado()) {
            this.setText("X");
        } else this.setText("O");
        
        if (plaza.isReservado()) {
            this.setBorder(reservado);
        }
    }

    // Hará que el estado de una plaza cambie a ocupado (a no ser que ya esté ocupado)
    public void ocupar() {
        if (plaza.isOcupado()) {
            System.out.println("La plaza ya está ocupada");
        } else {
            plaza.setOcupado(true);
            this.setText("X");
        }
    }

    // Hará que el estado de una plaza cambie a vacío (a no ser que ya esté vacío)
    public void vaciar() {
        if (!plaza.isOcupado()) {
            System.out.println("La plaza ya está vacía");
        } else {
            plaza.setOcupado(false);
            this.setText("O");
        }
    }

    // Reservará plaza, si no lo está ya
    public void reservar() {
        if (plaza.isReservado()) {
            System.out.println("Esta plaza ya está reservada");
        } else {
            plaza.setReservado(true);
            this.setBorder(reservado);
        }
    }

    // Quitará una reserva, si es que hay
    public void quitarReserva() {
        if (!plaza.isReservado()) {
            System.out.println("Esta plaza no está reservada");
        } else {
            plaza.setReservado(false);
            this.setBorder(noReservado);
        }
    }

    // Getters y Setters
    public boolean estaOcupada() {
        return plaza.isOcupado();
    }

    public void setOcupada(boolean ocupada) {
        plaza.setOcupado(ocupada);
    }

    public boolean estaReservada() {
        return plaza.isReservado();
    }

    public void setReservada(boolean reservada) {
        plaza.setReservado(reservada);
    }

    public void ocupar(int i, int j, botonPlaza boton) {
        if (plaza.isOcupado()) {
            System.out.println("La plaza ya está ocupada");
        } else {
            plaza.setOcupado(true);
            boton.setText("X");
        }
    }

    public void vaciar(int i, int j, botonPlaza boton) {
        if (!plaza.isOcupado()) {
            System.out.println("La plaza ya está vacía");
        } else {
            plaza.setOcupado(false);
            boton.setText("O");
        }
    }

    public void reservar(int i, int j, botonPlaza boton) {
        if (plaza.isReservado()) {
            System.out.println("Esta plaza ya está reservada");
        } else {
            plaza.setOcupado(true);
            boton.setBorder(reservado);
        }
    }

    public void quitarReserva(int i, int j, botonPlaza boton) {
        if (!plaza.isReservado()) {
            System.out.println("Esta plaza no está reservada");
        } else {
            plaza.setOcupado(false);
            boton.setBorder(noReservado);
        }
    }

}
