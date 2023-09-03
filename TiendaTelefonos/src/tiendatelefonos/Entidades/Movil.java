
package tiendatelefonos.Entidades;


public class Movil {
    // ------------------- ATRIBUTOS ----------------//
    
    private String marca;
    private int precio;
    private String model;
    private int memoriaRam; 
    private int almacenamieto; 
    private int [] codigo = new int [7];
    
    
    // ------------------- CONSTRUCTOR POR DEFECTO ----------------//
    
    public Movil(){
        
    }
    
    // ------------------- CONTROCTOR CON ATRIBUTOS  ----------------//

    public Movil(String marca, int precio, String model, int memoriaRam, int almacenamieto) {
        this.marca = marca;
        this.precio = precio;
        this.model = model;
        this.memoriaRam = memoriaRam;
        this.almacenamieto = almacenamieto;
    }
    // ------------------- ATRIBUTOS ----------------//

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamieto() {
        return almacenamieto;
    }

    public void setAlmacenamieto(int almacenamieto) {
        this.almacenamieto = almacenamieto;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    

   
    
}
