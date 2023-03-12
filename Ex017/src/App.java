// Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in);) {
            int qtdNumIntervalo = 0;
            List<Integer> numerosIntervalo = new ArrayList<>();

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = leitor.nextInt();

                if (numero >= 10 && numero <= 150) {
                    numerosIntervalo.add(numero);
                    qtdNumIntervalo++;
                }
            }

            System.out.println("");
            System.out.println("Quantidade de números no intervalo entre 10 e 150: " + qtdNumIntervalo);
            System.out.print("Números no intervalo entre 10 e 150: ");

            for (int numero : numerosIntervalo) {
                System.out.print("\n" + numero );
            }
        }
    }
}
