package MethodOverride;

public class programPolymorphism {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        System.out.println("Testando Polimorfismo com @Override");

        a1.makeSound();

        a2.makeSound();

        a3.makeSound();
    }
}
