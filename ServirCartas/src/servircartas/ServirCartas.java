
package servircartas;

import java.util.Scanner;
import servircartas.servicios.carta.ServiciosCartas;
import servircartasEntities.Cartas;
import servircartasEntities.Usuario;


public class ServirCartas {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cartas c1 = new Cartas();
        Usuario s1 = new Usuario();
        ServiciosCartas Servicios = new ServiciosCartas();
        
        Servicios.crearBaraja();
        Servicios.barajar();
        Servicios.siguienteCarta();
        Servicios.imprimir();
        Servicios.cartasDisponibles();
        System.out.println("cuantas cartas deseea");
        int catidad = leer.nextInt();
        Servicios.darCartas(catidad);
        Servicios.imprimir();
        
    }
    
}
