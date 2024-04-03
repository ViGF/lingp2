package questao2;

public class PlacaMae {
  private String modelo;

  public PlacaMae(String modelo) {
    this.modelo = modelo;
  }

  public String getModelo() {
    return modelo;
  }

  @Override
  public String toString() {
    return "modelo=" + modelo;
  }
}
