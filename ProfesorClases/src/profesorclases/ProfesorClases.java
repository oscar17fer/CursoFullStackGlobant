
package profesorclases;


import profesorclases.entidades.Entidades;
import profesorclases.servicios.Servicios;


public class ProfesorClases {

    
    public static void main(String[] args) {
        
        Servicios s1 = new Servicios();
        
        Entidades curso;
        
        curso = s1.crearCurso();
        
        double ganancias = s1.calcularGananciasSemanales(curso);
        
        System.out.println("la ganancia es : $ " + ganancias + "semanales");        
        
        
        
    }
    
}
