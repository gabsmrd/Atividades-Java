package Aulas.Encapsulamento.Banco.Modelo;

public class ContaBancaria {

    private String nome;
    private int numeroConta;
    private double saldo;

    private static int proximoNumero = 1000;

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.numeroConta = proximoNumero;
        proximoNumero++;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public String toString() {
        return "Conta Bancária{" +
                "nome='" + nome + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}