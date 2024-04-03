package questao3;

public class App {
  public static void main(String[] args) {
    Autor autor = new Autor("Aroldo");
    Capitulo cap = new Capitulo("Inicio");
    Editora editora = new Editora("Astra");
    Titulo titulo = new Titulo("Águas");

    Livro livro = new Livro(titulo, autor, cap, editora);
    System.out.println(livro.toString());
  }
}
