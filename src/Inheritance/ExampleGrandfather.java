package Inheritance;

public class ExampleGrandfather {

    public int school_cep;

    public String school_name;

    public String school_address;

    public void grandfatherMethod(){

        System.out.println("Este método de print é herdado diretamente da classe avô! \n");
    }

    public void schoolInfoPrint() {
        System.out.println("================ Dados Instituição de Ensino ================");
        System.out.println("Nome da Instituição de Ensino: " + school_name);
        System.out.println("Endereço da Instituição de Ensino: " + school_address);
    }

}
