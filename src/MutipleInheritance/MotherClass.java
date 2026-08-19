package MutipleInheritance;

public interface MotherClass {
    //Print só ocorrerá caso alguém herde este metodo
    default void printMotherData()
    {
        System.out.println("------ Dados casa Pai ------");
        System.out.println("Código: 123456");
        System.out.println("Proprietário: Rosa da Silva");
        System.out.println("Estado: RS");
        System.out.println("Cidade: Porto Alegre");
        System.out.println("Valor: R$ 1.100.260,00");
        System.out.println();
    }
}
