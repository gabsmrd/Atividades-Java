package Atividade03;
import java.util.Scanner;

public class MaquinaDobro {
    public static int calcularDobro(int a){
        return a * 2;
        
    }
public static void main(String[] args){
    Scanner inicioResultado = new Scanner(System.in);

    System.out.print("Digite um número de sua pereferencia: ");
    int a = inicioResultado.nextInt();
    int resultado = calcularDobro(a);
    System.out.print("O dobro do núemro é: " + resultado);
    }
}
