package questao2;

public class Bicicleta extends Veiculo {
  public Bicicleta() {
    this.velocidade = 0;
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
}
