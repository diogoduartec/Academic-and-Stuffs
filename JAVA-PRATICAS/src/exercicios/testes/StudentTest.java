package exercicios.testes;

import exercicios.metodoseclasses.Student;

public class StudentTest {
    public static void main(String... args){
        Student aluno = new Student();
        aluno.name = "Joãozinho";
        aluno.age = 12;
        aluno.grade = new double[]{4, 7, 8, 7};
        aluno.print();
        aluno.average();
    }
}
