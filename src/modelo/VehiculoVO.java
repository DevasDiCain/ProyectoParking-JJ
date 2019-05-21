/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author juan
 */
public class VehiculoVO {
    private String matricula;
    private TipoVehiculo tipoVehiculo;
    private int codPlaza;
    private enum TipoVehiculo {
        TURISMO,
        MOTOCICLETA,
        CARAVANA
    }
    
    public VehiculoVO(){
    }

    public VehiculoVO(String matricula, TipoVehiculo tipoVehiculo, int codPlaza) {
        this.matricula = matricula;
        this.tipoVehiculo = tipoVehiculo;
        this.codPlaza = codPlaza;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCodPlaza() {
        return codPlaza;
    }

    public void setCodPlaza(int codPlaza) {
        this.codPlaza = codPlaza;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.matricula);
        hash = 71 * hash + Objects.hashCode(this.tipoVehiculo);
        hash = 71 * hash + this.codPlaza;
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
        final VehiculoVO other = (VehiculoVO) obj;
        if (this.codPlaza != other.codPlaza) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (this.tipoVehiculo != other.tipoVehiculo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VehiculoVO{" + "matricula=" + matricula + ", tipoVehiculo=" + tipoVehiculo + ", codPlaza=" + codPlaza + '}';
    }
}