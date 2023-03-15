// Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int entrada;
            char condicao;

            do {
                System.out.print("\nDigite um número inteiro: ");
                entrada = leitor.nextInt();
            
                PositivoOuNegativo.positivoNegativo(entrada);

            System.out.println("\nDeseja continuar? (S) - SIM | (Qualquer outra tecla) - NÃO");
            condicao = leitor.next().charAt(0);

        } while (condicao == 's' || condicao == 'S');
            
        leitor.close();

        }
    }
}
