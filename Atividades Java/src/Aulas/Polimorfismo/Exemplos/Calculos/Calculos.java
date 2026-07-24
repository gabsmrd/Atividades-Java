package Aulas.Polimorfismo.Exemplos.Calculos;

public class Calculos {
    private int resultadoInteiro;
    private double resultadoQuebrado;

    public int soma(int primeiroNumero, int segundoNumero){
        this.resultadoInteiro = primeiroNumero + segundoNumero;
        return getResultadoInteiro();
    }

    public double soma(double primeiroNumero, double segundoNumero){
        this.resultadoQuebrado = primeiroNumero + segundoNumero;
        return getResultadoQuebrado();
    }

    public void soma(int num1, double num2){
        setResultadoInteiro((int) ( num1 + num2 ));
        System.out.println(getResultadoInteiro());
    }

    public void soma(double num1, int num2){
        setResultadoQuebrado((double) ( num1 + num2 ));
        System.out.println(getResultadoQuebrado());
    }
}
