/*
esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
*/
package juegoruletarusadeagua.SERVICIOS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import juegoruletarusadeagua.RevolverAgua.JugadorEntities;
import juegoruletarusadeagua.RevolverAgua.RevolverAgua;
import juegoruletarusadeagua.SERVICIOS.RevolverAguarServicios;

public class JugadorServicios {
    
    Scanner leer = new Scanner(System.in);
    public List<JugadorEntities> jugadores = new ArrayList<>();
    
    
public void builtGamers() {
    RevolverAguarServicios r1 = new RevolverAguarServicios(); // Asegúrate de crear la instancia aquí
    jugadores = new ArrayList<>();
    for (int i = 0; i < 7; i++) {
        JugadorEntities jugador = new JugadorEntities();
        jugador.setId(i+1);
        System.out.println("escribir un nombre de jugador");
        jugador.setNombre(leer.nextLine());
         
        jugador.setMojado(r1.mojar());
         
        if (jugador.getMojado()) {
            System.out.println("¡El jugador " + jugador.getNombre() + " ha sido mojado!");
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " se ha salvado del agua.");
        }
        jugadores.add(jugador);
    }
}
    
    public void disparo(){
        
        for (JugadorEntities jugadore : jugadores) {
            if (jugadore.getMojado()) {
                System.out.println("**** EL JUGADOR HA SIDO MOJADO *****");
                break;
            }else{
                System.out.println("---- EL JUGADOR SE HA SALVADO SIGUIENTE -----");
            }
        }
    }
    
}
