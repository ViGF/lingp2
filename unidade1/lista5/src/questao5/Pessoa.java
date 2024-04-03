package questao5;

public class Pessoa {
  private String nome;
  private String cpf;
  private String dataNasc;

  public Pessoa(String nome, String cpf, String dataNasc) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataNasc = dataNasc;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getDataNasc() {
    return dataNasc;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNasc;
  }
}