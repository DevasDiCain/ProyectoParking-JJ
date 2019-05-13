/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author jose
 */
public class graficoPlazas {

    // Atributos
    private botonPlaza[][] matriz;
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

    public void ponerPlaza(int i, int j, botonPlaza tmp) {
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
