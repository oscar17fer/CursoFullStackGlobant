
package servircartasEntities;

import java.util.List;


public class Usuario {
    
    // ------------- ATRIBUTOS -------//
    
    private List<Cartas> cartas;
    
    // ------------- CONSTRUCTOR POR DEFECTO -------//  

    public Usuario() {
    }   
    
    // ------------- CONSTRUCTOR POR ATRIBUTO -------//
    
  
    public Usuario(List<Cartas> cartas) {
        this.cartas = cartas;
    }
    
    
    // ------------- GETTER AND SETTERS -------//

    public List<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(List<Cartas> cartas) {
        this.cartas = cartas;
    }
    
    // ---------- TO STRING --------------//

    @Override
    public String toString() {
        return "Usuario{" + "cartas=" + cartas + '}';
    }
    
    
    
}
