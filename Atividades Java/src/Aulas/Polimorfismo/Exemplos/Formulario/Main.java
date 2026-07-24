package Aulas.Polimorfismo.Exemplos.Formulario;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cadastro> cadastros = new ArrayList<>();
        List<Cadastro> dadosIncompletos = new ArrayList<>();

        Cadastro pessoa1 = new Cadastro(
                "Gabriela",
                19,
                "Desenvolvedora",
                "gabriela@email.com"
        );

        Cadastro pessoa2 = new Cadastro("Ana");

        Cadastro pessoa3 = new Cadastro("João", 25);

        Cadastro pessoa4 = new Cadastro(
                "Carlos",
                30,
                "Analista"
        );

        cadastros.add(pessoa1);
        cadastros.add(pessoa2);
        cadastros.add(pessoa3);
        cadastros.add(pessoa4);

        for (Cadastro pessoa : cadastros) {

            if (!pessoa.isAtivo()) {
                dadosIncompletos.add(pessoa);
            }
        }

        System.out.println("=== CADASTROS INCOMPLETOS ===");

        for (Cadastro pessoa : dadosIncompletos) {
            System.out.println(pessoa);
        }

        pessoa2.setIdade(22);
        pessoa2.setCargo("Desenvolvedora");
        pessoa2.setEmail("ana@email.com");

        pessoa3.setCargo("Programador");
        pessoa3.setEmail("joao@email.com");

        pessoa4.setEmail("carlos@email.com");

        for (Cadastro pessoa : dadosIncompletos) {
            pessoa.verificarCadastro();
        }

        System.out.println("\n=== CADASTROS APÓS ATUALIZAÇÃO ===");

        for (Cadastro pessoa : cadastros) {
            System.out.println(pessoa);
        }

        dadosIncompletos.removeIf(Cadastro::isAtivo);

        System.out.println("\n=== DADOS AINDA INCOMPLETOS ===");

        for (Cadastro pessoa : dadosIncompletos) {
            System.out.println(pessoa);
        }
    }
}


        /**
         * FALHA NO MEU CADASTRO
         *
         * Nesse cadastro, estou criando pessoas sem
         * todas as informações
         *
         * ATIVIDADE
         *
         * 1. Permitir a criação de pessoas cadastradas
         *    sem todas as informações.
         *    Essas pessoas, tem que entrar
         *    numa lista de DADOS INCOMPLETOS
         *
         * 2. Permitir que as pessoas que tem os
         *    dados incompletos, preencham os
         *    dados que faltam no seu cadastro.
         *
         *
         *
         */

