/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
package adoptions;

import Persona.Entidades.Perro;
import Persona.Entidades.Persona;
import java.util.ArrayList;
import java.util.List;


public class Adoptions {

    
    public static void main(String[] args) {
        List<Perro> perros = new ArrayList<Perro>();
        List<Perro> perrosSecond = new ArrayList<Perro>();
        Perro p1 = new Perro("Mila", 1, "Criolla", "Grande");
        Perro p2 = new Perro("Bruno", 3, "freshpull", "pequenio");
        
        perros.add(p1);
        perrosSecond.add(p2);
        
        Persona s2 = new Persona("monty", "estrada", 5, 465789, perros);
        Persona s1 = new Persona("jose", "estrada", 56, 564169846, perrosSecond );
        
        
        System.out.println(s1);
        System.out.println(s2);
       
    }   
    
}
