
package persona.servicios;

import java.util.Scanner;

import persona.entidades.Sujeto;


public class servicios {
    
    Scanner leer = new Scanner(System.in);
    public Sujeto crearSujeto(){
        Sujeto s1 = new Sujeto();
        System.out.println("por favor ingres su nombre ");
        s1.setNombre(leer.nextLine());
        System.out.println("por favor introdusca su edad ");
        s1.setEdad(leer.nextInt());
       /* System.out.println("porfavor ingrese su sexo solo puede ser H hombre, M mujer, o otro ");
        s1.setSexo(leer.nextLine());
       if (s1.getSexo() == "M" || s1.getSexo() == "H" || s1.getSexo() == "O"){
            System.out.println("su sexo es " + s1.getSexo());
        }else System.out.println("esa no una respuesta correcta ");*/
        
        System.out.println("porfavor ingrese su peso ");
        s1.setPeso(leer.nextInt());
        System.out.println("porfavor ingrese su altura ");
        s1.setAltura(leer.nextInt());
        
        System.out.println("ingrese su genero H,M,O");
        s1.setSexo(leer.nextLine());
        
        return s1; 
    }
    
    
        
    
    
}
