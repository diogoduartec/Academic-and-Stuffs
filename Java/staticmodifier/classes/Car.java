package staticmodifier.classes;
/**
 * Date 16/11/2017
 * @autor Diogo Duarte
 * Practicing static modifier
 * modifi
 */
public class Car {
    //limit speed should be 240km/h
    private String name;
    private double maxSpeed;
    public static double limitSpeed = 240;
    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public void print(){
        System.out.println("-----------------------------");
        System.out.println("Car: "+this.name);
        System.out.println("Max speed: "+this.maxSpeed);
        System.out.println("Limit speed: "+this.limitSpeed);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
