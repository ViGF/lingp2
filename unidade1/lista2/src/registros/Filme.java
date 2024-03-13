package registros;

import java.util.Scanner;

public class Filme {
    String nome;
    String autor;
    String ano;
    float preco;

    public static void ler(Filme f) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        f.nome = sc.nextLine();
        System.out.print("Autor: ");
        f.autor = sc.nextLine();
        System.out.print("Ano: ");
        f.ano = sc.nextLine();
        System.out.print("Preco: R$");
        f.preco = sc.nextFloat();
    }

    public static void imprimir(Filme f) {
        System.out.println("Nome: " + f.nome);
        System.out.println("Autor: " + f.autor);
        System.out.println("Ano: " + f.ano);
        System.out.println("Preco: R$" + f.preco);
    }
}
