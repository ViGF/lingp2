package questao3;

public class Animal {
    String nome;
    String som;
    String habitat;

    public void emitirSom() {
        System.out.println("Animal: " + this.nome);
        System.out.println("Som: " + this.som);
    }
}
