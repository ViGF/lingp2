import java.util.Scanner;

public class questao1 {
    public static int par(int valor) {
        int resto = valor % 2;
        
        if (resto == 0){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor: ");
        int valor = sc.nextInt();
        System.out.println(par(valor));
    }
}
