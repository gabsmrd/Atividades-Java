package Aulas.Heranca.Locamocao;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.nomeVeiculo = "Ferrari";
        carro.ligar();
        carro.ligarArCondicionado();

        moto.nomeVeiculo = "Pop-100";
        moto.ligar();
        moto.puxarPezinho();
        moto.cor = "Preto";

    }
}
