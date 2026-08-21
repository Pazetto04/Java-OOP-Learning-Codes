package RockPaperScissors;

import java.util.Scanner;

public class Player {
   private String name;
   private String choice;
   private int score = 0;

   public Player(String name){
       this.name = name;
   }

   public String getName(){
       return name;
   }

   public String getChoice(){
       return choice;
   }
    public void setChoice(String escolha) {
        this.choice = escolha;
    }
    public int getScore(){
       return score;
    }
    public void increaseScore(){
       this.score ++;
    }

   public void choose(Scanner input){
       System.out.println("O oponente já está pronto ✅");
       System.out.println("As opções são: ");
       System.out.println("1- Pedra");
       System.out.println("2- Papel");
       System.out.println("3- Tesoura");
       System.out.println( name + ", qual é a sua escolha? \n");
       int opt = input.nextInt();
       input.nextLine();
       switch (opt) {
           case 1:
               choice = "Pedra";
               break;
           case 2:
               choice = "Papel";
               break;
           case 3:
               choice = "Tesoura";
               break;
           default:
               System.out.println("Opção inválida!");
               choose(input);
       }
   }
}
