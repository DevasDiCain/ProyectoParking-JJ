/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
/**
 *
 * @author juan
 */
public class TicketVO {
    private int codTicket;
    private int codPlaza;
    private String matricula;
    private LocalDate fechaEntrada;
    private double importe;
    private String pin;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private LocalDate fechaSalida;
    
    public TicketVO(){
    }

    public TicketVO(int codTicket, int codPlaza, String matricula, LocalDate fecha, double importe, String pin, LocalTime horaEntrada, LocalTime horaSalida) {
        this.codTicket = codTicket;
        this.codPlaza = codPlaza;
        this.matricula = matricula;
        this.fechaEntrada = fecha;
        this.importe = importe;
        this.pin = pin;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fechaSalida = fechaSalida;
    }

    public int getCodTicket() {
        return codTicket;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
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

 

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codTicket;
        hash = 79 * hash + this.codPlaza;
        hash = 79 * hash + Objects.hashCode(this.matricula);
        hash = 79 * hash + Objects.hashCode(this.pin);
        hash = 79 * hash + Objects.hashCode(this.horaEntrada);
        hash = 79 * hash + Objects.hashCode(this.horaSalida);
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
    
        if (!Objects.equals(this.horaEntrada, other.horaEntrada)) {
            return false;
        }
        if (!Objects.equals(this.horaSalida, other.horaSalida)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codTicket + "|" + codPlaza + "|" + matricula + "|" + fechaEntrada + "|" + importe + "|" + pin + "|" + horaEntrada + "|" + horaSalida+"|"+fechaSalida ;
    }
    
    public String infoTickets(){
        return "-"+codPlaza+"||"+matricula+"||"+importe+"\n";
                
    }
    
    
}
