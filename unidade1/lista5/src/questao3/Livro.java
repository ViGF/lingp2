package questao3;

public class Livro {
  private Titulo titulo;
  private Autor autor;
  private Capitulo capitulo;
  private Editora editora;
  
  public Livro(Titulo titulo, Autor autor, Capitulo capitulo, Editora editora) {
    this.titulo = titulo;
    this.autor = autor;
    this.capitulo = capitulo;
    this.editora = editora;
  }

  @Override
  public String toString() {
    return "Livro [titulo: " + titulo.toString() + ", autor: " + autor.toString() + ", capitulo: " + capitulo.toString() + ", editora: " + editora.toString() + "]";
  }

  
}
