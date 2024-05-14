package questao3;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas formas deseja criar: ");
    int qtdeFormas = sc.nextInt();

    Forma[] formas = new Forma[qtdeFormas];

    for (int i = 0; i < qtdeFormas; i++) {
      System.out.println("Forma:");
      System.out.println("1 - Quadrado");
      System.out.println("2 - Retangulo");
      System.out.println("3 - Circulo");
      System.out.print("Opcao: ");
      int opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Lado: ");
          double quadLado = sc.nextDouble();
          Quadrado quadrado = new Quadrado(quadLado);
          formas[i] = quadrado;
          break;
        case 2:
          System.out.println("Lados:");
          System.out.print("1 - ");
          double rl1 = sc.nextDouble();
          System.out.print("2 - ");
          double rl2 = sc.nextDouble();
          System.out.print("3 - ");
          double rl3 = sc.nextDouble();
          System.out.print("4 - ");
          double rl4 = sc.nextDouble();
          System.out.print("Base: ");
          double rBase = sc.nextDouble();
          System.out.print("Altura: ");
          double rAltura = sc.nextDouble();

          Retangulo retangulo = new Retangulo(rl1, rl2, rl3, rl4, rBase, rAltura);
          formas[i] = retangulo;
          break;
        case 3:
          System.out.print("Raio: ");
          double raio = sc.nextDouble();
          Circulo circulo = new Circulo(raio);
          formas[i] = circulo;
        default:
          break;
      }

    }
    for(Forma f: formas) {
      System.out.println(f.toString());
    }
  }
}
