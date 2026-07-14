package Atividade02;
import java.util.Scanner;

public class SistemaVotação {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite sua idade: ");

        
        int idade = scanner.nextInt();

        
        if (idade < 16) {

            System.out.println("Não pode votar.");

        }
        
        else if (idade == 16 || idade == 17) {

            System.out.println("Voto não obrigatorio.");

        }
        
        else if (idade <= 70) {

            System.out.println("Voto obrigatório.");

        }
        
        else {

            System.out.println("Voto facultativo.");

        }
    }
}