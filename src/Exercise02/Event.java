package Exercise02;


import java.util.Scanner;

public class Event {
    Scanner input = new Scanner(System.in);

    private final int capacity;

    private int amount;

    private int avaliableChairs;

    public Event(){
        this(10);
    }

    public Event(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException("A capacidade não pode ser um valor negativo");
        }
        this.capacity = capacity;
        this.avaliableChairs = capacity;
    }

    public void reserveChairs(){
        System.out.println("Digite a quantidade de cadeiras que serão reservadas: ");
        amount = input.nextInt();
        if (avaliableChairs == 0 || amount > avaliableChairs){
            System.out.println("Não há cadeiras disponíveis para reserva.");
            return;
        }
        avaliableChairs -= amount;
        System.out.println("Lugar(es) reservado(s) com sucesso");
        input.nextLine(); // Limpar o buffer do scanner
    }

    public void cancelChairs(){
        System.out.println("Digite a quantidade de cadeiras que serão canceladas: ");
        amount = input.nextInt();

        if (avaliableChairs == capacity){
            System.out.println("Não há reservas para cancelar");
            return;
        } else if (amount > capacity - avaliableChairs) {
            System.out.println("A quantidade de cadeiras a ser cancelada excede o número de reservas.");
            return;
        }
        avaliableChairs += amount;

        System.out.println("Reserva cancelada com sucesso");
    }

    public int avaliableChairs(){
        return avaliableChairs;
    }
    public void showStatus(){
        int reserved = capacity - avaliableChairs;

        StringBuilder bar = new StringBuilder("[");
        for(int i = 0; i < capacity; i++){
            if (i < reserved) bar.append("|");
            else bar.append("-");
        }

        bar.append("]");
        System.out.println("\n==== Status do Evento ====");
        System.out.println("Capacidade total: " + capacity);
        System.out.println("Reservados: " + reserved);
        System.out.println("Disponíveis: " + avaliableChairs);
        System.out.println("Ocupação: " + bar);

        if (avaliableChairs == 0){
            System.out.println("O evento está lotado. ❌");
        } else if (avaliableChairs < capacity * 0.2) {
            System.out.println("O evento está com poucas vagas disponíveis. ❗");
        }else {
            System.out.println("Há disponibilidade. ✅ ");
        }
    }

}
