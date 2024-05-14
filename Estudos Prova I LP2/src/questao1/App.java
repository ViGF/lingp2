package questao1;

public class App {
  public static void main(String[] args) {
    Funcionario func = new Funcionario("Carlos", "10/03/200", 2356, "Administrador");
    System.out.println(func.salario());
    System.out.println(func);
  }
}