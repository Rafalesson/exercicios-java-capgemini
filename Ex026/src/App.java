
// Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            int entrada;
            char condicao;

            do {
                System.out.print("\nDigite um número de 1 a 5: ");
                entrada = leitor.nextInt();

                switch (entrada) {
                    case 1:
                        System.out.println("\nUm");
                        break;

                    case 2:
                        System.out.println("\nDois");
                        break;

                    case 3:
                        System.out.println("\nTrês");
                        break;

                    case 4:
                        System.out.println("\nQuatro");
                        break;

                    case 5:
                        System.out.println("\nCinco");
                        break;

                    default:
                        System.out.println("Você digitou: " + entrada + ". Esse número é inválido.");
                }

                System.out.println("\nDeseja continuar? (S) - SIM | (Qualquer outra tecla) - NÃO");
                condicao = leitor.next().charAt(0);

            } while (condicao == 's' || condicao == 'S');

            leitor.close();
        }
    }
}
