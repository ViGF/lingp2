package questao2;

public class Teclado {
  private String marca;

  public Teclado(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }

  @Override
  public String toString() {
    return "marca=" + marca;
  }
}
