package questao1;

import java.util.Scanner;

public class Inicio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Conta contaCorrente = new Conta();
    Conta contaPoupanca = new Conta();

    System.out.println("Tipo de conta:");
    System.out.println("C - Corrente");
    System.out.println("P - Poupanca");
    System.out.print("Opcao: ");
    char tipoConta = sc.next().toLowerCase().charAt(0);

    Conta contaSelecionada = null;

    switch (tipoConta) {
      case 'c':
        contaSelecionada = contaCorrente;
        break;
      case 'p':
        contaSelecionada = contaPoupanca;
        break;
      default:
        break;
    }

    for (;;) {
      if (contaSelecionada != null) {
        System.out.println("S - Sacar");
        System.out.println("D - Depositar: ");
        System.out.println("V - Ver saldo: ");
        System.out.print("Opção: ");
        char operacao = sc.next().toLowerCase().charAt(0);

        switch (operacao) {
          case 's':
            System.out.print("Valor: R$");
            double valorSacar = sc.nextDouble();

            contaSelecionada.sacar(valorSacar);
            break;
          case 'd':
            System.out.print("Valor: R$");
            double valorDepositar = sc.nextDouble();

            contaSelecionada.depositar(valorDepositar);
            break;
          case 'v':
            System.out.println("R$ " + contaSelecionada.getSaldo());
            break;
          default:
            System.out.println("Finalizando programa...");
            return;
        }
      } else {
        System.out.println("Finalizando programa...");
        return;
      }
    }
  }
}
