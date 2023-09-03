
package juegoruletarusadeagua;

import juegoruletarusadeagua.SERVICIOS.JugadorServicios;
import juegoruletarusadeagua.SERVICIOS.RevolverAguarServicios;


public class JuegoRuletaRusaDeAgua {

   
    public static void main(String[] args) {
        RevolverAguarServicios r1 = new RevolverAguarServicios();
        JugadorServicios j1 = new JugadorServicios();
        
                
       
                
        r1.llenarRevolver();
        
        j1.builtGamers();
        j1.disparo();
        
        
    }
    
}
