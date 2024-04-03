package questao3;

public class Titulo {
  private String nome;

  public Titulo(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "nome=" + nome;
  }
}
