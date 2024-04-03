package questao3;

public class Capitulo {
  private String nome;

  public Capitulo(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "nome=" + nome;
  }
}
