package questao1;

public class Funcionario extends Pessoa {
  private double salario;
  private String cargo;

  Funcionario(String nome, String dataNasc, double salario, String cargo) {
    super(nome, dataNasc);
    this.salario = salario;
    this.cargo = cargo;
  }

  public double salario() {
    return this.salario * 2;
  }

  @Override
  public String toString() {
    return "nome=" + nome + ", dataNasc=" + dataNasc + ", salario=" + salario + ", cargo=" + cargo;
  }	
}
