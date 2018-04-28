package sobrecargaconstrutores.tests;
import sobrecargaconstrutores.classes.Student;
public class StudentTest {
    public static void main(String[] args) {
        Student aluno = new Student("A12021", "Marcos Vinicius", 6.5, 6.9, 8.5);
        aluno.print();
    }
}
