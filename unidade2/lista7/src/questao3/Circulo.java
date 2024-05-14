package questao3;

public class Circulo implements Forma {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double perimetro() {
    return 2 * Math.PI * this.raio;
  }

  public double area() {
    return Math.PI * Math.pow(this.raio, 2);
  }

  @Override
  public String toString() {
    return "Circulo [raio=" + raio + ", perimetro()=" + perimetro() + ", area()=" + area() + "]";
  }
}
