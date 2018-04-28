package sobrecargaconstrutores.classes;

/**
 * Date 16/11/2017
 * @autor Diogo Duarte
 * Practicing constructors overloading
 */
public class Student {
    private String registry;
    private String name;
    private double[] grade;
    private String dataMatricula;
    /**CONTRUCTORS*/
    public Student(String registry, String name, double... grade){
        this.registry = registry;
        this.grade = grade;
        this.name = name;
    }
    public Student(String registry, String name, String dataMatricula, double... grade){
        this(registry, name, grade);
        this.dataMatricula = dataMatricula;
    }
    public Student(){
    }
    /**A method to print the class values*/
    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Registry: "+this.registry);
        System.out.print("Grade:");
        for(double x : this.grade) System.out.print(" "+x);
        System.out.println();
    }
    /**ACCESS METHODS*/
    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrade() {
        return grade;
    }

    public void setGrade(double[] grade) {
        this.grade = grade;
    }
}
