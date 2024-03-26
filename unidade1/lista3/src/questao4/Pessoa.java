package questao4;

public class Pessoa {
    String nome;
    String cpf;
    int anoNascimento;

    public void calcularIdade() {
        int anoAtual = 2024;
        int idade = anoAtual - anoNascimento;

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + idade);
    }
}
