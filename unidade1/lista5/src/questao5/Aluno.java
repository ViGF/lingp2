package questao5;

public class Aluno extends Pessoa {
  private String matricula;

  Aluno(String nome, String cpf, String dataNasc, String matricula) {
    super(nome, cpf, dataNasc);
    this.matricula = matricula;
  }

  public String getMatricula() {
    return matricula;
  }

  @Override
  public String toString() {
    return "Aluno:\n" + super.toString() + "\nMatricula = " + matricula;
  }
}
