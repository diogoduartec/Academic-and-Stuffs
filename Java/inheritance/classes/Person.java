package inheritance.classes;
/**
 * @autor Diogo Duarte
 * data: 21/11/2017
 * Introduction to inheritance
 */
public class Person {
    protected String name;
    protected String cpf;
    protected Address address;
    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Address: "+this.address.getStreet()+" - "+this.address.getStreet()+" - "+this.address.getNumber());
    }
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}