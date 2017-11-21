package exercicios.associationsclassexercises.javaclass;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        if(this.seminar == null)
            System.out.println("Seminar: No register yet");
        else System.out.println("Seminar: "+this.seminar.getTitle());
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
