package Inheritance;

//Extends é a evidência da herança da Classe "ExampleFather"
//A ordem de Herança é: Avô -> Filho -> Neto -> ...
// Avô não pode herdar do filho ou do neto | Filho não pode herdar do neto
public class ExampleSon extends ExampleFather {

    public ExampleSon() {
        this.code = "1";
        this.name = "Matheus";
        this.gender = "Masculino";
        this.age = 21;
        this.school_name = "Universidade Católica de Brasília - UCB";
        this.school_address = "Pistão Sul - Brasília - DF";
    }

    //Construtor necessário para receber o input do usuário
    public ExampleSon(String code, String name, String gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
