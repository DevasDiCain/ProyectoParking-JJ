/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author jose
 */
public class botonPlaza extends JButton {

    private boolean ocupada;
    private boolean reservada;

    private final Border reservado = new LineBorder(Color.red);
    private final Border noReservado = new LineBorder(Color.black);
    public botonPlaza(int tipo) {//1- caravansa
        //2 -turismos
        //3-motos
        this.ocupada = false;
        switch (tipo) {
            case 1:
                this.setBackground(Color.white);

                break;
            case 2:
                this.setBackground(Color.yellow);
                break;

            case 3:
                this.setBackground(Color.blue);
                break;
        }

        if (ocupada) {
            this.setText("X");
        }
        if (!ocupada) {
            this.setText("O");
        }
        if (reservada) {
            this.setBorder(reservado);
        }

    }

    public void ocupar() {
        if (ocupada) {
            System.out.println("La plaza ya está ocupada");
        } else {
            this.ocupada = true;
            this.setText("X");
        }
    }

    public void vaciar() {
        if (!ocupada) {
            System.out.println("La plaza ya está vacía");
        } else {
            this.ocupada = false;
            this.setText("O");
        }
    }

    public void reservar() {
        if(reservada){System.out.println("Esta plaza ya está reservada");}
        else{
            this.reservada=true;
            this.setBorder(reservado);
        }
    }

    public void quitarReserva() {
        if(!reservada){System.out.println("Esta plaza no está reservada");}
        else{
                this.reservada=false;
                this.setBorder(noReservado);
        }
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

    public void ocupar(int i , int j,botonPlaza boton) {
        if (boton.ocupada) {
            System.out.println("La plaza ya está ocupada");
        } else {
            boton.ocupada = true;
            boton.setText("X");
        }
    }

    public void vaciar(int i, int j ,botonPlaza boton) {
        if (!boton.ocupada) {
            System.out.println("La plaza ya está vacía");
        } else {
            boton.ocupada = false;
            boton.setText("O");
        }
    }

    public void reservar(int i , int j, botonPlaza boton) {
        if(boton.reservada){System.out.println("Esta plaza ya está reservada");}
        else{
            boton.reservada=true;
            boton.setBorder(reservado);
        }
    }

    public void quitarReserva(int i , int j, botonPlaza boton) {
        if(!boton.reservada){System.out.println("Esta plaza no está reservada");}
        else{
                boton.reservada=false;
                boton.setBorder(noReservado);
        }
    }

}
