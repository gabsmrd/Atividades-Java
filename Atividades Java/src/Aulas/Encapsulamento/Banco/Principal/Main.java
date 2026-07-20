package Aulas.Encapsulamento.Banco.Principal;
import Aulas.Encapsulamento.Banco.Modelo.ContaBancaraia;

public class Main {
    public static void main(String[] args) {
        ContaBancaraia minhaConta = new ContaBancaraia("Gabi", 1234560);
        minhaConta.setTitular("Felipe");
        System.out.println(minhaConta.getTitular());
    }
}