package Models;

public class Instrutor extends Pessoa {
    private String especialidade;

    public Instrutor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String getDescricao() {
        return "Instrutor: " + nome + ", Idade: " + idade + ", Especialidade: " + especialidade;
    }
}
