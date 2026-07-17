package Atividade06;

//Ordenação de tarefas em ordem alfabetica/tadas
//Metodo para remover tarefas espefícicas
//> removerTarefas pelo metodo FIFO
//> removerTarefas pelo metodo FEFO
//> removerTarefas pelo metodo LIFO
//(Opicional) Adicionar um metodo que registre as tarefas que foram concluídas

//   SEGUE MELHORIA EM FEFO


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MelhoriaTarefas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true){
            System.out.print("Digite uma tarefa: ");
            System.out.println("exemplo DD/MM/AAAA - TAREFA");
            tarefas.add(entrada.nextLine());

            System.out.println("Deseja continuar?");
            String opcao = entrada.nextLine();

            if (opcao.equals("fim")){
                break;
            }
        }
        System.out.println("Total de tarefas registradas: "+tarefas.size());

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i+1)+". "+tarefas.get(i));
        }
        Collections.sort(tarefas);
        System.out.println("\n tarefas organizadas por data: \n" + tarefas);
        String data = tarefas.remove(0);

        System.out.println("tarefas removidas: " + data);
        System.out.println("tarefas atualizadas: " + tarefas);


    }
}