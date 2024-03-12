import java.util.Scanner;

public class questao3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a idade: ");
    int idade = sc.nextInt();
    sc.close();
    
    if (idade < 16) {
      System.out.println("Não eleitor");
    } else if (idade >= 18 && idade <= 65) {
      System.out.println("Eleitor obrigatório");
    } else {
      System.out.println("Eleitor facultativo");
    }
  }
}
