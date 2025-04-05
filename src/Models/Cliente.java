package Models;

public class Cliente extends Pessoa {
    private String plano;

    public Cliente(String nome, int idade, String plano) {
        super(nome, idade);
        this.plano = plano;
    }

    public String getPlano() {
        return plano;
    }

    @Override
    public String getDescricao() {
        return "Cliente: " + nome + ", Idade: " + idade + ", Plano: " + plano;
    }
}