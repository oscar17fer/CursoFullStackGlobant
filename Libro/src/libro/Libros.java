
package libro;

import libro.servicios.LibroServicios;
import libro.Entidades.Libro;


public class Libros {

    
    public static void main(String[] args) {
        LibroServicios ls = new LibroServicios();
        Libro l1 = ls.guardaLibro();
        
        System.out.println(l1.toString());
    }
    
}
