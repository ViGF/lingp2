import java.util.Scanner;

import registros.Filme;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Filme 1:");
        Filme filme1 = new Filme();
        Filme.ler(filme1);
        System.out.println();

        System.out.println("Filme 2:");
        Filme filme2 = new Filme();
        Filme.ler(filme2);
        System.out.println();

        System.out.println("Filme 3:");
        Filme filme3 = new Filme();
        Filme.ler(filme3);
        System.out.println();

        System.out.println("Lista de Filmes Cadastrados");

        System.out.println("Filme 1:");
        Filme.imprimir(filme1);
        System.out.println();

        System.out.println("Filme 2:");
        Filme.imprimir(filme2);
        System.out.println();

        System.out.println("Filme 3:");
        Filme.imprimir(filme3);
    }
}
