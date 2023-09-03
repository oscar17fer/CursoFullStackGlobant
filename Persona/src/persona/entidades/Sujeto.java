
package persona.entidades;


public class Sujeto {
    
    
    // ------------------ ATRIBUTOS ----------------------//
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private int altura;
    
    // ------------------ CONSTRUCTOR POR DEFECTO ----------------------//
    
    public Sujeto(){
        
    }
    
    // ------------------ CONTRUCTOR POR ATRIBUTOS ----------------------//

    public Sujeto(String nombre, int edad, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // ------------------ GETTERS AND SETTERS ----------------------//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // ------------------ TO STRING ----------------------//

    @Override
    public String toString() {
        return "Sujeto{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}
