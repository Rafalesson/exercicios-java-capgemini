// 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {
            int numeroDigitado;

            do {
                System.out.print("Digite um número: ");
                numeroDigitado = leitor.nextInt();
                System.out.println("");

                if (numeroDigitado >= 100 && numeroDigitado <= 200) {
                    System.out.println(" ----------------- RESULTADO ----------------- ");
                    System.out.println("");

                    System.out.println("Número digitado: '" + numeroDigitado + "'");
                    System.out.println("");

                    System.out.println("                      :)");
                    System.out.println("");

                    System.out.println("O número digitado está dentro do range.");
                } else {
                    System.out.println(" ----------------- RESULTADO ----------------- ");
                    System.out.println("");

                    System.out.println("Número digitado: '" + numeroDigitado + "'");
                    System.out.println("");

                    System.out.println("                       :(");
                    System.out.println("");

                    System.out.println("O número digitado NÃO está dentro do range.");
                    System.out.println("");
                }
            } while (numeroDigitado < 100 || numeroDigitado > 200);

        }
    }
}
