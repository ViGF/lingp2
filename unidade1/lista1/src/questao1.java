import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
      double comp1, comp2, comp3;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Comprimento do pedaço 1: ");
      comp1 = sc.nextDouble();
      System.out.print("Comprimento do pedaço 2: ");
      comp2 = sc.nextDouble();
      System.out.print("Comprimento do pedaço 3: ");
      comp3 = sc.nextDouble();
      sc.close();
      
      // (A < B + C e B < A + C e C < A + B).
      if (comp1 < (comp2 + comp3) && comp2 < (comp1 + comp3) && comp3 < (comp1 + comp2)) {
        System.out.println("Os comprimentos podem formar um triângulo");
      } else {
        System.out.println("Os comprimentos não podem formar um triângulo");
      }
    }
}
