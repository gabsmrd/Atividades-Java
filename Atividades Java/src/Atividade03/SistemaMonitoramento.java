package Atividade03;
import java.util.Scanner;

public class SistemaMonitoramento {
    public static double converterParaFahrenheit(double celsius){
        double resultado = celsius * 1.8 + 32;
        return resultado;
    }
public static void avaliarClima(double resultado){
    if(resultado < 50.0){
        System.out.print("Clima frio. ");
    } else if(resultado >= 50.0 && resultado <= 79.9){
        System.out.print("Clima agradável. ");
    } else{
        System.out.print("Clima quente. ");
    }
}
public static void main(String[] args) {
    Scanner inicioResultado = new Scanner(System.in);
    System.out.print("Digite a temperatura atual: ");
    double celsius = inicioResultado.nextDouble();
    double resultado = converterParaFahrenheit(celsius);
    avaliarClima(resultado);

    
}
}
