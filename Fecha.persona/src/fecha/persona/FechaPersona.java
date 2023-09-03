
package fecha.persona;

import fecha.persona.entidades.Fechas;
import fecha.persona.servicios.Servicios;


public class FechaPersona {

    
    public static void main(String[] args) {
        Servicios s1 =  new Servicios();
        Fechas f1 =  s1.crearPersonaFechas();
        
        s1.calcularEdad(f1);  
        s1.calcularEdad(f1);
        s1.mostrarPersona(f1);
    }
    
    
    
}
