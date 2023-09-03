
package cadenastring;

import cadenastring.Servicios.Servicios;
import cadenastring.entidades.Cadena;


public class CadenaString {

    
    public static void main(String[] args) {
       Servicios s1 = new Servicios ();
       Cadena c1 = s1.crearCadena();
       s1.mostrarVocales(c1);
       s1.invetirFrase(c1);
       s1.vecesRepetida(c1);
       s1.compararLongitud(c1);
       s1.unirFrase(c1);
       s1.reemplazar(c1);
       s1.contiene(c1);
    }
    
    
    
}
