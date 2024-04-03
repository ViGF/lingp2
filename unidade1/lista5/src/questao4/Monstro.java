package questao4;

public class Monstro {
  private Boca boca;
  private Braco braco;
  private Cabeca cabeca;
  private Olho olho;
  private Perna perna;
  
  public Monstro(Boca boca, Braco braco, Cabeca cabeca, Olho olho, Perna perna) {
    this.boca = boca;
    this.braco = braco;
    this.cabeca = cabeca;
    this.olho = olho;
    this.perna = perna;
  }

  @Override
  public String toString() {
    return "Montro [boca=" + boca + ", braco=" + braco + ", cabeca=" + cabeca + ", olho=" + olho + ", perna=" + perna
        + "]";
  }
}
