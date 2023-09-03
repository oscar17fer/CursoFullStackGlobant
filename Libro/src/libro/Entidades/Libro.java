
package libro.Entidades;


public class Libro {
    // ------- ATRUBUTOS ----------//
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaguinas;
    
    
    // ------------------ CONSTRUCTORE POR DEFECTO ----------------------//
    public Libro(){
        
    }
    
    // ------------------ CONSTRUCTORE POR PARAMETROS ----------------------//

    public Libro(int ISBN, String titulo, String autor, int numeroPaguinas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaguinas = numeroPaguinas;
    }
    // ------------------ GETTER AND SETTER ----------------------//

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaguinas() {
        return numeroPaguinas;
    }

    public void setNumeroPaguinas(int numeroPaguinas) {
        this.numeroPaguinas = numeroPaguinas;
    }
    // ------------------ TO STRING ----------------------//

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaguinas=" + numeroPaguinas + '}';
    }
    
}
