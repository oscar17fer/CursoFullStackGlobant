/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttest;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NextLine {
    public static void main(String []arg){
    Scanner leer = new Scanner(System.in);
    
        System.out.println("escriba su nombre");
        String name = leer.nextLine();
        
        System.out.println("dame tu edad");
        int edad = leer.nextInt();
        
        System.out.println("ingresar un numero double");
        double num = leer.nextDouble();
        
        System.out.println(name);
        System.out.println(edad);
        System.out.println(num);
        
    }
    
}
