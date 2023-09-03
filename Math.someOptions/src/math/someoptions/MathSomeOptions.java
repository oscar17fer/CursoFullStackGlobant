
package math.someoptions;

import math.someoptions.entidades.Servicios;
import servicios.Entidades;


public class MathSomeOptions {

   
    public static void main(String[] args) {
        Servicios s1 = new Servicios();
        Entidades e1 = s1.creaMath();
        
        s1.devolverMayor(e1);
        
     /*   if (e1.getNum1() > e1.getNum2()){
            System.out.println("el numero una es mayor al dos");
            double result = Math.pow(e1.getNum2(), e1.getNum1());
        }else if (e1.getNum1() == e1.getNum2()){
            System.out.println("son iguales"+e1.getNum1() + " " +e1.getNum2());
        }
        else {
            System.out.println("EL NUMERO DOS ES MAYOR AL 1");
            double result = Math.pow(e1.getNum1(), e1.getNum2());
        }*/
        
    }
    
}
