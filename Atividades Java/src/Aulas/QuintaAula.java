package Aulas;

import java.sql.SQLOutput;
// Importa a classe ArrayList para criar listas de tamanho dinâmico
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class QuintaAula {

    public static void main(String[] args) {

        // Cria um Scanner para receber informações digitadas no teclado
        Scanner entrada = new Scanner(System.in);

        // ============================
        // VETORES (ARRAYS)
        // ============================

        // Cria um vetor de inteiros com 3 posições
        // As posições são 0, 1 e 2
        int[] numeros = new int[3];

        // Armazena valores em cada posição do vetor
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        // Outra forma de criar um vetor, já preenchendo os valores
        String[] nomes = new String[]{
                "João",
                "Ithalo",
                "Daniel"
        };

        // FOREACH
        // Percorre todas as posições do vetor "numeros"
        // A variável "numero" recebe um valor do vetor por vez
        for (int numero : numeros) {

            // Exibe o valor atual do vetor
            System.out.println(numero);
        }

        // ARRAYLIST
        // Cria uma lista de Strings inicialmente vazia
        // Diferente do vetor, o ArrayList pode aumentar de tamanho
        ArrayList<String> listaDeNomes = new ArrayList<>();

        // Variável usada para controlar quando o programa será encerrado
        int opcao = 0;

        // Enquanto a opção for 0, o menu continuará aparecendo
        while (opcao == 0) {

            // Guarda a opção escolhida pelo usuário
            int opcaoLista;

            // Exibe o menu
            System.out.println("Escolha uma opção:");
            System.out.println("Adicionar = 1");
            System.out.println("Apagar = 2");

            // Lê o número digitado
            opcaoLista = entrada.nextInt();

            // Consome o ENTER deixado pelo nextInt()
            entrada.nextLine();

            // Verifica se o usuário escolheu adicionar
            if (opcaoLista == 1) {

                System.out.println("Digite um nome ADICIONAR:");

                // Lê o nome digitado e adiciona ao final da lista
                listaDeNomes.add(entrada.nextLine());

            } else {

                System.out.println("Digite um nome APAGAR:");

                // ERRO DO EXEMPLO DA AULA:
                // Está tentando remover o elemento da posição 10.
                // Se a lista não tiver essa posição, ocorrerá um erro.
                listaDeNomes.remove(10);
            }

            // Pergunta se o usuário deseja continuar
            System.out.println("Continuar - 0");
            System.out.println("Sair - 1");

            // Lê a opção de continuar ou sair
            opcao = entrada.nextInt();

            // Consome o ENTER novamente
            entrada.nextLine();
        }

        // Exibe todos os nomes que ficaram na lista
        System.out.println(listaDeNomes);
    }
}