package Aulas.Polimorfismo.Exemplos.Formulario;


public class Cadastro {

    private String nome;
    private int idade;
    private String cargo;
    private String email;
    private boolean ativo;

    public Cadastro(String nome, int idade, String cargo, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.email = email;

        verificarCadastro();
    }

    public Cadastro(String nome) {
        this.nome = nome;
        this.ativo = false;
    }

    public Cadastro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.ativo = false;
    }

    public Cadastro(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.ativo = false;
    }

    public void verificarCadastro() {

        if (nome != null && !nome.isEmpty()
                && idade > 0
                && cargo != null && !cargo.isEmpty()
                && email != null && !email.isEmpty()) {

            ativo = true;

        } else {

            ativo = false;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
        verificarCadastro();
    }

    public void setIdade(int idade) {
        this.idade = idade;
        verificarCadastro();
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        verificarCadastro();
    }

    public void setEmail(String email) {
        this.email = email;
        verificarCadastro();
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}