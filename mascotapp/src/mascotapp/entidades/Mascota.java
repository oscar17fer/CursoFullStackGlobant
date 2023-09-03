package mascotapp.entidades;

import mascotapp.enumeraciones.Raza;
import mascotapp.enumeraciones.SexoAnimal;

public class Mascota {

    // ------- ATRUBUTOS ----------//
    
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Raza raza;
    private int edad;
    private boolean cola;
    private int energia;
    private SexoAnimal sexo;
    
    // ------- mensionar ----------//
    
    public Mascota(){
        this.energia = 1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Carpicho"))
             this.tipo = tipo;

    }

    public Mascota(String nombre, String apodo, String tipo, String color, Raza raza, int edad, boolean cola, int energia, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.cola = cola;
        this.energia = energia;
        this.sexo = sexo;
    }

    
    
    public void setNombre (String nombre){
        if (nombre.length() > 0){
            this.nombre =nombre;
        }
        this.energia = 1000;
    }

    // ------- SETTER ----------//
    
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }
    
    // ------- GETTER ----------//
    
    public String getNombre(){
        return nombre;    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }
    
    // ------- operacion ---------- //
    /**
     * funtion to do
     * @param energiaRestar
     * @return energia
     */
    
 
        public int pasear(int energiaRestar){
            energia -= energiaRestar;
        return energia;
    }
    /**
    * 
    * @param energiaRestar
    * @param vueltas
    * @return 
    */
    public int pasear(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
         
        
        return energia;
    }
    
    
    // ------- TO STRING ---------- //

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + ", sexo=" + sexo + '}';
    }

   

    
    
    

}
