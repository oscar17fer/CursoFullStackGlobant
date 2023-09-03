
package fechas;


import java.util.Date;
import java.util.Scanner;


public class Fechas {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.println("por favor ingres el dia ");
        int dia = leer.nextInt();
        
        System.out.println("por favor ingres el mes ");
        int mes = leer.nextInt();
        
        System.out.println("por favor ingres el anio ");
        int anio = leer.nextInt();
        
        Date year = new Date(anio-1900);
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        
        System.out.println(fecha);
        
        
        Date hoy = new Date();
        
        int antiguedad = hoy.getYear() - fecha.getYear();
        System.out.println(antiguedad);
        
        
    }
    
}
