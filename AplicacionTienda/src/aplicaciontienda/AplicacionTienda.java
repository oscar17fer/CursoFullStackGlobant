
package aplicaciontienda;

import Tienda.TiendaEntidades;
import Tienda.servicios.TiendaServicios;


public class AplicacionTienda {

   
    public static void main(String[] args) {
        TiendaEntidades t1 = new TiendaEntidades();
        TiendaServicios s1 = new TiendaServicios();
        
        s1.showMenu();
    }
    
}
