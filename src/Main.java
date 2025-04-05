import Models.*;

public class Main {
    public static void main(String[] args) {


        Academia academia = new Academia("Gym Top Fitness");

        Cliente cliente1 = new Cliente("Carlos Silva", 30, "Premium");
        Cliente cliente2 = new Cliente("Mariana Souza", 25, "Básico");

        Instrutor instrutor1 = new Instrutor("João Pereira", 40, "Musculação");
        Instrutor instrutor2 = new Instrutor("Ana Costa", 35, "Pilates");

        academia.adicionarPessoa(cliente1);
        academia.adicionarPessoa(cliente2);
        academia.adicionarPessoa(instrutor1);
        academia.adicionarPessoa(instrutor2);

        academia.listarPessoas();

        }
    }
