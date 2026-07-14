package Atividade01;
import java.util.Scanner;

public class Formulario {
    public static void main(String[] args){
        String nomeCompleto;
        int idade;
        float altura;
        String cargo;
        int periodoEstudo;

        System.out.print("Digite seu nome completo: ");
        Scanner inicioNome = new Scanner(System.in);
        nomeCompleto = inicioNome.nextLine();

        System.out.print("Digite sua idade: ");
        Scanner inicioIdade = new Scanner(System.in);
        idade = inicioIdade.nextInt();

        System.out.print("Digite sua altura: ");
        Scanner inicioAltura = new Scanner(System.in);
        altura = inicioAltura.nextFloat();

        System.out.print("Digite seu cargo na empresa : ");
        Scanner inicioCargo = new Scanner(System.in);
        cargo = inicioCargo.nextLine();

        System.out.print("Digite o periodo que está : ");
        Scanner inicioPeriodo = new Scanner(System.in);
        periodoEstudo = inicioPeriodo.nextInt();


        System.out.println("Nome do estudante " + nomeCompleto +"\n"+ "Idade do estudante" + idade +"\n"+ "Altura do estudante" + altura +"\n"+
                "Cargo dentro da empresa"+ cargo +"\n"+ "Periodo de estudo" + periodoEstudo+"\n");


    }
}