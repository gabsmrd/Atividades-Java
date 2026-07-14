package Atividade03;
import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void imprimirSaudacao(String nome) {
        System.out.print("Olá, " + nome + " Seja bem vindo a nossa aula de de métodos!\n ");
    }

public static void main(String[] args){
    Scanner inicioNome = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = inicioNome.nextLine();
    imprimirSaudacao(nome);
    }
}