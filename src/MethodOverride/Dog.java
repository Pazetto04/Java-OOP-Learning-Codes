package MethodOverride;

class Dog extends Animal{
    //@Override sobrescreve um metodo existente na classe Pai
    //Override ajuda na clareza do código, evidenciando de forma explícita a sobrescrita
    //Ajuda no tempo de execução, já que utiliza o mesmo metodo "makeSound()" da classe Pai
    //Segurança no sentido do compilador conferir se realmente existe o metodo na classe Pai
    @Override
    public void makeSound(){

        System.out.println("Sou um cachorro");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Sou um gato");
    }
}
