
package cine.entities;


public class Pelicula {
    
    // ----- ATRIBUTOS ----//
    
    private String titulo;
    private String director;
    private Integer duracion;
    
    // ----- CONSTRUCTOR POR DEFECTO ------//
     public Pelicula() {
    }
    // ----- CONSTRUCTOR POR ATRIBUTOS ------//
     public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    // ----- GETTERS AND SETTERS ------//

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

   

    
}
