package Inheritance;

public class ExampleFather extends ExampleGrandfather{
    public String code;

    public String name;

    public String gender;

    public int age;

    public void printOnConsole() {
        System.out.println("================ Dados Aluno ================");
        System.out.println("Código: " + code);
        System.out.println("Nome: " + name);
        System.out.println("Sexo: " + gender);
        System.out.println("Age: " + age);
        System.out.println();


    }
}
