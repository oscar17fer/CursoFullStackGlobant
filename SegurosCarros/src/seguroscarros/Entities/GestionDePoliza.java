
package seguroscarros.Entities;

import java.time.LocalDate;


public class GestionDePoliza {
    
    // --------- ATRIBUTOS -------//
    
    private Vehiculo vehiculo;
    private Clientes cliente;
    private Integer numeroDePoliza;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Integer numeroCuotas;
    private String formaDePago;
    private Integer montoTotalasegurado;
    
    // --------- CONSTRUCTOR POR DEFECTO -----------//

    public GestionDePoliza() {
    }
    
    // --------- CONSTRUCTOR POR ATRIBUTOS -----------//

    public GestionDePoliza(Vehiculo vehiculo, Clientes cliente, Integer numeroDePoliza, LocalDate fechaInicial, LocalDate fechaFinal, Integer numeroCuotas, String formaDePago, Integer montoTotalasegurado) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroDePoliza = numeroDePoliza;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.numeroCuotas = numeroCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalasegurado = montoTotalasegurado;
    }
    // --------- GETTERS AND SETTERS -----------//

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(Integer numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Integer getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(Integer numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Integer getMontoTotalasegurado() {
        return montoTotalasegurado;
    }

    public void setMontoTotalasegurado(Integer montoTotalasegurado) {
        this.montoTotalasegurado = montoTotalasegurado;
    }
    // --------- TOSTRING -----------//

    @Override
    public String toString() {
        return "GestionDePoliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", numeroDePoliza=" + numeroDePoliza + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", numeroCuotas=" + numeroCuotas + ", formaDePago=" + formaDePago + ", montoTotalasegurado=" + montoTotalasegurado + '}';
    }
    
}
