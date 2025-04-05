package Models;

import java.util.ArrayList;

public class Academia {
    private String nome;
    private ArrayList<Pessoa> pessoas;

    public Academia(String nome) {
        this.nome = nome;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        System.out.println("Lista de Pessoas na Academia:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getDescricao());
        }
    }
}
