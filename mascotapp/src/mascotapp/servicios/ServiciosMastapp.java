package mascotapp.servicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;


public class ServiciosMastapp {
    
    private Scanner leer;
    private List<Mascota> mascotas;

    public ServiciosMastapp() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    
    
    public Mascota crearMascota(){
        
        System.out.println("introduccir nombre");
        String nombre = leer.next();
        
        System.out.println("introduccir apodo");
        String apodo = leer.next();
        
        System.out.println("introduccir tipo");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
          
    }   
    
    public void agregarMascota (Mascota M){
        mascotas.add(M);
    }
    
    public void mostrarMascota(){
        
        System.out.println("las mascotas actuales de la lista son");
        for (Mascota var : mascotas) {
            
            System.out.println(var.toString());
        }
        
        System.out.println("cantidad = " + mascotas.size());
    }
    
    /**
     * crear mascotas todos chiquitos
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir en la lista
     */
    
    public void fabricaChiquitos (int cantidad){
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Fer", "chiquito", "beagle"));
        }
        
    }
    
    /**
     * crear mascota pidiendo por teclado 
     * @param cantidad 
     */
    
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
    }
    
   /** public void actualizarMascota (int index){
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
        
    }**/
    public void actualizarMascota (int index){
        if (index >= (mascotas.size()-1)) {
        System.out.println("");
        System.out.println("------------ ACTUALIZAR -----------");
        
        Mascota m = crearMascota();
        
        mascotas.set(index, m);
        
        }else{
            System.out.println("ERROR el indice es erroneo");
        }
        
    }
    
    public void eliminarMascota(int index){
        
        if (index >= (mascotas.size()-1)) {
            mascotas.remove(index);
        }else{
            System.out.println("ERROR el indice es erroneo");
        }
    }
    
    
    
}
