
package circulo.entidades;


public class Circunferencia {
    
    // ------------------ ATRIBUTOS ----------------------//
    
    private int radio;
    
    // ------------------ CONSTRUCTORE POR DEFECTO ----------------------//
    
    public Circunferencia(){
        
    }
    // ------------------ CONSTRUCTORE POR ATRIBUTOS ----------------------//

    public Circunferencia(int radio) {
        this.radio = radio;
    }
    // ------------------ GETTER AND SETTER ----------------------//

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    // ------------------ TO STRING  ----------------------//

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
