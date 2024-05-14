package questao3;

public class Quadrado extends Quadrilatero {
  public Quadrado(double lado) {
    super(lado, lado, lado, lado);
  }

  public double area() {
    return this.perimetro() / 4;
  }

  @Override
  public String toString() {
    return "Quadrado [l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + ", l4=" + l4 + ", perimetro()=" + perimetro() + ", area()=" + area() + "]";
  }
}
