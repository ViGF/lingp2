package questao2;

public class Funcionario extends Pessoa {
  protected String matricula;
  protected double salario;

  Funcionario(String nome, String cpf, String matricula, double salario) {
    super(nome, cpf);
    this.matricula = matricula;
    this.salario = salario;
  }

  @Override
  void mostraDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Matricula: " + matricula);
    System.out.println("Salario: R$" + salario);
  }
}
