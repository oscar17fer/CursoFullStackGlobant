
package Tienda.servicios;

import Tienda.TiendaEntidades;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TiendaServicios {
    Scanner leer = new Scanner(System.in);
    Set <TiendaEntidades> infoProduct = new HashSet<>();
    
    public void showMenu(){
        
        int answer = 0;
        
        while (answer != 5) {
            System.out.println("*** WELCOME TO YOUR APP STORE ***");
        System.out.println(" ");
        System.out.println("selecct one option");
        System.out.println(" ");
        System.out.println("1. add product");
        System.out.println("2. change price ");
        System.out.println("3. delete product");
        System.out.println("4. show list of prodcuts ");
        System.out.println("5. log out");
        answer = leer.nextInt();
        
        switch (answer) {
            case 1:
                addProduct();
                break;
            case 2:
                changePrice();
                break;
            case 3:
                deleteProduct();
                break;   
                
            case 4:
                printProducts();
                break;      
            default:
                throw new AssertionError();
        }
        }
    }
    
    public Set<TiendaEntidades> addProduct(){
        TiendaEntidades t1 = new TiendaEntidades();
        
        System.out.println("enter the product");
        leer.nextLine(); 
        t1.setProduct(leer.nextLine());
        
        System.out.println("enter the price");
        t1.setPrecio(leer.nextInt());
        TiendaEntidades tienda = new TiendaEntidades(t1.getProduct(), t1.getPrecio());
        infoProduct.add(tienda);
        
        return infoProduct;
    }
    
    public void changePrice(){
        System.out.println("enter the product name to change the price");
        String productName = leer.nextLine();
        
        for (TiendaEntidades product : infoProduct) {
            if (product.getProduct().equalsIgnoreCase(productName)){
                System.out.println("Enter the new price");
                int newPrice = leer.nextInt();
                
                // Cambiar el precio del producto
                product.setPrecio(newPrice);
                System.out.println("Price update for " + productName);
                return;
            }
        }
        System.out.println("Product not found : " + productName);
    }
    
    public void deleteProduct(){
        System.out.println("enter the product to delete");
        String delete = leer.nextLine();
        TiendaEntidades productToRemove = null;
         for (TiendaEntidades product : infoProduct) {
             if (product.getProduct().equalsIgnoreCase(delete)) {
                 productToRemove = product;
                 break;
             }
        }
         
         if (productToRemove != null) {
            infoProduct.remove(productToRemove);
            System.out.println("Product removed: " + delete);
    }    else {
         System.out.println("Product not found: " + delete);
    }
        
    }
    
    public void printProducts(){
        for (TiendaEntidades tiendaEntidades : infoProduct) {
            System.out.println(tiendaEntidades);
        }
    }
     
}
