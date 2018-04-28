package exercicios.associationsclassexercises.javaclass;

public class Address {
    private String street;
    private String city;

    public void print(){
        System.out.println("Street: "+this.street);
        System.out.println("City: "+this.city);
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
