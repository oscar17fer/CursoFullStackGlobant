
package ahorcado.servicios;

import ahorcado.entidades.juegoAhorcado;
import java.util.Scanner;


public class Services {
    Scanner leer = new Scanner(System.in);
    public juegoAhorcado crearJuego(){
        
        juegoAhorcado jh1 = new juegoAhorcado();
        
        
        System.out.println("ingrese cantidad de jugas maximas");
        jh1.setCantidadJugas(leer.nextInt());
        System.out.println("ingrese la palabra");
        String frase = leer.nextLine();
        
        return jh1;
    }
    
    public String [] buscar (juegoAhorcado jh1, String frase){
        
        int logitud =  frase.length();
        String [] buscar = new String [logitud];
        
        
        for (int i = 0; i < logitud; i++) {
            buscar[i]= frase.substring(i, i);
        }
        
        
        return buscar;
    }
    
    public void buscarLetra (String [] buscar, int logitud, juegoAhorcado jh1 ){
        
        int contardor = 0;
        System.out.println("escribr la letra a buscar en el ahorcado");
        String letra = leer.nextLine();
        
        for (int i = 0; i < logitud; i++) {
            if (letra == buscar[i]){
                contardor = contardor + 1 ;              
            }
        }
        
        if (contardor > 0) {
            System.out.println("la letra si estaba este numero de veces " + contardor + "tienes esete numero de oportunidades " + jh1.getCantidadJugas());
            
        }else{
            jh1.setCantidadJugas(jh1.getCantidadJugas()-1);
            System.out.println("tienes esta cantidad de oportunidades " + jh1.getCantidadJugas());
        }
        
    } 
    
    
    
}
