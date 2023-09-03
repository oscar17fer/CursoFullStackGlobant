
package cuentabancaria.entidades;


public class Cuenta {
    
    // ------------------ ATRIBUTOS ----------------------//
    
    private int numeroCuenta;
    private int DNI;
    private int saldoActual;
    
    
    // ------------------ CONSTRUCTORES POR DEFECTO ----------------------//
    
    public Cuenta(){
        
    } 
    
    // ------------------ CONSTRUCTORES ----------------------//

    public Cuenta(int numeroCuenta, int DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
      
    }
    
    // ------------------ GETTER AND SETTER ----------------------//

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    // ------------------ TO STRING  ----------------------//
    
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
    
}
