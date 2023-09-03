
package fecha.persona.servicios;

import fecha.persona.entidades.Fechas;
import java.util.Date;
import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public Fechas crearPersonaFechas(){
        Fechas f1 = new Fechas();
        
        System.out.println("ingrese su nombre");
        f1.setName(leer.nextLine());
        System.out.println("ingrese el año el q nacio");
        int anio  = leer.nextInt();
        System.out.println("ingrese el mes el q nacio");
        int mes  = leer.nextInt();
        System.out.println("ingrese el dia el q nacio");
        int dia  = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia );
        f1.setFechaDenacimiento(fecha);
        return f1;
    }
    
    public void calcularEdad(Fechas f1){
        
        Date fechaActual = new Date();
        f1.setedad(fechaActual.getYear()-f1.getFechaDenacimiento().getYear());
        System.out.println("su edad es " + f1.getedad());
    }
    public void menorQue(Fechas f1){
        System.out.println("ingrese el año el q nacio 2p");
        int anio  = leer.nextInt();
        System.out.println("ingrese el mes el q nacio 2p");
        int mes  = leer.nextInt();
        System.out.println("ingrese el dia el q nacio 2p");
        int dia  = leer.nextInt();
        
        
        Date hoy = new Date();
        Date fecha2p = new Date(anio - 1900, mes - 1, dia );
        int edad2 = hoy.getYear()-fecha2p.getYear();
        
        if (f1.getedad() > edad2){
            boolean respuesta = false;
        }else {
            boolean respuesta = true;
        }
    }
    
    public void mostrarPersona (Fechas f1){
        System.out.println("el nombre de la persona es " + f1.getName());
        System.out.println("la edad es " + f1.getedad());
    }
    
}
