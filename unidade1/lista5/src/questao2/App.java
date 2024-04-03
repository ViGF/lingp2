package questao2;

public class App {
  public static void main(String[] args) {
    Memoria memoria = new Memoria(1);
    Monitor monitor = new Monitor(30);
    PlacaMae pm = new PlacaMae("a-12");
    Teclado teclado = new Teclado("Acer");

    Computador computador = new Computador(memoria, monitor, pm, teclado);

    System.out.println(computador.toString());
  }
}
