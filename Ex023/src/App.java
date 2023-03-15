// Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, menor que 25 ou igual a 40

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int entrada;
            char condicao;

            do {
                System.out.print("\nDigite um número inteiro: ");
                entrada = leitor.nextInt();

                verificaNumero(entrada);

                System.out.println("\nDeseja continuar? (S) - SIM | (Qualquer outra tecla) - NÃO");
                condicao = leitor.next().charAt(0);

            } while (condicao == 's' || condicao == 'S');

            leitor.close();
        }
    }

    public static int verificaNumero(int entrada) {

        if (entrada > 80) {
            System.out.println("\nNúmero digitado: " + entrada);
            System.out.println("Esse número é maior que 80.");

        } else if (entrada < 25) {
            System.out.println("\nNúmero digitado: " + entrada);
            System.out.println("Esse número é menor que 25.");

        } else if (entrada == 40) {
            System.out.println("\nNúmero digitado: " + entrada);
            System.out.println("Esse número é igual a 40.");

        } else {
            System.out.println("\nNúmero digitado: " + entrada);
            System.out.println("Esse número está na margem de erro do sistema.");
        }

        return entrada;
    }
}
