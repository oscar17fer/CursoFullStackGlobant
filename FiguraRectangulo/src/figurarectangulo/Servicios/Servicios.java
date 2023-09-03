
package figurarectangulo.Servicios;

import figurarectangulo.Entidades.Rectangulo;
import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("por favor ingresar la base del rectangulo ");
        r1.setBase(leer.nextInt());
        System.out.println("por favor ingresar la altura del rectangulo ");
        r1.setAltura(leer.nextInt());
        
        return r1;
        
    }
    
    public void rectangulosAsteriscos (Rectangulo r1){
        
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                System.out.print(" * ");
            }
            System.out.println(); 
        }
    }
    
    public void calcularSuperficie (Rectangulo r1){
        int superficie = r1.getBase()*r1.getAltura();
        System.out.println("esta es la superficie => " + superficie);
    }
    
    public void calcularPerimetro (Rectangulo r1){
        int perimetro = (r1.getBase()+r1.getAltura())*2;
        System.out.println("este es el premietro => " + perimetro);
    }
    
}
