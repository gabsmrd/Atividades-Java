package Atividade05;

import java.util.Scanner;
public class SomaElemento {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner entradaNumeros = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros: ");

        for (int inicio = 0; inicio < numeros.length; inicio++) {
            System.out.print("Digite o " + (inicio + "1") + "° número: ");
            numeros[inicio] = entradaNumeros.nextInt();
        }

        System.out.print("Vetor preenchido: [");

        for (int inicio2 = 0; inicio2 < numeros.length; inicio2++) {
            System.out.print(numeros[inicio2]);
            if (inicio2 < numeros.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        int soma = 0;
        for (int inicio3 = 0; inicio3 < numeros.length; inicio3++) {
            soma += numeros[inicio3];
        }
        System.out.println("A soma de todos os elementos é: " + soma);
    }
}