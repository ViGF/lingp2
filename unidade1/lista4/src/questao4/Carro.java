package questao4;
public class Carro {
  private String marca;
  private String modelo;
  private int ano;
  private String combustivel;
  private Pessoa proprietario;

  Carro(String marca, String modelo, int ano, String combustivel) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.combustivel = combustivel;
  }

  void ligar() {
    System.out.println("Carro Ligado!");
  }

  void desligar() {
    System.out.println("Carro Desligado!");
  }

  void acelerar() {
    System.out.println("Carro Acelerando!");
  }

  void frear() {
    System.out.println("Carro Freando!");
  }

  public String getModelo() {
    return modelo;
  }

  public String getMarca() {
    return marca;
  }

  public int getAno() {
    return ano;
  }

  public String getCombustivel() {
    return combustivel;
  }

  public Pessoa getProprietario() {
    return proprietario;
  }

  public void setProprietario(Pessoa proprietario) {
    this.proprietario = proprietario;
  }
}
