/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jose
 */
public class PlazaVO {

    private int codPlaza;
    private boolean ocupado;
    private boolean reservado;
    private String tipoPlaza;

    public PlazaVO() {
    }

    public PlazaVO(int codPlaza, boolean ocupado, boolean reservado, String tipoPlaza) {
        this.codPlaza = codPlaza;
        this.ocupado = ocupado;
        this.reservado = reservado;
        this.tipoPlaza = tipoPlaza;
    }

    public int getCodPlaza() {
        return codPlaza;
    }

    public void setCodPlaza(int codPlaza) {
        this.codPlaza = codPlaza;
    }

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

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }

    @Override
    public String toString() {
        return "PlazaVO{" + "codPlaza=" + codPlaza + ", ocupado=" + ocupado + ", reservado=" + reservado + ", tipoPlaza=" + tipoPlaza + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.codPlaza;
        hash = 23 * hash + (this.ocupado ? 1 : 0);
        hash = 23 * hash + (this.reservado ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.tipoPlaza);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlazaVO other = (PlazaVO) obj;
        if (this.codPlaza != other.codPlaza) {
            return false;
        }
        if (this.ocupado != other.ocupado) {
            return false;
        }
        if (this.reservado != other.reservado) {
            return false;
        }
        if (this.tipoPlaza != other.tipoPlaza) {
            return false;
        }
        return true;
    }

    public static int turismosLibres() {
        List<PlazaVO> lista = EnviarDatos.obtenerPlazas();
       int turismos = 0;
        for (PlazaVO x : lista) {
            if (x.getTipoPlaza().equals("turismo")) {
                if (!x.isOcupado()) {
                    turismos++;
                }
            }
        }
        return turismos;
    }

    public static int caravanasLibres( ) {
       List<PlazaVO> lista = EnviarDatos.obtenerPlazas();
        int caravanas = 0;
        System.out.println(lista.size());
        for (PlazaVO x : lista) {
            System.out.println(x);
            if (x.getTipoPlaza().equals("caravana")) {
                if (!x.isOcupado()) {
                    caravanas++;
                }
            }
        }
        return caravanas;
    }

    public static int motocicletasLibres() {
        List<PlazaVO> lista = EnviarDatos.obtenerPlazas();
        int motos = 0;
        for (PlazaVO x : lista) {
            if (x.getTipoPlaza().equals("motocicleta")) {
                if (!x.isOcupado()) {
                    motos++;
                }
            }
        }
        return motos;
    }
   

}
