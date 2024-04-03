package questao5;

public class App {
  public static void main(String[] args) {
    ChefeDepartamento cd = new ChefeDepartamento(
      "Arnold",
      "23242352525",
      "10/07/1994",
      "3423534634636",
      "05/04/2023",
      1900.00,
      "Venda",
      "04/03/2024",
      300.00
    );
    Aluno aluno = new Aluno("Jorge", "223423534634", "10/04/2000", "324234546445");
    
    System.out.println(cd.toString());  
    System.out.println("");  
    System.out.println(aluno.toString());  
  }
}
