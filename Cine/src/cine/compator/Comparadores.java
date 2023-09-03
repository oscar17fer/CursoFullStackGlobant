
package cine.compator;

import cine.entities.Pelicula;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracionDes = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
        
    };
            
    public static Comparator<Pelicula> ordenarPorDuracionAsc =  new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
            
    public static Comparator<Pelicula> ordenarPorNombreDesndente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getTitulo().compareTo(t1.getTitulo());
        }
        
    };
    
    // Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
    public static Comparator<Pelicula> ordenarPorTituloAlfabetica = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());
        }
    };
    
    // Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
    public static Comparator<Pelicula> ordenarDirectoPorAlfetica = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareToIgnoreCase(t1.getDirector())*-1;
        }
    };
    // Ordenar todas las películas con una duración mayor a 1 hora.
    
    public static Comparator<Pelicula> ordernaPeliMayorDeHora = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
       
}
