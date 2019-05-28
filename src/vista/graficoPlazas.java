/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import modelo.EnviarDatos;
import modelo.PlazaVO;

/**
 *
 * @author jose
 */
public class graficoPlazas {

    // Atributos
    public static botonPlaza[][] matriz = new botonPlaza[1][1];

    static Object matriz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int contador;

    // Método para dibujar las plazas
    public graficoPlazas(int plazas) {
        matriz = new botonPlaza[plazas][plazas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                botonPlaza tmp = new botonPlaza(1);
                ponerPlaza(i, j, tmp);
            }
        }
    }

    public static void graficoParking(int numeroDePlazas) {
        int contador = 1;
        List<PlazaVO> listaDePlazas = EnviarDatos.obtenerPlazas();
        matriz = new botonPlaza[numeroDePlazas][numeroDePlazas];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (contador < 46) {
                    botonPlaza tmp = new botonPlaza(contador);
                    matriz[i][j] = tmp;
                    contador++;
                } else {
                    botonPlaza tmp = new botonPlaza();
                    matriz[i][j] = tmp;
                }
            }
        }

    }

    public static JPanel crearPanelParking() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 7));
        for (int i = 0; i < graficoPlazas.matriz.length; i++) {
            for (int j = 0; j < graficoPlazas.matriz.length; j++) {
                graficoPlazas.matriz[i][j].setToolTipText(Integer.toString((i+1)) + "," + Integer.toString((j+1)));
                panel.add(graficoPlazas.recuperarBoton(i,j));
            }
        }
        return panel;
    }

    public static botonPlaza recuperarBoton(int i, int j) {
        return matriz[i][j];
    }

    public void ponerPlaza(int i, int j, botonPlaza tmp) {
        matriz[i][j] = tmp;
    }

    public static void ponerPlazas(int i, int j, botonPlaza tmp) {
        matriz[i][j] = tmp;
    }

    public botonPlaza[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(botonPlaza[][] cambio) {
        this.matriz = cambio;
    }

    public void setPlaza(int i, int j, botonPlaza plazas) {
        this.matriz[i][j] = plazas;
    }

    public botonPlaza getPlaza(int i, int j) {
        return matriz[i][j];
    }
}
