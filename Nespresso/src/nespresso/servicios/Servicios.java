
package nespresso.servicios;

import java.util.Scanner;
import nespresso.entidades.Cafetera;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public Cafetera llenarCafetera (){
        
        Cafetera c1 = new Cafetera();
        
        System.out.println("cual es la cantidad maxima de la cafetera actual ");
        c1.setCapacidadMaxima(leer.nextInt());
        
        return c1;
        
    }
    
    public void servirTaza (Cafetera c1){
        
        System.out.println("ingrese el tama de la taza vacia ");
        int capacidadTaza = leer.nextInt();
        
        int servir = c1.getCapacidadMaxima() - capacidadTaza;
        
        
        if (c1.getCapacidadMaxima() > capacidadTaza){
            System.out.println("se lleno, lo q quedo en la taza es " + capacidadTaza);
        }else {
            System.out.println("no se lleno por completo, lo q quedo en la taza es " +c1.getCapacidadMaxima());
        }
        
        System.out.println("la cantidad de cafe restante es " + servir );
        
        
    }
    public void VaciarCafetera(Cafetera c1){
        
        int vaciar = c1.getCapacidadMaxima() - c1.getCapacidadMaxima();
        
        System.out.println("la cafetera esta vacia " + vaciar);
        
    }
    
    public void agregarCafe(Cafetera c1){
        
        System.out.println("por favor introdusca cuanto cafe deseea agregar ");
        int agregar = leer.nextInt();
        c1.setCapacidadMaxima(c1.getCapacidadMaxima()+agregar);
        System.out.println("la cantidad de cafe es igual ha " + c1.getCapacidadMaxima());
    }
    
    
    
}
