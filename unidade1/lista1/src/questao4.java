import java.util.Scanner;

public class questao4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha uma opção de prato");
    System.out.println("1 - Italiano (750cal)");
    System.out.println("2 - Japonês (342cal)");
    System.out.println("3 - Salvadoreno (545cal)");
    System.out.print("Opção: ");
    int prato = sc.nextInt();

    System.out.println("Escolha uma opção de bebida");
    System.out.println("1 - Chá (30cal)");
    System.out.println("2 - Suco de laranja (80cal)");
    System.out.println("3 - Refrigerante (90cal)");
    System.out.print("Opção: ");
    int bebida = sc.nextInt();
    sc.close();

    int calorias = 0;
    switch (prato) {
      case 1:
        calorias += 750;
        break;
      case 2:
        calorias += 342;
      case 3:
        calorias += 545;
      default:
        break;
    }

    switch (bebida) {
      case 1:
        calorias += 30;
        break;
      case 2:
        calorias += 80;
      case 3:
        calorias += 90;
      default:
        break;
    }

    System.out.println("Total de calorias: " + calorias);
  }
}
