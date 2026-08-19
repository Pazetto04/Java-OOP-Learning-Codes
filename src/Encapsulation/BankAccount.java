package Encapsulation;

public class BankAccount {
    //Declaração das variáveis
    private String ownerName;

    private String ownerCPF;

    private double availableBalance;

    String accountType = "Conta Corrente";

    protected String agencyNbr = "0001";

    //Criando o construtor da Conta Bancária
    public BankAccount(String ownerName, String ownerCPF, double availableBalance) {

        setOwnerName(ownerName);

        setOwnerCPF(ownerCPF);

        setAvailableBalance(availableBalance);

    }

    //Getters e Setters de nome, cpf e saldo da conta bancária
    //Os Getters funcionam como uma forma de retornar um dado privado
    public double getAvailableBalance() {
        return availableBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerCPF() {
        return cpfMask(ownerCPF);
    }

    //Os Setters definem o valor da variável e garante que as informações não sejam acessadas de forma externa.
    //Os Setters podem ser modificados para garantir algumas regras de input de dados. (Ex.: métodos setOwnerName | setOwnerCPF)
    public void setAvailableBalance(double updatedBalance) {

        this.availableBalance = Math.max(0.0, updatedBalance);
    }

    public void recieveDeposit(double amount){
        if (amount > 0){
            this.availableBalance += amount;
        }
    }

    public boolean transfer(double amount){
        if (amount > 0 && amount <= availableBalance){
            this.availableBalance -= amount;
            return true;
        }

        return false;
    }

    public void setOwnerCPF(String newCPF) {
        if (newCPF == null){
            this.ownerCPF = "";
        } else {
            this.ownerCPF = newCPF.replaceAll("\\D","");
        }
        this.ownerCPF = ownerCPF;
    }

    public void setOwnerName(String newName) {
        if (newName != null && !newName.isBlank()){
            this.ownerName = ownerName;
        } else {
            this.ownerName = "Titular não informado";
        }
    }

    //Máscara para manter o CPF oculto
    private String cpfMask(String cpfNumerOnly){
        if (cpfNumerOnly == null || cpfNumerOnly.length() < 11 ){
            return "** CPF inválido **";
        }
        if (cpfNumerOnly.length() == 11){
            return cpfNumerOnly.substring(0, 3) + ".***.***-**";
        }
        return "***.***.***-**";
    }
    //Metodo para exibir as informações
    public void showInfo(){
        System.out.println("\n====== Informações Resumidas ======");
        System.out.println("Nome do Titular: " + getOwnerName());
        System.out.println("CPF do Titular: " + getOwnerCPF());
        System.out.printf("Saldo Disponível: R$%.2f\n", getAvailableBalance());
        System.out.println("Agencia: " + agencyNbr);
        System.out.println("Tipo de conta: " + accountType);
        System.out.println("==============================");
    }
}
