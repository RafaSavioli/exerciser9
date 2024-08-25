package Baking;

public class DataBaking {
    private int conta;
    private String nameClient;
    private double saldo;

    public DataBaking(int conta, String nameClient, double saldoInicial ) {
        this.conta = conta;
        this.nameClient = nameClient;
        addSaldo(saldoInicial) ;
    }

    public DataBaking(int conta, String nameClient) {
        this.conta = conta;
        this.nameClient = nameClient;

    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNameClient() {
        return nameClient;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double addSaldo(double saldo) {
        return this.saldo += saldo;
    }

    public Double removeSaldo(double saldo) {
        return (this.saldo -= saldo) - 5;
    }

    public String toString() {
        return "Conta: " +
                conta +
                ". Nome da conta: " +
                nameClient +
                ". Saldo da conta: R$" +
                saldo;

    }
}

