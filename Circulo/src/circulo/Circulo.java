
package circulo;

import circulo.servicios.Servicios;
import circulo.entidades.Circunferencia;

public class Circulo {

  
    public static void main(String[] args) {
        Servicios s1 = new Servicios();
        Circunferencia c1 = s1.creaCircunferencia();
        s1.crearArea(c1);
        s1.crearPerimetro(c1);
    }
    
}
