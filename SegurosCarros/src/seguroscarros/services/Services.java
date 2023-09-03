
package seguroscarros.services;

import java.util.Scanner;


public class Services {
    Scanner leer = new Scanner(System.in);
    public int Gestioncuotas (){
        System.out.println("ingrese el numero de poliza 10,20,30");
        Integer numeroDePoliza = leer.nextInt();
        return numeroDePoliza;
    }
}
