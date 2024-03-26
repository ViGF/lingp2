package questao2;

public class Conta {
    double saldo;

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("O saldo da conta não é suficiente!");
        } else {
            this.saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        }

        System.out.println("Saldo na conta: " + saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Valor depositado: " + valor);
        System.out.println("Saldo na conta: " + saldo);

    }
}
