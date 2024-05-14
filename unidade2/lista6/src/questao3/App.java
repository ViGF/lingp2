package questao3;

public class App {
  public static void main(String[] args) {
    Conta c = new Conta();
    ContaPadrao cp = new ContaPadrao();
    ContaEspecial ce = new ContaEspecial();

    c.depositar(150);
    c.sacar(200);
    System.out.println("");
    cp.depositar(150);
    cp.sacar(200);
    System.out.println("");
    ce.depositar(150);
    ce.sacar(200);
  }
}
