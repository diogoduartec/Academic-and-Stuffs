package exercicios.testes;

import exercicios.metodoseclasses.Student;

public class StudentTest {
    public static void main(String... args){
        Student aluno = new Student();
        aluno.setAge(12);
        aluno.setGrade(6, 5, 4, 8);
        aluno.setName("João");
        aluno.print();
        aluno.average();
        System.out.println("\nnomeeee: "+aluno.getName());
    }
}
