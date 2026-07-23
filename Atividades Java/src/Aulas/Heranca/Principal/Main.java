package Aulas.Heranca.Principal;
import Aulas.Heranca.Atividade.Metro;
import Aulas.Heranca.Atividade.Onibus;

public class Main {
    public static void main(String[] args) {

        Onibus onibus = new Onibus(
                "0.110",
                80,
                5.50,
                "Viação Brasília"
        );

        Metro metro = new Metro(
                "Linha 1",
                1500,
                5.50,
                "Estação Central"
        );

        onibus.iniciarViagem();
        onibus.abrirPortasTraseiras();

        System.out.println();

        metro.iniciarViagem();
        metro.fecharPortas();
    }
}