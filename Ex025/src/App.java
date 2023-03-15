// Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner leitor = new Scanner(System.in)){
            int num1, num2;
            char condicao;

           do{
            System.out.print("\nDigite o 1° número: ");
            num1 = leitor.nextInt();

            System.out.print("\nDigite o 2° número: ");
            num2 = leitor.nextInt();

            if (num1 > num2) {
                System.out.println("\nOs números são diferentes!");
                System.out.println("O número " + num1 + " é maior que o número " + num2);

            } else if (num1 < num2) {
                System.out.println("\nOs números são diferentes!");
                System.out.println("O número " + num2 + " é maior que o número " + num1);

            } else {
                System.out.println("\nOs números são iguais!");
                System.out.println("O número " + num2 + " é igual ao número " + num1);
            }

            System.out.println("\nDeseja continuar? (S) - SIM | (Qualquer outra tecla) - NÃO");
            condicao = leitor.next().charAt(0);

        } while (condicao == 's' || condicao == 'S');
        }
    }
}
