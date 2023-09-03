
package notasalumnos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import notasalumnos.Entities.Alumno;


public class services {
    Scanner leer = new Scanner(System.in);
    private List <Alumno> listaAlumno;
   
   public services(){
       listaAlumno = new ArrayList<>();
   }
   
   public void crearAlumnos (){
       String anwser =  "si";
       
       while(anwser.equalsIgnoreCase("si")){
           System.out.println("ingrese el nombre del alumno ");
           String nombre = leer.nextLine();
           
           List<Integer> notas = new ArrayList<>();
           for (int i = 0; i < 3; i++) {
               System.out.println("por favor ingrese la nota de la materia No" + (i+1));
               int nota = Integer.parseInt(leer.nextLine());
               notas.add(nota);
           }
           
           Alumno alumno = new Alumno(nombre, notas);
           listaAlumno.add(alumno);
           
           System.out.println("Desea agregar otro alumno");
           anwser = leer.nextLine();
           
       }
       
   }
   
   public double notaFinal(String nombreAlumno){
       for (Alumno aux : listaAlumno) {
           if(aux.getNombre().equalsIgnoreCase(nombreAlumno)){
               List<Integer> notas = aux.getNotas();
               double sumaNotas = 0;
               for (int nota : notas){
                   sumaNotas += nota;
               }return sumaNotas/notas.size();
           }
       }return -1;
   }
   
}
