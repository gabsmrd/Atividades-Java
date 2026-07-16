package Atividade05;

import java.util.Scanner;
public class SomaElemento {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner entradaNumeros = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros: ");

        for (int inicio = 0; inicio < numeros.length; inicio++) {
            System.out.print("Digite o " + (inicio + "primeiro ") + "número: ");
            numeros[inicio] = entradaNumeros.nextInt();
        }

        System.out.print("Vetor preenchido: [");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        int soma = 0;

        for (int inicio2 = 0; inicio2 < numeros.length; inicio2++) {
            soma += numeros[inicio2];
        }
        System.out.println("A soma de todos os elementos é: " + soma);
    }
}