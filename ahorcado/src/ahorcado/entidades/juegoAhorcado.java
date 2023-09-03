
package ahorcado.entidades;


public class juegoAhorcado {
    // ------------------- ATRIBUTOS -----------------------------//
    private String []  buscar = new String [6];
    private int cantidadLetras ;
    private int cantidadJugas ; 
    // ------------------- CONSTRUCTO POR DEFECTO -----------------------------//

    public juegoAhorcado() {
    }
    
    // ------------------- CONSTRUCTO POR ATRIBUTOS -----------------------------//

    public juegoAhorcado(int cantidadLetras, int cantidadJugas) {
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugas = cantidadJugas;
    }
    
    // ------------------- GETTERS AND SETTERS -----------------------------//

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugas() {
        return cantidadJugas;
    }

    public void setCantidadJugas(int cantidadJugas) {
        this.cantidadJugas = cantidadJugas;
    }
    
    
    
    
}
