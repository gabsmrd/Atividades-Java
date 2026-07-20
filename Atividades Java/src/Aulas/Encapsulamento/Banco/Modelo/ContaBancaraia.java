package Aulas.Encapsulamento.Banco.Modelo;

public class ContaBancaraia {
    //Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;

    //Construtor dessa classe
    public ContaBancaraia(String titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    //Metodos Gets e Sets
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
