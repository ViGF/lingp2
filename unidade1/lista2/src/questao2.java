import java.util.Scanner;

public class questao2 {
    public static float media(float nota1, float nota2, float nota3, char tipo) {
        if (tipo == 'A') {
            float media = (nota1 + nota2 + nota3) / 3;

            return media;
        } else {
            float media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / (5 + 3 + 2);

            return media;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.print("Nota 3: ");
        float nota3 = sc.nextFloat();
        System.out.print("Média: Aritmética (A) Ponderada (P) ");
        char tipoMedia = sc.next().toUpperCase().charAt(0);
        System.out.println("Média: " + media(nota1, nota2, nota3, tipoMedia));
    }
}
