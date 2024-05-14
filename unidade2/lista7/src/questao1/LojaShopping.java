package questao1;

public class LojaShopping extends Loja implements Registro {
  private String endereco;
  private String gerente;
  
  public LojaShopping(String identificador, String cnpj, String razaoSocial, String endereco, String gerente) {
    super(identificador, cnpj, razaoSocial);
    this.endereco = endereco;
    this.gerente = gerente;
  }

  @Override
  public String toString() {
    return "LojaShopping [identificador=" + identificador + ", endereco=" + endereco + ", cnpj=" + cnpj + ", gerente="
        + gerente + ", razaoSocial=" + razaoSocial + ", aberta=" + aberta + ", status()=" + status() + "]";
  }

  @Override
  public void registra_abertura_dia() {
    if (!this.aberta) {
      this.aberta = true;
      System.out.println("A loja abriu!");
    } else {
      System.out.println("A loja já esta aberta!");
    }
  }

  @Override
  public void registra_fechamento_dia() {
    if (this.aberta) {
      this.aberta = false;
      System.out.println("A loja fechou!");
    } else {
      System.out.println("A loja já esta fechada!");
    }
  }
}
