/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttest;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class NewClass {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingres un numero ");
        int numb1 = leer.nextInt();
        System.out.println("ingrese un segundo valor");
        int numb2 = leer.nextInt();

        if (numb1 > 25 || numb2 > 25) ;
        {
            System.out.println("uno de los dos numeros en mayor a 25 ");
        }else {
            System.out.println("ningun numero es mayor a 25 ");
        }
    }
}
