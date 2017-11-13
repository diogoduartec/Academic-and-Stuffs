package exercicios.metodoseclasses;

public class Student {
    public String name;
    public double[] grade;
    public int age;
    public void print(){
        System.out.println("Aluno: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.print("Notas:");
        for(double x: this.grade){
            System.out.print(" "+x);
        }
    }
    public void average(){
        double sum = 0;
        for(double x: this.grade) {
            sum += x;
        }
        System.out.println("\nA média é: "+sum/grade.length);
        if(sum/grade.length>=6) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
}
