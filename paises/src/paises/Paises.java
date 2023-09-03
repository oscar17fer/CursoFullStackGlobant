
package paises;

import java.util.Scanner;
import paises.Services.Services;
import paises.entities.Pais;


public class Paises {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pais p1 = new Pais();
        Services s1 = new Services();
        
        s1.asifnarpais();
        s1.monstrarTodosLosPaises();
        s1.getAllPaises();
    }
    
}
