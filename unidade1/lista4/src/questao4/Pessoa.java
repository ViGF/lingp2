package questao4;

public class Pessoa {
  private String nome;
  private Carro carro;

  Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }
}
