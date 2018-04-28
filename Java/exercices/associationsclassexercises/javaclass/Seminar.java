package exercicios.associationsclassexercises.javaclass;


public class Seminar {
    private String title;
    private Student[] students;
    private Teacher teacher;
    private Address adress;

    public void print(){
        System.out.println("Title: "+this.title);
        System.out.println("Teacher: "+this.teacher.getName());
        System.out.println("Address:");
        this.adress.print();
        if(this.students == null) System.out.println("No student's register");
        else {
            System.out.println("Students:");
            for (Student student : students)
                System.out.println(student.getName());
        }
    }

    public Seminar(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
    }
    public Seminar(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student... students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
