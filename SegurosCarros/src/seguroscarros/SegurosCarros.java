
package seguroscarros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import seguroscarros.Entities.Clientes;
import seguroscarros.Entities.GestionDePoliza;
import seguroscarros.Entities.Vehiculo;
import seguroscarros.services.Services;


public class SegurosCarros {

    
    public static void main(String[] args) {
        
        List<GestionDePoliza> gestiones =  new ArrayList<>();
        
        
        Clientes cliente = new Clientes("Monica", "Rubio", 159, "moni@gmail.com", "carrera 14 mesa", 32058811);
        Clientes cliente2 = new Clientes("Sebatian", "Montoya", 753, "monty@gmail.com", "carrera 111 la rivera", 321587469);
        Clientes cliente3 = new Clientes("Martin", "Estrada", 357, "martin@gmail.com", "carrera 112 porvenir", 311565874);
        
        Vehiculo vehiculo = new Vehiculo("chevrolet", "cruiz", 2015, 789, "chasís con riostra", "negro", "sedan");
        Vehiculo vehiculo2 = new Vehiculo("reanult", "setpway", 2012, 156, "chasís sin riostra", "gris", "usb");
        Vehiculo vehiculo3 = new Vehiculo("chevrolet", "captiva", 2023, 458, "chasís sin largeros", "rojo", "camioneta");
        
        GestionDePoliza gestion = new GestionDePoliza(vehiculo, cliente, 10, LocalDate.of(2023, 5, 31), LocalDate.of(2024, 5, 31), 12,  "CC", 29000000);
        GestionDePoliza gestion2 = new GestionDePoliza(vehiculo2, cliente2, 20, LocalDate.of(2023, 5, 31), LocalDate.of(2024, 5, 31), 12,  "CC", 46543453);
        GestionDePoliza getion3 = new GestionDePoliza(vehiculo3, cliente3, 30, LocalDate.of(2023, 8, 31), LocalDate.of(2024, 8, 31), 10, "credito", 895412000);
        
        gestiones.add(gestion);
        gestiones.add(gestion2);
        gestiones.add(getion3);
        
        Services s1 = new Services();
        
        for (GestionDePoliza gestione : gestiones) {
            if (s1.Gestioncuotas() == gestione.getNumeroDePoliza()) {
                System.out.println("el cliente " + gestion.getCliente().getName() + "esta en el numero de cuota" + gestione.getNumeroCuotas());
            }
        }
        
    }
    
}
