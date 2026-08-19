package Objects;

public class Cars {String carModel;
    String carType;
    int carYear;

    Cars(String carModel, String carType, int carYear){ //Construtor da classe Carro
        this.carModel = carModel;
        this.carType = carType;
        this.carYear = carYear;
    }

    void showInfo(){
        System.out.println("INFORMAÇÕES DO VEÍCULO");
        System.out.println("Modelo: " + carModel);
        System.out.println("Tipo de Carroceria: " + carType);
        System.out.println("Ano do Veículo: " + carYear);
        System.out.println("================================");
    }
}
