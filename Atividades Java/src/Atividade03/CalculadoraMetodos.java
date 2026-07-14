package Atividade03;
import java.util.Scanner;

public class CalculadoraMetodos {
    public static int subtrairNumeros(int a, int b){
        return a - b;
    }

public static void  imprimirResultado(int resultado){
    System.out.print("O resultado da opereção é: " + resultado);
}

public static void main(String[] args) {
    Scanner inicioResultado = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int a = inicioResultado.nextInt();

    System.out.print("Digite o segundo número: ");
    int b = inicioResultado.nextInt();
    int resultado = subtrairNumeros(a, b);
    imprimirResultado(resultado);
}
}
