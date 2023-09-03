
package arrays;

import java.util.Arrays;

        

public class arrays {

 
    public static void main(String[] args) {
       
        int n = 50;
        
        int []A1 = new int [n];
        for (int i = 0; i < n; i++) {
            A1[i] = (int)(Math.random()*99);
            
        }
        print(A1);
        
        int m = 20;
        
        int []A2 = new int [m];
        for (int i = 0; i < m; i++) {
            A2[i] = (int)(Math.random()*99);
            
        }
        print(A2);
        
        //------------------------- ORDENAR ------------------//
        
       Arrays.sort(A1);
        print(A1);
        
        //------------------------- COPY ------------------//
        
        int A3[]=Arrays.copyOf(A1, 10);
        
        //------------------------- PASTE ------------------//
        
        
        //------------------------- LOS ULTIMOS 10 NUMEROS ------------------//
        Arrays.fill(A2, 0, 10,(int) 0.5);
        print(A2);
        
        
    }
    
    public static void print (int A1[]){
        System.out.println(" ");
        
        for (int i = 0; i < A1.length; i++) {
            System.out.println(A1[i]);
        }
    }
}
