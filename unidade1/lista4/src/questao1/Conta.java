package questao1;

public class Conta {
  private double saldo;

  public void sacar(double valor) {
    if (valor > saldo) {
      System.out.println("Não foi possível realizar o saque!");
      System.out.println("O saldo da conta não é suficiente!");
    } else {
      this.saldo -= valor;
      System.out.println("Valor sacado!");
    }
  }

  public void depositar(double valor) {
    this.saldo += valor;
    System.out.println("Valor depositado!");
  }

  public double getSaldo() {
    return saldo;
  }
}