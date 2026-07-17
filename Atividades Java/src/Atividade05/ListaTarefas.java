package Atividade05;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) {
        Scanner entradaTarefas = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma tarefa: ");
            tarefas.add(entradaTarefas.nextLine());

            System.out.println("Deseja continuar? ");
            String opcao = entradaTarefas.nextLine();

            if (opcao.equals("Fim")) {
                break;
            }
            System.out.println("Total de tarefas registrafas: " + tarefas.size());
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1 ) + tarefas.get(i) + ". ");
            }
        }
    }
}
