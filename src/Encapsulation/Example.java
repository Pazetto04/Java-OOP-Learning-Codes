package Encapsulation;

import java.util.Scanner;


public class Example {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");

        String name = input.nextLine();

        System.out.println("Digite o CPF do titular: ");
        System.out.println("(Somente números)");

        String cpf = input.nextLine();

        double availableBalance = 0.00;

        BankAccount account = new BankAccount(name,cpf,availableBalance);

        account.showInfo();

        System.out.println("Salário de R$6575.99 depositado");
        account.recieveDeposit(6575.99);

        account.showInfo();

        System.out.println("Transferência de R$670,67!");
        account.transfer(670.67);

        account.showInfo();

        System.out.println("Tentativa de trnasferência acima do valor em conta no valor de R$6000.50: ");
        boolean attempt = account.transfer(6000.50);
        if (attempt){
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Saldo insuficiente! Transferência cancelada");
        }

        account.showInfo();

    }
}
