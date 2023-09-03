package calculadora.atributos;


public class OperacionesEntidades {
    
    // ------------------ ATRIBUTOS ----------------------//
    private int numero1;
    private int numero2;
    
    // ------------------ CONSTRUCTORE POR DEFECTO ----------------------//
    public OperacionesEntidades(){
        
    }
    // ------------------ CONSTRUCTORE POR ATRIBUTO ----------------------//

    public OperacionesEntidades(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    // ------------------ GETTER AND SETTER ----------------------//

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    // ------------------ TO STRING ----------------------//

    @Override
    public String toString() {
        return "OperacionesEntidades{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
}
