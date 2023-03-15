// Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor de venda de cada produto, a média de preço de custo e do preço de venda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in);) {
            float precoCusto = 0, precoVenda = 0, totalCusto = 0, totalVenda = 0, mediaCusto = 0,
                    mediaVenda = 0;
            int n = 40;

            for (int i = 0; i < n; i++) {
                System.out.print("\nPreço de custo do " + (i + 1) + "° produto: ");
                precoCusto = leitor.nextFloat();

                System.out.print("Preço de venda do " + (i + 1) + "° produto: ");
                precoVenda = leitor.nextFloat();

                System.out.println("");

                lucroOuPrejuizo(precoCusto, precoVenda);

                totalCusto += precoCusto;
                totalVenda += precoVenda;
            }

            leitor.close();

            mediaCusto = totalCusto / n;
            mediaVenda = totalVenda / n;

            System.out.println("\nResultado: \n");
            System.out.println("Valor médio de custo: " + mediaCusto);
            System.out.println("Valor médio da venda: " + mediaVenda);
        }
    }

    public static float lucroOuPrejuizo(float precoCusto, float precoVenda) {
        float lucroOuPerda = 0;

        lucroOuPerda = precoVenda - precoCusto;

        if (precoCusto < precoVenda) {
            System.out.println("Valor de custo: R$" + precoCusto);
            System.out.println("Valor de venda: R$" + precoVenda);
            System.out.println("\nTeve R$" + lucroOuPerda + " de lucro!");

        } else if (precoCusto == precoVenda) {
            System.out.println("Valor de custo: R$" + precoCusto);
            System.out.println("Valor de venda: R$" + precoVenda);
            System.out.println("\nFaturou R$" + lucroOuPerda + " na venda. Deu empate.");

        } else {
            System.out.println("Valor de custo: R$" + precoCusto);
            System.out.println("Valor de venda: R$" + precoVenda);
            System.out.println("\nTeve R$" + lucroOuPerda + " de prejuízo!");
        }

        return lucroOuPerda;
    }
}