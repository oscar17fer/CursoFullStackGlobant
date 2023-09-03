
package paises.Services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import paises.entities.Pais;


public class Services {
    Scanner leer = new Scanner(System.in);
    Set<Pais> paisesAgregar = new TreeSet<>();
    
    
    // ingresar paises asignarlos a objetos y pasarlos a conjuntos
    public void asifnarpais(){
        Pais p1 = new Pais();
        String Answer = "si";
        
        while (Answer.equalsIgnoreCase("si")){
            System.out.println("ingrese un pais");
            p1.setPaise(leer.nextLine());
            Pais paises = new Pais(p1.getPaise());
            paisesAgregar.add(paises);
            
            System.out.println("Desea almacenar otra pelicula escribir si, de lo contrario cualquier letra");
            System.out.println("");
            Answer = leer.nextLine();
        }
    }
    // monstrar todos los paises ingresados 
    public void monstrarTodosLosPaises(){
        for (Pais pais : paisesAgregar) {
            System.out.println(pais);
        }
    } 
    
    // crear una copia de los paises en conjunto 
    public Set<Pais> getAllPaises() {
    System.out.println("Escriba qué país quiere remover");
    String remover = leer.nextLine();

    Iterator<Pais> iterator = paisesAgregar.iterator();
    while (iterator.hasNext()) {
        Pais pais = iterator.next();
        if (pais.toString().equalsIgnoreCase(remover)) {
            iterator.remove();
        }
    }

        for (Pais pais : paisesAgregar) {
            System.out.println(pais);
        }
    return paisesAgregar;
}
}
