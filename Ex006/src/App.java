// 6. Leia dois valores para as variáveis A e B, e efetue as trocas dos valores de forma que a variável "A" passe a possuir o valor da variável "B" e a variável "B" passe a possuir o valor da variável "A".Apresentar os valores trocados.

import java.util.Scanner;;

class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {

            System.out.print("Digite o 1° valor: ");
            String valor1 = leitor.nextLine();

            System.out.print("Digite o 2° valor: ");
            String valor2 = leitor.nextLine();
            System.out.println("");

            System.out.println("---------- VALORES ORIGINAIS ----------");
            System.out.println("");
            System.out.println("1° Valor: " + valor1);
            System.out.println("2° Valor: " + valor2);
            System.out.println("");
            System.out.println("---------- FIM DOS VALORES ORIGINAIS ----------");
            System.out.println("");
            System.out.println("");

            String primeiroValorTrocado = valor2;
            String segundoValorTrocado = valor1;

            System.out.println("---------- VALORES INVERTIDOS ----------");
            System.out.println("");
            System.out.println("1° Valor: " + primeiroValorTrocado);
            System.out.println("2° Valor: " + segundoValorTrocado);
            System.out.println("");
            System.out.println("---------- FIM DOS VALORES INVERTIDOS ----------");

        }
    }
}
