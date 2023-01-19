// 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 0,07% a.m;

import java.util.Scanner;;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {
            double juro = 0.07;
            double valorDoJuro;
            double valorDepositado;
            double valorDepositadoAjustado;

            System.out.print("Digite o valor depositado: ");
            valorDepositado = leitor.nextDouble();
            System.out.println("");

            valorDoJuro = (valorDepositado * juro) / 100;
            valorDepositadoAjustado = valorDepositado + juro;

            System.out.println("Valor depositado: " + valorDepositado);
            System.out.println("Valor do rendimento: " + valorDoJuro);
            System.out.println("");
            System.out.println("Valor final: " + valorDepositadoAjustado);
        }
    }
}
