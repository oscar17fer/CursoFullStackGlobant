
package Tienda;


public class TiendaEntidades {
    
    // -------- ATRIBUTOS -------
    
    private String product;
    private Integer precio;
    
    // -------- CONSTRUCTOR -------
    
    public TiendaEntidades() {
    }
    
    // -------- CONSTRUCTOR POR ATRIBUTOS -----
    
    public TiendaEntidades(String product, Integer precio) {
        this.product = product;
        this.precio = precio;
    }

   
    
    // -------- GETTES AND SETTERS -------
   
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    
    // -------- TO STRING -------

    @Override
   /* public String toString() {
        return "TiendaEntidades{" + "product=" + product + ", precio=" + precio + '}';
    }*/
    public String toString() {
         return "Product: " + product + ", Price: " + precio;
    }
    
    
}
