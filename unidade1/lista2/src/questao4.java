import java.util.Scanner;

public class questao4 {
    public static int numeroVogais(String texto) {
        int qtdeVogais = 0;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        char[] caracteres = texto.toLowerCase().toCharArray();

        for (char caractere: caracteres) {
            for(char vogal: vogais) {
                if (caractere == vogal) {
                    qtdeVogais++;
                }
            }
        }

        return qtdeVogais;
    }
    
    public static String inverterTexto(String texto) {
        String textoInvertido = "";
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        return textoInvertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Texto: ");
        String texto = sc.next();

        System.out.println("Menu:");
        System.out.println("1 - Número de caracteres");
        System.out.println("2 - Texto em maiúsculo");
        System.out.println("3 - Texto em minúsculo");
        System.out.println("4 - Número de vogais");
        System.out.println("5 - Começa com UE");
        System.out.println("6 - Texto inverso");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(texto.length());
                break;
            case 2:
                System.out.println(texto.toUpperCase());
                break;
            case 3:
                System.out.println(texto.toLowerCase());
                break;
            case 4:
                System.out.println(numeroVogais(texto));
                break;
            case 5:
                System.out.println(texto.toUpperCase().startsWith("UE"));
                break;
            case 6:
                System.out.println(inverterTexto(texto));
                break;
            default:
                break;
        }
    }
}
