
package cadenastring.entidades;


public class Cadena {
    
    // ------------------ CONSTRUCTORES ----------------------//
    
    private String frase;
    private int logitud;
    
    // ------------------ CONSTRUCTOR POR DEFECTO ----------------------//
    
    public Cadena (){
        
    }
    
    // ------------------ CONSTRUCTOR POR ATRIBUTOS ----------------------//

    public Cadena(String frase, int logitud) {
        this.frase = frase;
        this.logitud = logitud;
    }
    
    // ------------------ GETTERS AND SETTERS ----------------------//

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLogitud() {
        return logitud;
    }

    public void setLogitud(int logitud) {
        this.logitud = logitud;
    }
    
    
    
}
