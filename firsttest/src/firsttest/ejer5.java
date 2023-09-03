
package firsttest;

import java.util.Scanner;


public class ejer5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingres los grados centigrados pls");
        double centigrados = leer.nextDouble();
        double F = 32 + (9 * centigrados / 5);
        System.out.println("  resultado: " + F);

    }
}