
package animales.entites;


public class AnimalesEntities {
    // --------------- ATRIBUTOS -----------------------//
    protected String name;
    protected String alimento;
    protected int edad;
    protected String razaDeAnimal;
    
    // ---------------- CONSTRUCTOR PO DEFECTO ----------------//

    public AnimalesEntities() {
        
    }
    
    // ---------------- CONSTRUCTOR PO ATRIBUTO ----------------//

    public AnimalesEntities(String name, String alimento, int edad, String razaDeAnimal) {
        this.name = name;
        this.alimento = alimento;
        this.edad = edad;
        this.razaDeAnimal = razaDeAnimal;
    }

    
    
    // ---------------- GETTERS AND SETTERS ----------------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaDeAnimal() {
        return razaDeAnimal;
    }

    public void setRazaDeAnimal(String razaDeAnimal) {
        this.razaDeAnimal = razaDeAnimal;
    }
    
    // -------------- TOSTRING --------------------//

    @Override
    public String toString() {
        return "AnimalesEntities{" + "name=" + name + ", alimento=" + alimento + ", edad=" + edad + ", razaDeAnimal=" + razaDeAnimal + '}';
    }
    
    public void alimentar(){
        
        System.out.println(alimento);

}
    
}


    