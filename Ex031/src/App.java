// Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            float A, B, resultado;
            char C;

            System.out.print("\nDigite o 1° número: ");
            A = leitor.nextFloat();

            System.out.print("Digite o 2° número: ");
            B = leitor.nextFloat();

            System.out.print("Digite um operador aritmético: ");
            C = leitor.next().charAt(0);

            switch (C) {
                case '+':
                    resultado = A + B;
                    System.out.println("\nA soma de '" + A + "' e '" + B + "' é igual a " + resultado);
                    break;
                case '-':
                    resultado = A - B;
                    System.out.println("\nA subtração de '" + A + "' e '" + B + "' é igual a " + resultado);
                    break;
                case '*':
                    resultado = A * B;
                    System.out.println("\nA multiplicação de '" + A + "' e '" + B + "' é igual a " + resultado);
                    break;
                case '/':
                    if (A == 0 || B == 0) {
                        System.out.println("\nÉ impossível dividir por 0. Tente outro número.");
                        break;
                    } else {
                        resultado = A / B;
                        System.out.println("\nA divisão de '" + A + "' e '" + B + "' é igual a " + resultado);
                        break;
                    }
                default:
                    System.out.println("\nOperador inválido! Tente (' + ', ' - ', ' / ' ou ' * ')");
                    break;
            }
        }
    }
}