package questao1;

public abstract class Loja {
  protected String identificador;
  protected String cnpj;
  protected String razaoSocial;
  protected boolean aberta;

  public Loja(String identificador, String cnpj, String razaoSocial) {
    this.identificador = identificador;
    this.cnpj = cnpj;
    this.razaoSocial = razaoSocial;
    this.aberta = false;
  }

  public String status() {
    return this.razaoSocial + " - " + this.aberta;
  }

  
}
