
package profesorclases.servicios;


import java.util.Scanner;
import profesorclases.entidades.Entidades;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public String[] cargarAlumno(){
        String [] nombres = new  String[5];
        
        System.out.println("ingrese el nombre de los alumnos son 5 ");
        for (int i = 0; i < 5; i++) {
            nombres[i]= leer.nextLine();
            
        }
        
        return nombres;
    }
    
    public Entidades crearCurso (){
        
        Entidades E1 = new Entidades();
        System.out.println("ingrese el nombre del curso");
        E1.setNombreCurso(leer.nextLine());
        System.out.println("ingrese cantidad de horas por dia ");
        E1.setCatidadHorasPorDia(leer.nextInt());
        System.out.println("ingrese cantidad de dias por semana ");
        E1.setCatidadDiasPorSemana(leer.nextInt());
        System.out.println("ingrese q turno es ");
        E1.setTurno(leer.nextLine());
        System.out.println("ingrese precio por hora");
        E1.setPrecioPorHora(leer.nextInt());
        E1.setAlumnos(cargarAlumno());
        
        return E1;
    } 
    public double calcularGananciasSemanales (Entidades curso){
       
        double gananciaSemanal = (curso.getCatidadHorasPorDia()*curso.getPrecioPorHora()*5*curso.getCatidadDiasPorSemana());
        
        return gananciaSemanal;
    }
   
    
}
