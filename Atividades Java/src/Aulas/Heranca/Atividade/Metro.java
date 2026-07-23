package Aulas.Heranca.Atividade;

public class Metro extends TransportePublico {

    private String estacaoAtual;

    public Metro(String numeroDaLinha, int capacidadePassageiros, double tarifa, String estacaoAtual) {
        super(numeroDaLinha, capacidadePassageiros, tarifa);
        this.estacaoAtual = estacaoAtual;
    }

    public String getEstacaoAtual() {
        return estacaoAtual;
    }

    public void setEstacaoAtual(String estacaoAtual) {
        this.estacaoAtual = estacaoAtual;
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Metrô saindo da Estação Central de Brasília.");
    }

    public void fecharPortas() {
        System.out.println("As portas do metrô foram fechadas.");
    }
}