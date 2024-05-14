package questao2;

public class Cliente extends Pessoa {
  protected int codigo;

  Cliente(String nome, String cpf, int codigo) {
    super(nome, cpf);
    this.codigo = codigo;
  }

  @Override
  void mostraDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Codigo: " + codigo);
  }
}
