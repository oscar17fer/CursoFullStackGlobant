
package figurarectangulo;

import figurarectangulo.Entidades.Rectangulo;
import figurarectangulo.Servicios.Servicios;


public class FiguraRectangulo {

    
    public static void main(String[] args) {
        Servicios sr1 = new Servicios ();
        Rectangulo r1 = sr1.crearRectangulo();
        
        sr1.rectangulosAsteriscos(r1);
        sr1.calcularSuperficie(r1);
        sr1.calcularPerimetro(r1);
        
    }
    
}
