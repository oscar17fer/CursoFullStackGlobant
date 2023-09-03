
package cine;

import cine.Servicios.PeliculaServicios;
import cine.compator.Comparadores;
import cine.entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Cine {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        Pelicula p1 = new Pelicula();
        PeliculaServicios s1 = new PeliculaServicios();
        
        s1.creaPelicula();
        s1.monstrarTodasPelis();
        
        
        // Crear dos copias de la lista original
        List<Pelicula> copiaPorDuracion = new ArrayList<>(s1.getAllPeliculas());
        List<Pelicula> copiaPorTitulo = new ArrayList<>(s1.getAllPeliculas());
        List<Pelicula> copiaPorDuracionsAsc = new ArrayList<>(s1.getAllPeliculas());
        List<Pelicula> copiaPorTituloAlfabetico = new ArrayList<>(s1.getAllPeliculas());
        List<Pelicula> copiaPorDirectorAlfabetico = new ArrayList<>(s1.getAllPeliculas());
        List<Pelicula> copiaPorDuracionMayorAUnaHora = new ArrayList<>(s1.getAllPeliculas());

        // Ordenar y mostrar por duración descendente
        Collections.sort(copiaPorDuracion, Comparadores.ordenarPorNombreDesndente);
        System.out.println("----- Películas ordenadas por duración descendente -----");
        for (Pelicula aux : copiaPorDuracion) {
            System.out.println(aux);
        }

        // Ordenar y mostrar por título descendente
        Collections.sort(copiaPorTitulo, Comparadores.ordenarPorNombreDesndente);
        System.out.println("----- Películas ordenadas por título descendente -----");
        for (Pelicula aux : copiaPorTitulo) {
            System.out.println(aux);
        }    
            // Ordenar y mostrar por duracion ascendente
        Collections.sort(copiaPorDuracionsAsc, Comparadores.ordenarPorDuracionAsc);
        System.out.println("----- Películas ordenadas por Duracion Ascendente -----");
        for (Pelicula aux : copiaPorDuracionsAsc) {
            System.out.println(aux);
        }    
        
         // Ordenar y mostrar por titulos 
        Collections.sort(copiaPorTituloAlfabetico, Comparadores.ordenarPorTituloAlfabetica);
        System.out.println("----- Películas ordenadas por Titulo alfatico -----");
        for (Pelicula aux : copiaPorTituloAlfabetico) {
            System.out.println(aux);
        } 
        
        // Ordenar Directo por alfabeto 
        Collections.sort(copiaPorDirectorAlfabetico, Comparadores.ordenarDirectoPorAlfetica);
        System.out.println("-----Peliculas ordenadas por Director Alfabetico ");
        for (Pelicula aux : copiaPorDirectorAlfabetico) {
            System.out.println(aux);
        }
        // Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        Collections.sort(copiaPorDuracionMayorAUnaHora, Comparadores.ordernaPeliMayorDeHora);
        System.out.println("-----películas con una duración mayor a 1 hora.-----");
        for (Pelicula pelicula : copiaPorDuracionMayorAUnaHora) {
            if (pelicula.getDuracion()>60){
                System.out.println(pelicula);
            }
        }
        
    
   }
}
