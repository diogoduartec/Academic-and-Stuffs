package inheritance.classes;

/**
 * @autor Diogo Duarte
 * data: 21/11/2017
 * Introduction to inheritance
 */
public class Address {
    private String street;
    private String city;
    private int number;

    public Address(String street, String city, int number) {
        this.street = street;
        this.city = city;
        this.number = number;
    }

    public Address() {
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
