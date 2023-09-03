
package figurarectangulo.Entidades;


public class Rectangulo {
    
    // ------------------ ATRIBUTOS ----------------------//
    
    private int altura;
    private int base;
    
    // ------------------ CONSTRUCTORES POR DEFECTO  ----------------------//
    
    public Rectangulo(){
        
    }
    
    // ------------------ CONSTRUCTORES ----------------------//

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
    // ------------------ GETTER AND SETTER  ----------------------//

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    // ------------------ TO STRING  ----------------------//

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", base=" + base + '}';
    }
    
    
}
