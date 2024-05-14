package questao3;

public class Retangulo extends Quadrilatero {
  private double base;
  private double altura;

  public Retangulo(double l1, double l2, double l3, double l4, double base, double altura) {
    super(l1, l2, l3, l4);
    this.base = base;
    this.altura = altura;
  }

  public double area() {
    return base * altura;
  }

  @Override
  public String toString() {
    return "Retangulo [base=" + base + ", l1=" + l1 + ", altura=" + altura + ", l2=" + l2 + ", l3=" + l3 + ", l4=" + l4
        + ", area()=" + area() + ", perimetro()=" + perimetro() + "]";
  }  
}
