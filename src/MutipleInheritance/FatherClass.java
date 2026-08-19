package MutipleInheritance;

public interface FatherClass {
    //Print só ocorrerá caso alguém herde este metodo
    default void printFatherData()
    {
        System.out.println("------ Dados casa Pai ------");
        System.out.println("Código: 123456");
        System.out.println("Proprietário: João da Silva");
        System.out.println("Estado: DF");
        System.out.println("Cidade: Brasília");
        System.out.println("Valor: R$ 1.350.200,00");
        System.out.println();
    }
}
