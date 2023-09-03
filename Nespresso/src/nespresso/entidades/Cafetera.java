
package nespresso.entidades;


public class Cafetera {
    
    // ------------------ ATRIBUTOS ----------------------//
    
    private int capacidadMaxima ; 
    private int capacidadMinima ;
    
    // ------------------ CONSTRUCCTOR POR DEFECTO ----------------------//
    
    public Cafetera(){
        
    }
    // ------------------ CONSTRUCTORES POR ATRIBUTOS ----------------------//

    public Cafetera(int capacidadMaxima, int capacidadMinima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadMinima = capacidadMinima;
    }
    
    // ------------------ GETTER AND SETTER  ----------------------//

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMinima() {
        return capacidadMinima;
    }

    public void setCapacidadMinima(int capacidadMinima) {
        this.capacidadMinima = capacidadMinima;
    }
    
    // ------------------ TO STRING  ----------------------//

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadMinima=" + capacidadMinima + '}';
    }
    
    
    
}
