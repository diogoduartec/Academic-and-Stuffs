package exercicios.associationsclassexercises.javaclass;

public class Teacher {
    private String name;
    private int age;
    private String matter;
    private Seminar[] seminars;

    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Matter: "+this.matter);
        System.out.println("Seminars:");
        for(Seminar seminar : this.seminars)
            System.out.println(seminar.getTitle());
    }

    public Teacher(String name, int age, String matter) {
        this.name = name;
        this.age = age;
        this.matter = matter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar... seminars) {
        this.seminars = seminars;
    }
}
