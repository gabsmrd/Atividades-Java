package Atividade05;

import java.util.Scanner;
public class AnalisadorTemperatura {
    public static void main(String[] args) {
        double[] temperaturas = new double[6];
        Scanner entradaTemperaturas = new Scanner(System.in);
        System.out.println("Digite 6 temperaturas ");

        for(int inicio = 0; inicio < temperaturas.length; inicio++){
            System.out.print("Digite a " + (inicio + 1) + "° temperatura: ");
            temperaturas[inicio] = entradaTemperaturas.nextDouble();
        }
        System.out.print("Temperaturas: [" );

        for(int inicio2 = 0; inicio2 < temperaturas.length; inicio2++){
            System.out.print(temperaturas[inicio2]);
            if(inicio2 < temperaturas.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        double maiorTemp = temperaturas[0];
        double menorTemp = temperaturas[0];

        for(int inicio3 = 0; inicio3 <temperaturas.length; inicio3++){
            if(temperaturas[inicio3] > maiorTemp){
                maiorTemp = temperaturas[inicio3];
            }
            if(temperaturas[inicio3] < menorTemp) {
                
                menorTemp = temperaturas[inicio3];
            }
        }
        System.out.println("Maior temperatura: " + maiorTemp + " °C" );
        System.out.print("Menor temperatura: " + menorTemp + " °C" );
    }
}