package Aulas.Heranca.Atividade;

public class Onibus extends TransportePublico {

    private String nomeViacao;

    public Onibus(String numeroDaLinha, int capacidadePassageiros, double tarifa, String nomeViacao) {
        super(numeroDaLinha, capacidadePassageiros, tarifa);
        this.nomeViacao = nomeViacao;
    }

    public String getNomeViacao() {
        return nomeViacao;
    }

    public void setNomeViacao(String nomeViacao) {
        this.nomeViacao = nomeViacao;
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Ônibus da viação " + nomeViacao + " saindo da Rodoviária do Plano.");
    }

    public void abrirPortasTraseiras() {
        System.out.println("As portas traseiras do ônibus foram abertas.");
    }
}