
package Persona.Entidades;


public class Perro {
    
// ------ ATRIBUTOS -------//

    private String nombre;
    private int edad; 
    private String raza;
    private String tanio; 
    
    
// ------ CONSTRUCTOR POR DEFECTO -------//

    public Perro() {
    }

// ------ CONSTRUCTOR POR ATRIBUTOS -------//  

    public Perro(String nombre, int edad, String raza, String tanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tanio = tanio;
    }
    
// ------ GETTERS AND SETTERS -------//

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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTanio() {
        return tanio;
    }

    public void setTanio(String tanio) {
        this.tanio = tanio;
    }
    
// ------ TO STRING -------//      

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tanio=" + tanio + '}';
    }
    
}
