
package juegoruletarusadeagua.RevolverAgua;


public class JugadorEntities {
    
    private Integer id;
    private String nombre;
    private boolean  mojado;
    
    //--- CONSTRUCTOR POR DEFECTO 

    public JugadorEntities() {
    }
    
    
    
    
    //--- CONSTRUCTOR POR ATRIBUTOS

    

    public JugadorEntities(Integer id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getMojado() {
        return mojado;
    }

    //--- GETTERS AND SETTERS
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    //--- TO STRING

    @Override
    public String toString() {
        return "JugadorEntities{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
    
}
