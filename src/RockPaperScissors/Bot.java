package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class Bot extends Player {

    private Random random = new Random();
    public Bot(String name){
        super(name);
        int score = 0;
    }

    @Override
    public void choose(Scanner input){

        int option = random.nextInt(3) + 1;

        switch (option) {
            case 1:
                setChoice("Pedra");
                break;

            case 2:
                setChoice("Papel");
                break;

            case 3:
                setChoice("Tesoura");
                break;
        }
    }
}
