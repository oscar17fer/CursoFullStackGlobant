/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerjunit.services;

/**
 *
 * @author HP
 */
public class Descuento {
    
    //------ATRIBUTOS-----//
    
    private String producto;
    private int precio;

    public Descuento() {
    }

    public Descuento(String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
