package questao2;

public class App {
    public static void main(String[] args) {
      Automovel automovel = new Automovel(0.3);
      Bicicleta bicicleta = new Bicicleta();
      automovel.acelerar(30);
      automovel.trocarOleo(0.3);
      automovel.parar();
      bicicleta.acelerar(15);
      bicicleta.parar();
    }
}
