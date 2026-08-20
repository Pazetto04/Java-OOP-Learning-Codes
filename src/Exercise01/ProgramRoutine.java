package Exercise01;

import java.util.Scanner;

public class ProgramRoutine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do personagem!");
        String name = input.nextLine();
        System.out.println("O nome do personagem é: " + name);
        Person user = new Person(name);
        System.out.println("\n ===== Menu =====");
        System.out.println("== Simulador de Rotina ==");
        System.out.println("\n ================");
        System.out.println("1. Acordar");
        System.out.println("2. Comer");
        System.out.println("3. Parar de Comer");
        System.out.println("4. Dirigir");
        System.out.println("5. Para de Dirigir");
        System.out.println("6. Dormir");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        int option;
        do {
            option = input.nextInt();
            input.nextLine(); // Limpar o buffer do scanner

            switch (option) {
                case 1 -> user.wakeUp();
                case 2 -> user.eat();
                case 3 -> user.stopEating();
                case 4 -> user.drive();
                case 5 -> user.stopDriving();
                case 6 -> user.sleep();
                case 0 -> System.out.println("Encerrando Simulação");
                default -> System.out.println("Valor inválido, tente novamente");
            }

        } while (option != 0);


    }
}
