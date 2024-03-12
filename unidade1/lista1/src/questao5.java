import java.util.Scanner;

public class questao5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Número: ");
    int num = sc.nextInt();
    sc.close();
    int i;

    for (i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + " = " + num * i);
    }
  }
}
