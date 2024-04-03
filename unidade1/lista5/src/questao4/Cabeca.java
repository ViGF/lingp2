package questao4;

public class Cabeca {
  private double tamanho;

  public Cabeca(double tamanho) {
    this.tamanho = tamanho;
  }

  @Override
  public String toString() {
    return "tamanho=" + tamanho;
  }
}
