package questao3;

public class ContaEspecial extends Conta {
  @Override
  void sacar(double valor) {
    saldo -= valor;
    System.out.print("Operacao realizada - ");
    System.out.println("Voce utilizou um cheque especial.");
  }
}
