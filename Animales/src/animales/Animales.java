
package animales;

import animales.entites.AnimalesEntities;
import animales.entites.Caballo;
import animales.entites.Gato;
import animales.entites.Perro;


public class Animales {

    
    public static void main(String[] args) {
        
    AnimalesEntities perro1 = new Perro("stech", "carnivor", 15, "doberman");
    perro1.alimentar();
    
    AnimalesEntities perro2 = new Perro("stech", "carnivor", 10, "doberman");
    perro2.alimentar();
    
    AnimalesEntities gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
    gato1.alimentar();
    
    AnimalesEntities caballo = new Caballo("Spark", "Pasto", 25, "fino");
    caballo.alimentar();
    
    }
    
}
