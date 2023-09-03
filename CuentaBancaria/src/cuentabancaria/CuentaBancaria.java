
package cuentabancaria;

import cuentabancaria.Servicios.Servicios;
import cuentabancaria.entidades.Cuenta;


public class CuentaBancaria {

  
    public static void main(String[] args) {
       Servicios s1 = new Servicios ();
       Cuenta c1 = s1.manageCuenta();
       
       s1.doubleIngreso(c1);
       s1.extraccionRapida(c1);
       s1.doubleRetiro(c1);
       s1.consultarDatos(c1);
       
    }
    
}
