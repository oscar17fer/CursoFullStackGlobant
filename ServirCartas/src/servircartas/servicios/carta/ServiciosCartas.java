
package servircartas.servicios.carta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import servircartasEntities.Cartas;
import servircartasEntities.Usuario;


public class ServiciosCartas {
    Scanner leer = new Scanner(System.in);
    public List<Cartas> cartas = new ArrayList<>();
    public Usuario cartasconstructor = new Usuario(); 
    public void crearBaraja(){
    String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
    
    for (String palo : palos) {
        for (int numero = 1; numero < 13; numero++) {
            if (numero != 8 && numero != 9) {
                cartas.add(new Cartas(numero,palo));
            }
        }
    }
    
    
    
        System.out.println("************ Las cartas del juego ********");
        System.out.println("");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    
  }
    
    public void barajar(){
        Collections.shuffle(cartas);
        System.out.println("");
        System.out.println("************ Las cartas del juego ********");
        System.out.println("");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
        cartasconstructor = new Usuario(cartas);
        cartasconstructor.setCartas(cartas);
    }
    
    public Cartas siguienteCarta(){
        if (cartas.isEmpty()) {
            System.out.println(" no hay mas cartas. ");
            return null;
        }
        return cartas.remove(0); 
        
    }
    
    public void imprimir(){
        System.out.println("*** cartas quitando una ***");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
        cartasconstructor.setCartas(cartas);
    }
    
    public int cartasDisponibles(){
        System.out.println("Cartas disponibles");
        System.out.println(cartas.size());
        return cartas.size();
        
    }
    
    public ArrayList<Cartas> darCartas(int catidadDeCartas){
        ArrayList<Cartas> cartasEntradas = new ArrayList<>();
        
        if (catidadDeCartas > cartas.size()) {
            System.out.println(" el numero excede la cantidad de cartas ");
            return cartasEntradas;
        }
        for (int i = 0; i < catidadDeCartas; i++) {
            cartasEntradas.add(siguienteCarta());
        }
        System.out.println("");
        System.out.println("cartas entregadas ********************");
        System.out.println("");
        for (Cartas cartasEntrada : cartasEntradas) {
            
            System.out.println(cartasEntrada);
        }return cartasEntradas;
    }
    
    
   
    
}
