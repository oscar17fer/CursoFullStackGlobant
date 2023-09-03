
package sueldos;

import Sueldo.Entidades.Servicios.VendedorServicio;
import Sueldo.Entidades.Vendedor;


public class Sueldos {

    
    public static void main(String[] args) {
        
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altVendedor();
        vs.vacaciones(v1);
        vs.sueldoMensual(v1);
        
        
    }
    
}
