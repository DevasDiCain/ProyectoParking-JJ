/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author jose
 */
public class PlazaVO {

    private int codPlaza;
    private boolean reservado;
    private boolean ocupado;

  

    public PlazaVO() {
    }

    public PlazaVO(int codPlaza, boolean reservado, boolean ocupado) {
        this.codPlaza = codPlaza;
        this.reservado = reservado;
        this.ocupado = ocupado;
    }

    public int getCodPlaza() {
        return codPlaza;
    }

    public void setCodPlaza(int codPlaza) {
        this.codPlaza = codPlaza;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codPlaza;
        hash = 47 * hash + (this.reservado ? 1 : 0);
        hash = 47 * hash + (this.ocupado ? 1 : 0);
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
        if (this.reservado != other.reservado) {
            return false;
        }
        if (this.ocupado != other.ocupado) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlazaVO{" + "codPlaza=" + codPlaza + ", reservado=" + reservado + ", ocupado=" + ocupado + '}';
    }

    

}
