package questao2;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        System.out.println("Tipo de conta:");
        System.out.println("C - Corrente");
        System.out.println("P - Poupanca");
        System.out.print("Opcao: ");
        char tipoConta = sc.next().toLowerCase().charAt(0);

        Conta contaSelecionada = null;

        switch (tipoConta) {
            case 'c':
                contaSelecionada = contaCorrente;
                break;
            case 'p':
                contaSelecionada = contaPoupanca;
                break;
            default:
                break;
        }

        
        if (contaSelecionada != null) {
            System.out.print("(S) sacar (D) depositar: ");
            char operacao = sc.next().toLowerCase().charAt(0);
            
            while (operacao == 's' || operacao == 'd') {
                System.out.print("Valor: R$");
                double valor = sc.nextDouble();

                if (operacao == 's') {
                    contaSelecionada.sacar(valor);
                } else if (operacao == 'd') {
                    contaSelecionada.depositar(valor);
                }

                System.out.print("(S) sacar (D) depositar: ");
                operacao = sc.next().toLowerCase().charAt(0);
            }
        }
    }
}
