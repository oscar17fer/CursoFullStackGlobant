
package tiendatelefonos.Servicios;

import java.util.Scanner;
import tiendatelefonos.Entidades.Movil;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    
    public Movil cargarCelular(){
        
        Movil M1 = new Movil();
        
        System.out.println("Marca");
        M1.setMarca(leer.nextLine());
        System.out.println("precio");
        M1.setPrecio(leer.nextInt());
        //System.out.println("model");
        //M1.setModel(leer.nextLine());
        
        ingresarCodigo();
              
        
        return M1;
    }
    
    public int [] ingresarCodigo(){
        
        
        
        int [] codigo = new int[7];
        
        System.out.println("ingrese los 7 numeroso ");
        for (int i = 0; i < 7; i++) {
            codigo[i] = leer.nextInt();
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.println(codigo[i]);
        }
        
        return codigo;
    }
    
}
