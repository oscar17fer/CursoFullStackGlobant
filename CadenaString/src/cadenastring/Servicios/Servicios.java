
package cadenastring.Servicios;

import cadenastring.entidades.Cadena;
import java.util.Scanner;


public class Servicios {
    
    Scanner leer = new Scanner(System.in);
    public Cadena crearCadena(){
        Cadena c1 = new Cadena ();
        
        System.out.println("ingrese una frase ");
        c1.setFrase(leer.nextLine());
        
        c1.setLogitud(c1.getFrase().length());
        
        return c1;
    }
    
    public int mostrarVocales (Cadena c1){
        String[] A1 = new String[c1.getLogitud()];
        int contador = 0;
        for (int i = 0; i < c1.getLogitud(); i++) {
            String letra = c1.getFrase().substring(i, i);
            A1[i]=letra;
            if ((c1.getFrase().charAt(i)) == 'a'|| (c1.getFrase().charAt(i)) == 'e'|| (c1.getFrase().charAt(i)) == 'i'|| (c1.getFrase().charAt(i)) == 'o'|| (c1.getFrase().charAt(i)) == 'u'  ){
                contador++;
            }
        }
        System.out.println("la cantidad de vocales q tiene la frase es " + contador); 
        return contador;
    }
    
    public String invetirFrase (Cadena c1){
        String respuesta = "";
        
        for (int i = c1.getLogitud()-1; i > 0; i--) {
            respuesta += c1.getFrase().charAt(i);
        }
        
        System.out.println(respuesta);
       
            return respuesta;
        }
    
    public int vecesRepetida (Cadena c1){
        
        System.out.println("porfavor ingrese la letra que desea saber cuato se repitio");
        String letra = leer.nextLine();
        int contador = 0;
        int pos = 0;
        pos = c1.getFrase().indexOf(letra);
        while (pos != -1) {
            contador++;
            pos=c1.getFrase().indexOf(letra, pos+1);
            
        }
        System.out.println("el numero de veces es " + contador);
        return contador;
    }
    
    public void compararLongitud (Cadena c1){
        System.out.println("escribir una frase para ver cual es la frase mas larga ");
        String segundaFrase =  leer.nextLine();
        
        int largor = segundaFrase.length();
        
        if (c1.getLogitud() > largor){
            System.out.println("la primera frase es mas larga ");
        }else if (c1.getLogitud() == largor ){
            System.out.println("la longitud de las frases es igual");   
        }else {
            System.out.println("la segunda frase es mas larga ");
        }
    }
    
    public void unirFrase (Cadena c1){
        System.out.println("ingrsear una frase para unir con la primera");
        String frase = leer.nextLine();
        
        System.out.println(c1.getFrase() + frase);
    }
    
    public String reemplazar (Cadena c1){
        String letraParaRemplazar = "a";
        System.out.println("cual es la letra que deseea q remplace la a");
        String letraDelUsuraio = leer.nextLine();
        String newMessage = c1.getFrase().replace(letraParaRemplazar, letraDelUsuraio);
        System.out.println(newMessage);
        return newMessage;
    }
    
    public void contiene (Cadena c1){
        System.out.println("ingrese la letra q deseea saber si esta ");
        String letra = leer.nextLine();
        
        int verificacion = c1.getFrase().indexOf(letra);
        
        if (verificacion != -1 ) {
            System.out.println("la letra si se encuentra");
        }else {
            System.out.println("la letra no se encuentra");
        }
    }
        
}
    
