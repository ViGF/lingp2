package questao1;

public class App {
    public static void main(String[] args) {
        LojaShopping l1 = new LojaShopping("1", "cnpj-teste-1", "razaoSocial-teste-1", "enderco-teste-1", "gerente-teste-1");

        LojaShopping l2 = new LojaShopping("2", "cnpj-teste-2", "razaoSocial-teste-2", "enderco-teste-2", "gerente-teste-2");

        LojaShopping l3 = new LojaShopping("3", "cnpj-teste-3", "razaoSocial-teste-3", "enderco-teste-3", "gerente-teste-3");

        l1.registra_abertura_dia();
        l2.registra_fechamento_dia();
        l3.registra_abertura_dia();

        l1.registra_fechamento_dia();
        l2.registra_abertura_dia();
        l3.registra_fechamento_dia();
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
    }
}
