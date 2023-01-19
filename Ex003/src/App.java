// 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {
            System.out.print("Digite a distância percorrida: ");
            int distancia = leitor.nextInt();
            System.out.println("");

            System.out.print("Digite o combustível gasto (L): ");
            int combustivel = leitor.nextInt();
            System.out.println("");

            float consumoMedio = distancia / combustivel;

            System.out.println("Você rodou " + distancia + "km e consumiu " + combustivel + "L de combustível.");
            System.out.println("Seu consumo médio foi de " + consumoMedio + "km rodados para cada litro de combustível.");
        }
    }
}
