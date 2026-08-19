package Objects;

import java.util.Scanner;

public class ObjectsAndClasses {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do carro: ");
        String carModel = input.nextLine().toUpperCase();
        System.out.print("Digite o tipo de carroceria: ");
        String carType = input.nextLine().toUpperCase();
        System.out.print("Digite o ano do carro: ");
        int carYear = input.nextInt();
        input.nextLine();
        System.out.println("================================");

        Cars myCar = new Cars(carModel, carType, carYear);
        myCar.showInfo();
        input.close();
    }
}