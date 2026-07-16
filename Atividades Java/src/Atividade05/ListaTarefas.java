package Atividade05;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {
        Scanner entradaTarefas = new Scanner(System.in);
        String tarefa = "";

        while (!tarefa.equalsIgnoreCase("fim")) {

            System.out.print("Digite uma tarefa (ou 'fim' para encerrar): ");
            tarefa = entradaTarefas.nextLine();

            if (!tarefa.equalsIgnoreCase("fim")) {

            }
        }

        System.out.println("Total de tarefas registadas: " + ());

        for (int i = 0; i < (); i++) {
            System.out.println((i + 1) + ". " + (i));
        }
    }
}