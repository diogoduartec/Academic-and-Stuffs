package sobrecargametodos.classes;

public class Employee {
    private String name;
    private String cpf;
    private double salary;
    private String rg;

    public Employee(){//Construtor
    }
    public Employee(String name, String cpf, double salary, String rg){//Construtor
        this.salary = salary;
        this.cpf = cpf;
        this.name = name;
        this.rg = rg;
    }

    public void init(String name, String cpf, double salary){
        this.salary = salary;
        this.cpf = cpf;
        this.name = name;
    }

    public void init(String name, String cpf, double salary, String rg){//SOBRE CARGA DE MÉTODOS
        init(name, cpf, salary);
        this.rg = rg;
    }
    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Salary: "+this.salary);
        System.out.println("RG: "+this.rg);
    }

    /*MODIFICADORES DE ACESSO*/

    public String getRg() {
        return rg;
    }
    public String getName(){
        return this.name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
