package RockPaperScissors;

import java.util.Scanner;

public class GameAlg {
    private Player player;
    private Bot bot;
    private int roundCounter;

    public GameAlg(Player player, Bot bot) {
        this.player = player;
        this.bot = bot;
        this.roundCounter = 1;
    }

    public void startGame(Scanner input) {
        load();
        System.out.println("\n ==== Início de Jogo ==== \n ");
        player.choose(input);
        bot.choose(input);
        System.out.println("\n Escolha de " + player.getName() + " ➡️ " + player.getChoice() + " ==== VS ==== " +  bot.getChoice()  + " ⬅️ escolha do (a) "+ bot.getName());
        checkWinner();
        showLeaderboard();
    }

    private void showLeaderboard() {
        if (player.getScore() > bot.getScore()) {
            System.out.println("\n ==== Placar ==== ");
            System.out.println(player.getName() + ": " + player.getScore() + " 🏆");
            System.out.println(bot.getName() + ": " + bot.getScore() + " 🥈");
        } else if (bot.getScore() > player.getScore()) {
            System.out.println("\n ==== Placar ==== ");
            System.out.println(bot.getName() + ": " + bot.getScore() + " 🏆");
            System.out.println(player.getName() + ": " + player.getScore()  + " 🥈");
        }else {
            System.out.println("\n ==== Placar ==== ");
            System.out.println(bot.getName() + ": " + bot.getScore());
            System.out.println(player.getName() + ": " + player.getScore());
        }
    }
    public void finalLeaderboard(){
        if (player.getScore() > bot.getScore()) {
            System.out.println("\n ==== Placar Final ==== ");
            System.out.println(player.getName() + ": " + player.getScore() + " 🏆");
            System.out.println(bot.getName() + ": " + bot.getScore() + " 🥈");
            System.out.println("Rodadas: " + getRoundCounter());
        } else if (bot.getScore() > player.getScore()) {
            System.out.println("\n ==== Placar Final ==== ");
            System.out.println(bot.getName() + ": " + bot.getScore() + " 🏆");
            System.out.println(player.getName() + ": " + player.getScore()  + " 🥈");
            System.out.println("Rodadas: " + getRoundCounter());
        }else {
            System.out.println("\n ==== Placar Final ==== ");
            System.out.println(" ---- Empate ----");
            System.out.println(bot.getName() + ": " + bot.getScore());
            System.out.println(player.getName() + ": " + player.getScore());
            System.out.println("Rodadas: " + getRoundCounter());
        }
    }

    public void increaseRoundCounter() {
        roundCounter++;
    }

        private void load(){
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(600);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            System.out.println("\n Erro durante o processamento.");
        }
    }
    private void checkWinner() {
        increaseRoundCounter();
        String playerChoice = player.getChoice();
        String botChoice = bot.getChoice();
        if (playerChoice.equals(botChoice)) {
            System.out.println("\n Empate!");
            player.increaseScore();
            bot.increaseScore();
        } else if (
                (playerChoice.equals("Pedra") && botChoice.equals("Tesoura")) ||
                        (playerChoice.equals("Papel") && botChoice.equals("Pedra")) ||
                        (playerChoice.equals("Tesoura") && botChoice.equals("Papel"))
        ) {
            System.out.println(" \n ==== VENCEDOR ==== ");
            System.out.println(player.getName());
            player.increaseScore();


        } else {
            System.out.println(" \n ==== VENCEDOR ==== ");
            System.out.println(bot.getName());
            bot.increaseScore();
        }
    }

    public int getRoundCounter() {
        return roundCounter;
    }
}

