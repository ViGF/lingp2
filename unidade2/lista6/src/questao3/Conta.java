package questao3;

public class Conta {
  protected double saldo;

  void sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      System.out.println("Operacao realizada!");
    } else {
      System.out.println("Nao ha saldo suficiente!");
    }
  }

  void depositar(double valor) {
    saldo += valor;
    System.out.println("Operacao realizada!");
  }
}
