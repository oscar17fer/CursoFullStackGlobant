
package libro.servicios;


import java.util.Scanner;
import libro.Entidades.Libro;


public class LibroServicios {
    Scanner leer = new Scanner (System.in);
    public Libro guardaLibro(){
        
        Libro l1 = new Libro();
        
        System.out.println("ingrese el numero ISBN ");
        l1.setISBN(leer.nextInt());
        System.out.println("ingrese el titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("ingrese el Autor del libro");
        l1.setAutor(leer.next());
        System.out.println("ingrese el numero de paginas ");
        l1.setNumeroPaguinas(leer.nextInt());
        
        
        return l1;
        
        
    }
}
