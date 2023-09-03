
package Sueldo.Entidades.Servicios;

import Sueldo.Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;


public class VendedorServicio {
    Scanner leer = new Scanner (System.in);
    public Vendedor altVendedor(){
    

        
        Vendedor v1 = new Vendedor();
        
       
        
        System.out.println("ingrese el nombre del vendedor : ");
        v1.setName(leer.next());
        System.out.println("ingrese el nombre del dni : ");
        v1.setDni(leer.nextInt());
        System.out.println("ingrese el nombre del sueldo base : ");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("ingrese el dia que comenzo a trabajar ");
        int dia = leer.nextInt();
        System.out.println("ingrese el dia que comenzo a mes ");
        int mes = leer.nextInt();
        System.out.println("ingrese el dia que comenzo a anio ");
        int anio = leer.nextInt();
        Date fecha = new Date (anio-1900, mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
    
    
    
        
    }
    
    public void sueldoMensual(Vendedor v1){
        System.out.println("ingrese cuales fueron las ventas totales ");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("el sueldo mensual del vendedor " + v1.getName() + " es de $" + v1.getSueldoMensual());
    }
    
    public void vacaciones (Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio() .getYear();
        
        if (antiguedad<5){
            System.out.println("le corresponde 14 dias de vacaciones");   
        } else if (antiguedad<10){
            System.out.println("le corresponden 21 dias ");
        }else if (antiguedad<20){
            System.out.println("le corresponden 28 dias ");
        }else if (antiguedad>20){
            System.out.println("le corresponden 35 dias ");   
        }else{
            System.out.println("vacaciones provicionales ");
        }
    }
}

