package questao2;

public class Gerente extends Funcionario {
  private int area;

  public Gerente(String nome, String cpf, String matricula, double salario, int area) {
    super(nome, cpf, matricula, salario);
    this.area = area;
  }

  @Override
  void mostraDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Matricula: " + matricula);
    System.out.println("Area: " + area);
  }
}
