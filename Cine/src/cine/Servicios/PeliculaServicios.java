
package cine.Servicios;

import cine.entities.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PeliculaServicios {
    
    Scanner leer = new Scanner(System.in);
    List <Pelicula> allInfoPelicula = new ArrayList<>();
            
    
    public void creaPelicula(){
        
        Pelicula P1 = new Pelicula();
        
        String answer =  "si"; 
        
        while (answer.equalsIgnoreCase("si")) {
            
            System.out.println("por favor entre el titulo de la peli");
            P1.setTitulo(leer.nextLine());
            System.out.println("por favor ingrese Director de la peli");
            P1.setDirector(leer.nextLine());
            System.out.println("por favor entre duracion de la peli");
            P1.setDuracion(leer.nextInt());
            leer.nextLine();
            System.out.println("");
            
            Pelicula pelicula = new Pelicula(P1.getTitulo(), P1.getDirector(), P1.getDuracion());
            allInfoPelicula.add(pelicula);
            
            System.out.println("Desea almacenar otra pelicula escribir si, de lo contrario cualquier letra");
            System.out.println("");
            answer = leer.nextLine();
            
        }
       
        
    }
    
    public void monstrarTodasPelis (){
        for (Pelicula pelicula : allInfoPelicula) {
            System.out.println(pelicula);
        }
    }
    
    public List <Pelicula> getAllPeliculas(){
        return new ArrayList<>(allInfoPelicula);
    }
    
}
