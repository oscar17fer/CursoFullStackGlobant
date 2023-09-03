
package nespresso;

import nespresso.entidades.Cafetera;
import nespresso.servicios.Servicios;


public class Nespresso {

    
    public static void main(String[] args) {
        Servicios s1 = new Servicios();
        Cafetera c1 = s1.llenarCafetera();
        
        s1.servirTaza(c1);
        s1.VaciarCafetera(c1);
        s1.agregarCafe(c1);
        
    }
    
}
