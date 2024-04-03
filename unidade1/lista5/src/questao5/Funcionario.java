package questao5;

public class Funcionario extends Pessoa {
  private String matricula;
  private String dataAdmissao;
  private double salario;

  public Funcionario(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao, double salario) {
    super(nome, cpf, dataNasc);
    this.matricula = matricula;
    this.dataAdmissao = dataAdmissao;
    this.salario = salario;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public String getDataAdmissao() {
    return this.dataAdmissao;
  }

  public double getSalario() {
    return this.salario;
  }

  @Override
  public String toString() {
    return "Matricula = " + matricula + "\nData de Admissao = " + dataAdmissao + "\nSalario = " + salario;
  }
}
