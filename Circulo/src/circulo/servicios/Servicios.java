
package circulo.servicios;

import circulo.entidades.Circunferencia;
import java.util.Scanner;


public class Servicios {
    public Circunferencia creaCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingrese el Radio del circulo ");
        c1.setRadio(leer.nextInt());
        return c1;
    }
    
    public void crearArea(Circunferencia c1){
        
        double area = Math.PI * Math.pow(2, c1.getRadio());
        
        System.out.println("la area es " + area);
        
    }
    
    public void crearPerimetro (Circunferencia c1){
        
        double perimetro = 2* Math.PI * c1.getRadio();
        
        System.out.println("el perimetro es " + perimetro);
    }
}
