
package Sueldo.Entidades;

import java.util.Date;


public class Vendedor {
    
    private String name;
    private int dni;
    private double sueldoBasico;
    private double comisiones;
    private double sueldoMensual;
    private Date fechaInicio;
    
    // ------------------ CONSTRUCTORES ----------------------//
    // ------------------ CONSTRUCTORE POR DEFECTO ----------------------//
    
    public Vendedor(){
        
    }
    // ------------------ CONSTRUCTORES POR PARAMETROS ----------------------//

    public Vendedor(String name, int dni, double sueldoBasico, double comisiones, double sueldoMensual, Date fechaInicio) {
        this.name = name;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    
    // ------------------ GETTER AND SETTER  ----------------------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    // ------------------ TO STRING ----------------------//

    @Override
    public String toString() {
        return "Vendedor{" + "name=" + name + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
    
}
