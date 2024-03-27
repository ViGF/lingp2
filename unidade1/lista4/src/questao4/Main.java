package questao4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scString = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informações do Veículo");
    System.out.print("Marca: ");
    String marca = scString.nextLine();

    System.out.print("Modelo: ");
    String modelo = scString.nextLine();

    System.out.print("Ano de Fabricação: ");
    int anoFabricacao = sc.nextInt();

    System.out.print("Tipo de Combustível: ");
    String tipoCombustivel = scString.nextLine();

    System.out.println("\nInformações do Proprietário");
    System.out.print("Nome: ");
    String nome = scString.nextLine();
    Pessoa proprietario = new Pessoa(nome);

    Carro carro = new Carro(marca, modelo, anoFabricacao, tipoCombustivel);
    carro.setProprietario(proprietario);
    proprietario.setCarro(carro);

    System.out.println("\nInformações Cadastradas do Veículo:");
    System.out.println(carro.getModelo());
    System.out.println(carro.getMarca());
    System.out.println(carro.getAno());
    System.out.println(carro.getCombustivel());
    System.out.println(carro.getProprietario().getNome());
  }
}
