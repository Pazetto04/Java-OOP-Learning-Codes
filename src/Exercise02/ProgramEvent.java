package Exercise02;

import java.util.Scanner;

public class ProgramEvent extends Event {

    private static void displayMenu() {
        System.out.println("\n======= MENU =======");

        System.out.println("1- Reservar");
        System.out.println("2- Cancelar Reserva");
        System.out.println("3- Exibir Status");
        System.out.println("4- Exibir Menu Novamente");
        System.out.println("0- Sair");
        System.out.println("Selecione uma opção: ");
    }

    private static void choseOptionText() {
        System.out.println("Selecione a próxima opção: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a capacidade do evento: ");
        System.out.println("Pressionar ENTER utilizará o valor padrão de 10 lugares");

        String lineCap = input.nextLine().trim();

        Event event;

        if (lineCap.isEmpty()) {

            event = new Event();
        } else {
            try {
                int cap = Integer.parseInt(lineCap);
                event = new Event(cap);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Utilizando valor padrão");
                event = new Event();
            }
        }
        displayMenu();

        while (true) {

            String option = input.nextLine().trim();

            switch (option) {
                case "1" -> event.reserveChairs();
                case "2" -> event.cancelChairs();
                case "3" -> event.showStatus();
                case "4" -> displayMenu();
                case "0" -> {
                    System.out.println("Encerrando o sistema");
                    input.close();
                    return;
                }
                default -> System.out.println("Valor inválido!");
            }
            choseOptionText();
        }
    }
}
