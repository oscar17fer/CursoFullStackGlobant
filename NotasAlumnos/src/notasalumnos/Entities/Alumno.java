

package notasalumnos.Entities;


import java.util.List;


public class Alumno {
    
    // ----------- ATRIBUTOS ---------------------//
    private String nombre;
    private List<Integer> notas;
   
    
    // ----------- CONSTRUCTOR POR DEFECTO ---------------------//
    
     public Alumno() {
    }
     
    // ----------- CONTRUCTOS POR ATRIBUTOS ---------------------//
     
 
 public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    
    // ----------- GETTERS AND SETTERS ---------------------//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
   
    
    
}
