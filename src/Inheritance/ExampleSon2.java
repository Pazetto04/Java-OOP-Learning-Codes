package Inheritance;

//Extends é a evidência da herança da Classe "ExampleFather"
//A ordem de Herança é: Avô -> Filho -> Neto -> ...
// Avô não pode herdar do filho ou do neto | Filho não pode herdar do neto
public class ExampleSon2 extends ExampleFather {

    public ExampleSon2() {
        this.code = "2";
        this.name = "Emilly";
        this.gender = "Feminino";
        this.age = 22;
        this.school_name = "Centro Universitário de Brasília - CEUB ";
        this.school_address = "Asa Norte - DF";
    }

}
