package Atividade04;
import java.util.Scanner;

public class ConstrutorEscadas {
    public static void desenharEscada(int degraus, char simbolo) {

        for (int linha = 1; linha <= degraus; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();
        System.out.print("Digite o símbolo da escada: ");
        char simbolo = scanner.next().charAt(0);
        System.out.println("Escada:");
        desenharEscada(degraus, simbolo);
    }
}