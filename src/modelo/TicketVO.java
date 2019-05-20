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
 * @author juan
 */
public class TicketVO {
    private int codTicket;
    private int codPlaza;
    private String matricula;
    private LocalDate fecha;
    private int importe;
    private String pin;
    
    public TicketVO(){
    }

    public TicketVO(int codTicket, int codPlaza, String matricula, LocalDate fecha, int importe, String pin) {
        this.codTicket = codTicket;
        this.codPlaza = codPlaza;
        this.matricula = matricula;
        this.fecha = fecha;
        this.importe = importe;
        this.pin = pin;
    }

    public int getCodTicket() {
        return codTicket;
    }

    public void setCodTicket(int codTicket) {
        this.codTicket = codTicket;
    }

    public int getCodPlaza() {
        return codPlaza;
    }

    public void setCodPlaza(int codPlaza) {
        this.codPlaza = codPlaza;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codTicket;
        hash = 37 * hash + this.codPlaza;
        hash = 37 * hash + Objects.hashCode(this.matricula);
        hash = 37 * hash + Objects.hashCode(this.fecha);
        hash = 37 * hash + this.importe;
        hash = 37 * hash + Objects.hashCode(this.pin);
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
        final TicketVO other = (TicketVO) obj;
        if (this.codTicket != other.codTicket) {
            return false;
        }
        if (this.codPlaza != other.codPlaza) {
            return false;
        }
        if (this.importe != other.importe) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.pin, other.pin)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TicketVO{" + "codTicket=" + codTicket + ", codPlaza=" + codPlaza + ", matricula=" + matricula + ", fecha=" + fecha + ", importe=" + importe + ", pin=" + pin + '}';
    }
    
    
}
