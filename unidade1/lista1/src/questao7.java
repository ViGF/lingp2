import java.util.Scanner;

public class questao7 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char nomes[][] = new char[3][];
    int i, letrasA = 0, letrasE = 0;
    for (i = 0; i < nomes.length; i++) {
      System.out.print("Nome " + (i + 1) + ": ");
      String nome = sc.nextLine();
      nomes[i] = nome.toUpperCase().toCharArray();
    }
    for (char[] nome : nomes) {
      for (char caractere : nome) {
        if (caractere == "A".charAt(0)) {
          letrasA += 1;
        } else if (caractere == "E".charAt(0)) {
          letrasE += 1;
        }
      }
    }
    System.out.println("Total de letras A: " + letrasA);
    System.out.println("Total de letras E: " + letrasE);
 }
}
