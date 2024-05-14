package questao2;

public class Automovel extends Veiculo {
  private double litros;

  public Automovel(double litros) {
    this.velocidade = 0;
    this.litros = litros;
  }

  @Override
  public double acelerar(double velocidade) {
    this.velocidade += velocidade;
    System.out.println("Acelerou! Velocidade: " + this.velocidade + "km/h");
    return velocidade;
  }

  @Override
  public void parar() {
    this.velocidade = 0;
    System.out.println("Parou!");
  }

  public void trocarOleo(double litros) {
    //0.1 == 100ml
    System.out.print("Nivel: " + this.litros + "l");
    if (this.litros < 0.1) {
      this.litros = litros;
      System.out.println(" - Oleo trocado!");
    } else {
      System.out.println(" - Oleo nao trocado!");
    }
  }
}
