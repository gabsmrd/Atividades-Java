package Atividade03;
import java.util.Scanner;

public class VerificadorAcesso {
    public static boolean verificarMaioridade(int idade){
        if(idade >= 18){
            return true;
        } else {
            return false;
        }
    }
public static void main(String[] args) {
    Scanner inicioResultado = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idade = inicioResultado.nextInt();
    if(verificarMaioridade(idade) == true){
        System.out.print("Acesso liberado. ");
    } else {
        System.out.print("Acesso negado. ");
    }

}
}
