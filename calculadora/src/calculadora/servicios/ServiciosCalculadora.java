
package calculadora.servicios;

import calculadora.atributos.OperacionesEntidades;
import java.util.Scanner;


public class ServiciosCalculadora {
    Scanner leer = new Scanner(System.in);
    
    public OperacionesEntidades pedirNumeros(){
        
        OperacionesEntidades o1 = new OperacionesEntidades();
        
        System.out.println("porfavor ingresar el primer numero ");
        o1.setNumero1(leer.nextInt());
        System.out.println("porfavor ingresar segundo numero ");
        o1.setNumero2(leer.nextInt());
        
        return o1;
    }
    
    public void suma(OperacionesEntidades o1){
        
        int suma = o1.getNumero1()+o1.getNumero2();
        System.out.println("la suma entre numero 1 y dos es " + suma);
        
    }
    
    public void resta (OperacionesEntidades o1){
        int resta = o1.getNumero1()-o1.getNumero2();
        System.out.println("la resta entre el numero 1 y dos es " + resta );
    }
    
    public void multiplicacion (OperacionesEntidades o1){
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0){
            System.out.println("Error la multiplicacion no puede ser por un numero 0 ");
        }else {
            int multiplicacion = o1.getNumero1()*o1.getNumero2();
            System.out.println("la multiplicacion entre numero 1 y dos es " + multiplicacion);
        }
    }
    
    public void dividir (OperacionesEntidades o1){
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0){
            System.out.println("Error la division no puede ser por un numero 0");
        }else {
            double dividir = o1.getNumero1()/o1.getNumero2();
            System.out.println("el resultado de la division entre numero 1 y 2 es " + dividir);
        }
    }
    
}
