package questao3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] animais = new Animal[3];

        for(int i = 0; i < 3; i++) {
            Animal animal = new Animal();
            System.out.println("Animal " + (i + 1) + ": ");

            System.out.print("Nome: ");
            animal.nome = sc.nextLine();

            System.out.print("Habitat: ");
            animal.habitat = sc.nextLine();

            System.out.print("Som: ");
            animal.som = sc.nextLine();

            animais[i] = animal;
        }

        System.out.println("Número do animal para emitir som: ");
        int animalNumero = sc.nextInt();
        animais[animalNumero - 1].emitirSom();
    }
}
