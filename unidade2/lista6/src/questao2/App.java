package questao2;

public class App {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Mikaelle Pessoa", "12345678910");
    Cliente c = new Cliente("Mikaelle Cliente", "12345678910", 1);
    Funcionario f = new Funcionario("Mikaelle Funcionario", "12345678910", "a1", 2800);
    Gerente g = new Gerente("Mikaelle Gerente", "12345678910", "a2", 4000, 1);

    p.mostraDados();
    System.out.println("");
    c.mostraDados();
    System.out.println("");
    f.mostraDados();
    System.out.println("");
    g.mostraDados();
  }
}
