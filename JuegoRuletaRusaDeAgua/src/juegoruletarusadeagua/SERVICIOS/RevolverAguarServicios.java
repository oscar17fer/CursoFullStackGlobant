
package juegoruletarusadeagua.SERVICIOS;

import java.util.Random;
import juegoruletarusadeagua.RevolverAgua.RevolverAgua;


public class RevolverAguarServicios {
    public RevolverAgua r1;
    
    public void llenarRevolver(){
         r1 = new RevolverAgua();
        Random random = new Random();
        
        int aleatorioUno = random.nextInt(7);
        r1.setPosicionActual(aleatorioUno);
        
        int aleatorioDos = random.nextInt(7);
        r1.setPosicionAgua(aleatorioDos);
        showInfo();
    }
    
    public void showInfo(){
        System.out.println("posicion actual " + r1.getPosicionActual() );
        System.out.println("posicion actual " + r1.getPosicionAgua() );
    }
    
    public boolean mojar (){
        boolean mojar = false;
        
        if (r1.getPosicionActual() == r1.getPosicionAgua()) {
            mojar = true;
        }
        return mojar;
    }   
    
    public int siguienteChorro (){
        int nextBulet = r1.getPosicionAgua() + 1;
        
        if (nextBulet >= 7 ) {
            nextBulet = 1;
        }
        
        return nextBulet;
    } 
}
