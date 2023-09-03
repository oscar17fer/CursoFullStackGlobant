
package servircartasEntities;


public class Cartas {
    
    //-------- ATRIBUTOS ------------//
    
    private Integer numeroCarta;
    private String palo;
    
    //------ CONSTRUCTOR POR DEFECTO -----//

    public Cartas() {
    }
    
    
    //------ CONSTRUCTOR POR ATRIBUTO -----//

    public Cartas(Integer numeroCarta, String palo) {
        this.numeroCarta = numeroCarta;
        this.palo = palo;
    }
    
    //------ GETTERS AND SETTERS -----//

    public Integer getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(Integer numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    //----- TO STRING ------//

    @Override
    public String toString() {
        return "Cartas{" + "numeroCarta=" + numeroCarta + ", palo=" + palo + '}';
    }
    
    
    
}
