package questao4;

public class App {
  public static void main(String[] args) {
    Boca boca = new Boca(3);
    Braco braco = new Braco(18);
    Cabeca cabeca = new Cabeca(9);
    Olho olho = new Olho(4);
    Perna perna = new Perna(24);

    Monstro monstro = new Monstro(boca, braco, cabeca, olho, perna);

    System.out.println(monstro.toString());
  }
}
