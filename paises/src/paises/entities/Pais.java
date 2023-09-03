
package paises.entities;

import java.util.Objects;


public class Pais implements Comparable<Pais>{
    // ---ATRIBUTOS---//
    
    private String paise;
    
    // ---CONSTRUCSTOR POR DEFECTO---//

    public Pais() {
    }

    // ---CONSTRUCTOR POR ATRIBUTOS---//
    
    public Pais(String paise) {
        this.paise = paise;
    }
    
    // --- GETTES AND SETTERS ---//

    public String getPaise() {
        return paise;
    }

    public void setPaise(String paise) {
        this.paise = paise;
    }
    // ---equals hash code---//

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.paise);
        return hash;
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Pais other = (Pais) obj;
    return this.paise.equalsIgnoreCase(other.paise);
}

    
    
    
    // ---ATRIBUTOS---//

    @Override
    public String toString() {
        return "Pais{" + "paise=" + paise + '}';
    }

    @Override
    public int compareTo(Pais t) {
        return this.paise.compareTo(t.getPaise());
                
    }
    
    
    
}
