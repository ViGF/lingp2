package questao1;
public class Contato {
  protected String telefoneResid;
  protected String celular;
  protected String email;

  public String getTelefoneResid() {
    return this.telefoneResid;
  }

  public void setTelefoneResid(String telefoneResid) {
    this.telefoneResid = telefoneResid;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Telefone Residencial = " + telefoneResid + ", Celular = " + celular + ", Email = " + email;
  }  
}
