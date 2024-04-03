package questao2;

public class Monitor {
  private int polegadas;

  public Monitor(int polegadas) {
    this.polegadas = polegadas;
  }

  public int getPolegadas() {
    return polegadas;
  }

  @Override
  public String toString() {
    return "polegadas=" + polegadas;
  }
}
