
package cuentabancaria.Servicios;

import cuentabancaria.entidades.Cuenta;
import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public Cuenta manageCuenta(){
        
        Cuenta c1 = new Cuenta();
        
        System.out.println("ingrese el numero de cuenta ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese el DNI ");
        c1.setDNI(leer.nextInt());
        System.out.println("ingrese el saldo actual ");
        c1.setSaldoActual(leer.nextInt());
        
        
        
        return c1;
    }
    
    public void doubleIngreso (Cuenta c1){
        
        System.out.println("ingrese el monto q desea adiccionar ");
        int addicionar = leer.nextInt();
        c1.setSaldoActual(c1.getSaldoActual() + addicionar) ;
        System.out.println("el saldo actual es "+ c1.getSaldoActual());
        
    }
    
    public void doubleRetiro (Cuenta c1){
        
        System.out.println("ingrese el valor a retirar de su cuenta ");
        int retirar = leer.nextInt();
        
        if (retirar > c1.getSaldoActual()){
            System.out.println("fondos insuficientes");
        }
        
        c1.setSaldoActual(c1.getSaldoActual() - retirar);
        System.out.println("su saldo total es " + c1.getSaldoActual());
        
    }
    
    public void extraccionRapida (Cuenta c1 ){
        System.out.println("ingrese el monto a retirar ");
        int extraccionRapida = leer.nextInt();
        if (extraccionRapida > (0.20*c1.getSaldoActual()) ){
            System.out.println("el mayor no puede ser mas grande q el 20% en esta opcion");
        }else {
            c1.setSaldoActual(c1.getSaldoActual()-extraccionRapida); 
            System.out.println("con este retiro el saldo acutual es " + c1.getSaldoActual());
        }
        
        
    }
    
    public void consultarDatos (Cuenta c1){
        System.out.println(c1.getNumeroCuenta());
        System.out.println(c1.getDNI());
        System.out.println(c1.getSaldoActual());
        
    }
}
