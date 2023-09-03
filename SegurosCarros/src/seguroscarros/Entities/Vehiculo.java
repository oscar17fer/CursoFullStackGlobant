
package seguroscarros.Entities;


public class Vehiculo {
    
    // ----------- ATRIBUTOS ------------//
    
    private String marca; 
    private String modelo;
    private Integer anio;
    private Integer numeroDeMotor;
    private String chasis;
    private String color;
    private String tipo;
    
    // ----------- CONSTRUCTOR POR DEFECTO ------------//

    public Vehiculo() {
    }
    
    // ----------- CONSTRUCTOR POR ATRIBUTOS ------------//

    public Vehiculo(String marca, String modelo, Integer anio, Integer numeroDeMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }
    
    // ----------- GETTERS AND SETTERS  ------------//

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(Integer numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // ----------- TOSTRING ------------//

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroDeMotor=" + numeroDeMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}
