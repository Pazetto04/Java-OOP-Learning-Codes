package Inheritance;

import Inheritance.ExampleSon;
import Inheritance.ExampleFather;
import Inheritance.ExampleGrandfather;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExampleSon studentData = new ExampleSon();
        ExampleSon2 studentData2 = new ExampleSon2();

        System.out.println();

        studentData.schoolInfoPrint();
        studentData.printOnConsole();
        studentData.grandfatherMethod();
        studentData2.schoolInfoPrint();
        studentData2.printOnConsole();

        System.out.println("Cadastrando um aluno com dados informados pelo usuário: ");
        System.out.println("Digite o código do aluno: ");
        String code = input.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String name = input.nextLine();
        System.out.println("Digite o sexo do aluno: ");
        String gender = input.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int age = input.nextInt();
        input.nextLine(); //Limpando o buffer do teclado para evitar problemas com o próximo input
        ExampleSon studentData3 = new ExampleSon(code, name, gender, age);
        System.out.println("Dados inseridos: ");
        studentData3.printOnConsole();

    }
}
