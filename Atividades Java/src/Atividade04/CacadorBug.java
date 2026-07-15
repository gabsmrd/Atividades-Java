package Atividade04;

public class CacadorBug {
        public static void main(String[] args) {

            //o nome da variável começava com número
            int valor1 = 10;

            //tava faltando o ponto e vírgula.
            int contador = 5;

            //método tava pedindo dois parâmetros.
            exibirMensagens("Bem-vindo ao sistema", 1);
            while (contador > 0) {
                System.out.println("Iniciando em: " + contador);
                contador--;
            }
        }

        //o método estava dentro do while.
        //colocado fora do método main e declarei como static.
        public static void exibirMensagens(String texto, int repeticoes) {
            for (int i = 0; i < repeticoes; i++) {
                System.out.println(texto);
            }
        }
    }

