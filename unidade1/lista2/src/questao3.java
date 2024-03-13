import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texto 1: ");
        String s1 = sc.nextLine();
        System.out.print("Texto 2: ");
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("strings iguais");
        } else {
            System.out.println(s1 + s2);
        }
    }
}
