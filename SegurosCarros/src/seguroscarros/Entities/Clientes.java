package seguroscarros.Entities;



public class Clientes {
    
    // ----------- ATRIBUTOS ------------//
    private String name;
    private String lastName;
    private Integer id;
    private String mail;
    private String address;
    private Integer phone;
    
    // ----------- CONSTRUCTOR POR DEFECTO  ------------//

    public Clientes() {
    }
    // ----------- CONSTRUCTOR POR ATRIBUTOS ------------//

    public Clientes(String name, String lastName, Integer id, String mail, String address, Integer phone) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.mail = mail;
        this.address = address;
        this.phone = phone;
    }
    
    // ----------- GETTERS AND SETTERS ------------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    
    // ----------- TOSTRING ------------//

    @Override
    public String toString() {
        return "Clientes{" + "name=" + name + ", lastName=" + lastName + ", id=" + id + ", mail=" + mail + ", address=" + address + ", phone=" + phone + '}';
    }
    
    
    
}
