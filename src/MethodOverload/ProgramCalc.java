package MethodOverload;

public class ProgramCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Soma de 5 + 3 = " + calculator.calc(5,3));

        System.out.println("Soma de 5.2 + 2.2 = " + calculator.calc(5.2, 2.2));

        System.out.println("Soma de 1 + 3 + 7 + 10 = " + calculator.calc(1,3,7,10));

        System.out.println("Soma de 1 + 3 + 7 + 15 + 40 = " + calculator.calc(1,3,7,15,40));

        System.out.println("Soma de 1.8 + 4.6 + 56.78 + 23.50 = " + calculator.calc(1.8,4.6,56.78,23.50));

        System.out.println("Soma de 5 + 90 + 167 + 546 + 40 = " +  calculator.calc(5,90,167,546));

        System.out.println("Multiplicação de 6 x 5 x 4 = " + calculator.calc(true,6,5,4));

    }
}
