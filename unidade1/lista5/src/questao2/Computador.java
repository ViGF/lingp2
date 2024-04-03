package questao2;

public class Computador {
  private Memoria memoria;
  private Monitor monitor;
  private PlacaMae placaMae;
  private Teclado teclado;

  public Computador(Memoria memoria, Monitor monitor, PlacaMae placaMae, Teclado teclado) {
    this.memoria = memoria;
    this.monitor = monitor;
    this.placaMae = placaMae;
    this.teclado = teclado;
  }

  @Override
  public String toString() {
    return "Computador [memoria: " + memoria.toString() + ", monitor: " + monitor.toString() + ", placaMae: "
        + placaMae.toString() + ", teclado: " + teclado.toString()
        + "]";
  }
}
