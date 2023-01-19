// 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;

import java.util.Scanner;

class App {
    public static void main(String[] argumento) {
        try (Scanner leitor = new Scanner(System.in);) {
            int entrada;

            do {
                System.out.print("Digite um número: ");
                entrada = leitor.nextInt();
                System.out.println("");

                if (entrada > 10) {
                    System.out.println("Wow! Big number detected!");
                    System.out.println("");
                    System.out.println("Typed number: " + entrada);
                    System.out.println("");

                } else {
                    System.out.println("That's not big deal.");
                    System.out.println("");
                    System.out.println("Typed number: " + entrada);
                    System.out.println("");
                    System.out.println("----------------------------------");
                }
            } while (entrada < 10);
        }
    }
}
