import java.util.Scanner;

public class questao6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Salário: R$");
    double salario = sc.nextDouble();
    double salarioTotal = 0;
    int filhosTotal = 0;
    double maiorSalario = 0;
    int qtdeFamilias = 0;

    while (salario >= 0) {
      salarioTotal += salario;
      System.out.print("Quantidade de filhos: ");
      int qtdeFilhos = sc.nextInt();

      filhosTotal += qtdeFilhos;

      if (salario > maiorSalario) {
        maiorSalario = salario;
      }

      qtdeFamilias++;

      System.out.print("Salário: ");
      salario = sc.nextDouble();
    }

    sc.close();

    int populacao = qtdeFamilias + filhosTotal;
    double mediaSalario = salarioTotal / populacao;
    double mediaFilhos = filhosTotal / qtdeFamilias;

    System.out.println("População total: " + populacao);
    System.out.println("Média do salário por família no município: " + mediaSalario);
    System.out.println("Média filhos por família no município: " + mediaFilhos);
  }
}
