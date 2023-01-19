//2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {
            System.out.print("Digite um número: ");
            int n1 = leitor.nextInt();
            System.out.println("");

            System.out.print("Digite outro número: ");
            int n2 = leitor.nextInt();
            System.out.println("");

            int soma = n1 + n2;
            int subtracao = n1 - n2;
            int multiplicacao = n1 * n2;
            float divisao = n1 / n2;

            System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a: " + soma);
            System.out.println("");

            System.out.println("A subtração entre " + n1 + " e " + n2 + " é igual a: " + subtracao);
            System.out.println("");

            System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é igual a: " + multiplicacao);
            System.out.println("");

            System.out.println("A divisão entre " + n1 + " e " + n2 + " é igual a: " + divisao);
        }
    }
}
