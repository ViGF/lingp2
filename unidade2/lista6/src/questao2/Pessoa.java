package questao2;

public class Pessoa {
  protected String nome;
  protected String cpf;

  Pessoa(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  void mostraDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
  }
}
