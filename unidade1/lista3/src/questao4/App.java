package questao4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        
        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Pessoa " + (i + 1) + ":");
            
            System.out.print("Nome: ");
            String nome = scString.nextLine();
            pessoa.nome = nome;

            System.out.print("CPF: ");
            String cpf = scString.nextLine();
            pessoa.cpf = cpf;

            System.out.print("Ano de nascimento: ");
            int anoNascimento = sc.nextInt();
            pessoa.anoNascimento = anoNascimento;

            pessoas[i] = pessoa;
        }

        System.out.print("Número da pessoa para retornar idade: ");
        int numeroPessoa = sc.nextInt();
        pessoas[numeroPessoa - 1].calcularIdade();
    }
}
