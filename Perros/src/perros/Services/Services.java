
package perros.Services;

import java.util.ArrayList;
import java.util.Scanner;



public class Services {
    
    Scanner leer = new Scanner(System.in);
    
    public ArrayList<String> cargarRaza(){
        
        ArrayList<String> raza = new ArrayList();
        
        
        String anwser = "si";
        
        while (anwser.equalsIgnoreCase("si")) {            
            
            System.out.println("introdusca una raza");
            raza.add(leer.nextLine());
            
            System.out.println("desea guardar otro perro");
            anwser = leer.nextLine();
            
        }
        
        System.out.println("las mascotas actuales de la lista de mascotas son");
        for (String aux : raza) {
            System.out.println(aux);
        }
        System.out.println(" ");
        
        System.out.println("ingrese la raza de perro a eliminar");
        String  eliminar = leer.nextLine();
        
        for (int i = 0; i < raza.size(); i++) {
            
            String r = raza.get(i);
            if (r.equals(eliminar)){
                raza.remove(r);
            }
                
            
        }
        
        for (String var : raza) {
            System.out.println(var);
        }
        
        
        return raza;
        
    }
    
   
}
