
package notasalumnos;
import java.util.Scanner;
import notasalumnos.services.services;

public class NotasAlumnos {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        services s1 = new services();
        s1.crearAlumnos();
        
        System.out.println("integre el nombre del estudiante a ver las el promedio final ");
        String nombreAlumno = leer.nextLine();
        
        double notaFinal =s1.notaFinal(nombreAlumno);
        
        if (notaFinal >= 0) {
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
        } else {
            System.out.println("El alumno " + nombreAlumno + " no se encuentra en la lista.");
        }
    }
    
}
