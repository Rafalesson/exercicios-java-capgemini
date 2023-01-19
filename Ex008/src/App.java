// 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com ousuário;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {

            float cotacao;
            float valorEmDolar;
            float valorEmReal;

            System.out.print("Digite o valor da cotação do dólar: ");
            cotacao = leitor.nextFloat();

            System.out.print("Digite o valor que deseja converter: ");
            valorEmDolar = leitor.nextFloat();
            System.out.println("");

            valorEmReal = valorEmDolar * cotacao;

            System.out.println("U$" + valorEmDolar + " equivale a R$" + valorEmReal);

        }
    }
}