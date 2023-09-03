
package math.someoptions.entidades;

import java.util.Scanner;

import servicios.Entidades;


public class Servicios {
    
    Scanner leer = new Scanner(System.in);
    public Entidades creaMath(){
        
        Entidades e1 = new Entidades();
        
        e1.setNum1((int)(Math.random()*100));
        e1.setNum2((int)(Math.random()*100));
        
        return e1;
        
    }
    
    public void devolverMayor (Entidades e1){
        
        if (e1.getNum1() > e1.getNum2()){
            System.out.println("el numero uno es mayor al dos " + "este es el numero 1 "+e1.getNum1()+ "este es el numero 2"+ e1.getNum2());
        }else if (e1.getNum1() == e1.getNum2()){
            System.out.println("son iguales"+e1.getNum1() + " " +e1.getNum2());
        }
        else {
            System.out.println("el numero dos es mayor a uno " + e1.getNum1() +" " + e1.getNum2());
        }
    }
    
  /*  public double Potencia (Entidades e1){
        
        
        if (e1.getNum1() > e1.getNum2()){
            System.out.println("el numero una es mayor al dos");
            double result = Math.pow(e1.getNum2(), e1.getNum1());
        }else if (e1.getNum1() == e1.getNum2()){
            System.out.println("son iguales"+e1.getNum1() + " " +e1.getNum2());
        }
        else {
            System.out.println("EL NUMERO DOS ES MAYOR AL 1");
            double result = Math.pow(e1.getNum1(), e1.getNum2());
        }
        
        return result; */
        
        

        
    
    
}
