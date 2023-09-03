
package servicios;


public class Entidades {
    
    // ------------------ ATRIBUTOS ----------------------//
    
    private int num1;
    private int num2;
    
    // ------------------ CONSTRUCTORES ----------------------//
    
    public Entidades (){
        
    }
    // ------------------ CONSTRUCTORES POR ATRIBUTOS ----------------------//

    public Entidades(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // ------------------ GETTERS AND SETTERS ----------------------//

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double setNum1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
