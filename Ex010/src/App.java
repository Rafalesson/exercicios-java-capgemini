// 10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {

            double valorCompra;
            double valorParcelas;
            int parcelas = 5;

            System.out.print("Digite o valor das compras: ");
            valorCompra = leitor.nextDouble();
            System.out.println("");

            valorParcelas = valorCompra / parcelas;

            System.out.println("Valor das compras: R$" + valorCompra);
            System.out.println("Quantidade de parcelas: " + parcelas);
            System.out.println("Valor das parcelas: R$" + valorParcelas);
        }
    }
}
