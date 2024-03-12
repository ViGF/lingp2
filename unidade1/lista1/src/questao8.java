import java.util.Scanner;

public class questao8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matriz1[][] = new int[5][5];
    int matriz2[][] = new int[5][5];
    int totalMatriz1 = 0, totalMatriz2 = 0, soma = 0, diferenca = 0;
    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1.length; j++) {
        System.out.print("[" + (i + 1) + ", " + (j + 1) + "]: ");
        matriz1[i][j] = sc.nextInt();
        totalMatriz1 += matriz1[i][j];
      }
    }
    for (int i = 0; i < matriz2.length; i++) {
      for (int j = 0; j < matriz2.length; j++) {
        System.out.print("[" + (i + 1) + ", " + (j + 1) + "]: ");
        matriz1[i][j] = sc.nextInt();
        totalMatriz2 += matriz1[i][j];
      }
    }
    soma = totalMatriz1 + totalMatriz2;
    diferenca = totalMatriz1 - totalMatriz2;
    System.out.println("Soma das matrizes: " + soma);
    System.out.println("Diferença entre as matrizes: " + diferenca);
  }
}
