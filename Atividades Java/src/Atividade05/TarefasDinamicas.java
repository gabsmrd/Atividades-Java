package Atividade05;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTaref {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        String tarefa = "";

        while (!tarefa.equalsIgnoreCase("fim")) {

            System.out.print("Digite uma tarefa (ou 'fim' para encerrar): ");
            tarefa = entrada.nextLine();

            if (!tarefa.equalsIgnoreCase("fim")) {
                tarefas.add(tarefa);
            }
        }

        System.out.println("\nTotal de tarefas registadas: " + tarefas.size());

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        entrada.close();
    }
}