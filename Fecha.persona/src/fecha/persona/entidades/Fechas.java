
package fecha.persona.entidades;

import java.util.Date;


public class Fechas {
    
    /* ---------- ATRIBUTOS -----------------*/
    
    private String name ;
    private Date fechaDenacimiento; 
    private int edad;
    
    /* ---------- CONSTRUCTORE POR DEFECTO -----------------*/
    
    public Fechas(){
        
    }
    /* ---------- CONSTRUCTORES POR ATRIBUTOS -----------------*/

    public Fechas(String name, Date fechaDenacimiento) {
        this.name = name;
        this.fechaDenacimiento = fechaDenacimiento;
        this.edad = edad;
    }
    /* ---------- GETTERS AND SETTERS  -----------------*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaDenacimiento() {
        return fechaDenacimiento;
    }

    public void setFechaDenacimiento(Date fechaDenacimiento) {
        this.fechaDenacimiento = fechaDenacimiento;
    }
    
    public int getedad(){
        return edad;
    }
    public  void setedad(){
        this.edad = edad;
    }

    public void setedad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

