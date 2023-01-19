// 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

import java.util.Scanner;;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {

            System.out.print("Digite o nome do vendedor: ");
            String nomeVendedor = leitor.nextLine();
            System.out.println("");

            System.out.print("Digite o salário do vendedor: ");
            float salarioBase = leitor.nextFloat();
            System.out.println("");

            System.out.print("Digite o total vendido: ");
            float VendasTotaisValor = leitor.nextFloat();
            System.out.println("");

            float comissao = (VendasTotaisValor * 15) / 100;
            float salarioComissionado = salarioBase + comissao;

            System.out.println("Nome do vendedor: " + nomeVendedor);
            System.out.println("");

            System.out.println("Salário base do vendedor: " + salarioBase);
            System.out.println("");

            System.out.println("Vendas do mês: " + VendasTotaisValor);
            System.out.println("");

            System.out.println("Comissão: 15%");
            System.out.println("");

            System.out.println("Salário final do vendedor: " + salarioComissionado);
            System.out.println("");
        }
    }

}
