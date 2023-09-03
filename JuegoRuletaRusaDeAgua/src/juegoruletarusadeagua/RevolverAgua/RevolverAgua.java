
package juegoruletarusadeagua.RevolverAgua;


public class RevolverAgua {

    private int posicionActual;
    private int posicionAgua;
    
    // -- CONSTRUCTOR POR DEFECTO

    public RevolverAgua() {
    }
    
    // -- CONSTRUCTOR POR ATRIBUTOS

    public RevolverAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    // -- GETTERS AND SETTERS 

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    // -- TO STRING

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
    
}
