package questao5;

public class ChefeDepartamento extends Funcionario {
  private String departamento;
  private String dataPromocao;
  private double gratificacao;

  public ChefeDepartamento(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao,
      double salario, String departamento, String dataPromocao, double gratificacao) {
    super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
    this.departamento = departamento;
    this.dataPromocao = dataPromocao;
    this.gratificacao = gratificacao;
  }

  public String getDepartamento() {
    return this.departamento;
  }

  public String getDataPromocao() {
    return this.dataPromocao;
  }

  public double getGratificacao() {
    return this.gratificacao;
  }

  @Override
  public String toString() {
    return "ChefeDepartamento:\n" + super.toString() + "\nDepartamento = " + departamento + "\nData da Promocao = " + dataPromocao + "\nGratificacao = "
        + gratificacao;
  }
}
