package questao2;

public class Memoria {
  private double capacidade;

  Memoria(double capacidade) {
    this.capacidade = capacidade;
  }

  public double getCapacidade() {
    return capacidade;
  }

  @Override
  public String toString() {
    return "capacidade=" + capacidade;
  }
}
