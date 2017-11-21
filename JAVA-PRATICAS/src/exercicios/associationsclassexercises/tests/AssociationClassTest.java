package exercicios.associationsclassexercises.tests;


import exercicios.associationsclassexercises.javaclass.Address;
import exercicios.associationsclassexercises.javaclass.Seminar;
import exercicios.associationsclassexercises.javaclass.Student;
import exercicios.associationsclassexercises.javaclass.Teacher;


public class AssociationClassTest {
    public static void main(String[] args) {
        Student student1 = new Student("William",17);
        Student student2 = new Student("Susan",15);
        Student student3 = new Student("Marcus",17);
        Student student4 = new Student("Joana",19);
        Teacher teacher = new Teacher("Steven", 35, "Security");
        Seminar seminar = new Seminar("Work Security");
        Address address = new Address("AB152", "New Atlantic");
        seminar.setTeacher(teacher);
        seminar.setAdress(address);
        seminar.setStudents(student1, student2, student3, student4);
        seminar.print();
        teacher.setSeminars(seminar);
        student1.setSeminar(seminar);
        student2.setSeminar(seminar);
        student3.setSeminar(seminar);
        student4.setSeminar(seminar);
        System.out.println("---------------------------------------------");
        student1.print();
        System.out.println("---------------------------------------------");
        address.print();
        System.out.println("---------------------------------------------");
        teacher.print();
    }
}
