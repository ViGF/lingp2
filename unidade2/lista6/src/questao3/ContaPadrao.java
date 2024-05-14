package questao3;

public class ContaPadrao extends Conta {
  @Override
  void depositar(double valor) {
    double total = valor * 2.10; //110%
    super.depositar(total);
    System.out.print("Operacao realizada - ");
    System.out.println("Com rendimento de 110% por deposito");
  }
}
