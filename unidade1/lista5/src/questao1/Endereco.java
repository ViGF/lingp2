package questao1;
public class Endereco {
  private String logradouro;
  private int numero;
  private String bairro;
  private String cidade;
  private String estado;
  private String cep;

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  @Override
  public String toString() {
    return logradouro + ", Nº " + numero + ", bairro " + bairro + ", " + cidade
        + " - " + estado + ", " + cep ;
  }
}
