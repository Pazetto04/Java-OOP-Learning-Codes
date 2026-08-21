package RockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String username = input.nextLine();
        Player p1 = new Player(username);
        Bot bot = new Bot("Oponente");
        GameAlg game = new GameAlg(p1, bot);
        int option = 1;
        while (option == 1) {
            System.out.println("Rodada: " + game.getRoundCounter());
            game.startGame(input);
            System.out.println("Jogar a próxima rodada?");
            System.out.println("1 - Próxima rodada");
            System.out.println("2 - Não, encerrar jogo");
            System.out.println("Digite sua opção: ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    break;
                case 2:
                    game.finalLeaderboard();
                    System.out.println("---------------------");
                    System.out.println("Saindo do sistema!");
                    System.out.println("Obrigado por jogar!");
                    input.close();
                    break;
                default:
                    System.out.println("Valor inválido!");
            }

        }
    }
}
