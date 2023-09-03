
package calculadora;

import calculadora.atributos.OperacionesEntidades;
import calculadora.servicios.ServiciosCalculadora;

public class Calculadora {

   
    public static void main(String[] args) {
        
        ServiciosCalculadora sc = new ServiciosCalculadora();
        OperacionesEntidades o1 = sc.pedirNumeros();
                
        sc.suma(o1);
        sc.resta(o1);
        sc.multiplicacion(o1);
        sc.dividir(o1);
    }
    
}
