import java.util.Scanner;

public class questao2 {
  public static void main(String[] args) {
    double deposito, taxa, rendimento, valorTotal;
    Scanner sc = new Scanner(System.in);

    System.out.print("Valor do depósito (R$): ");
    deposito = sc.nextDouble();
    System.out.print("Valor da taxa de juros (%): ");
    taxa = sc.nextDouble();
    sc.close();

    rendimento = deposito * (taxa / 100);
    valorTotal = deposito + rendimento;
    System.out.println("Valor do rendimento: R$" + rendimento);
    System.out.println("Valor total com rendimento: R$" + valorTotal);
  }
}
