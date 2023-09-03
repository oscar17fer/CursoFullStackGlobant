
package Persona.Entidades;

import java.util.List;




public class Persona {
    // ------ ATRIBUTOS -------//
    
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
 //   private Perro perro;
    private List <Perro> perros;
    
    // ------ CONSTRUCTOR POR DEFECTO -------//

    public Persona() {
    }
    
    // ------ CONSTRUCTOR POR ATRIBUTOS -------//

    public Persona(String nombre, String apellido, int edad, int documento, List<Perro> perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    // ------ GETTYERS AND SETTERS -------//
    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    // ------ TO STRING -------//

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perros=" + perros + '}';
    }
   
    
}
