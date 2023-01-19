// 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

import java.util.Scanner;;

class App {
  public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in);) {

      int opcao;
      int taxa;
      double juro;
      double valorFinal;
      double valorCarro = 30000;
      double valorCasa = 50000;
      double valorMoto = 15000;
      double valorBike = 5000;

      do {
        System.out.println("--------------------------------------------------");
        System.out.println("");

        System.out.println("1 - Comprar Carro R$ " + valorCarro);
        System.out.println("");

        System.out.println("2 - Comprar Casa R$ " + valorCasa);
        System.out.println("");

        System.out.println("3 - Comprar Moto R$ " + valorMoto);
        System.out.println("");

        System.out.println("4 - Comprar Bike R$ " + valorBike);
        System.out.println("");

        System.out.println("5 - Sair");

        System.out.println("--------------------------------------------------");

        System.out.print("Digite uma opção: ");
        opcao = leitor.nextInt();
        System.out.println("");

        switch (opcao) {
          case 1:
            System.out.print("Digite a taxa: ");
            taxa = leitor.nextInt();
            System.out.println("");

            System.out.println("--------------------------------------------------");

            juro = (valorCarro * taxa) / 100;
            valorFinal = valorCarro + juro;

            System.out.println("Parabéns! Você acaba de adquirir um carro novo do ano!");
            System.out.println("");
            System.out.println("Valor base do carro: R$" + valorCarro);
            System.out.println("");
            System.out.println(taxa + "% de taxa: R$" + juro);
            System.out.println("");
            System.out.println("Valor final do carro: " + valorFinal);
            break;

          case 2:
            System.out.print("Digite a taxa: ");
            taxa = leitor.nextInt();
            System.out.println("");

            System.out.println("--------------------------------------------------");

            juro = (valorCasa * taxa) / 100;
            valorFinal = valorCasa + juro;

            System.out.println("Parabéns! Você acaba de adquirir uma casa novinha!");
            System.out.println("");
            System.out.println("Valor base da casa: R$" + valorCasa);
            System.out.println("");
            System.out.println(taxa + "% de taxa: R$" + juro);
            System.out.println("");
            System.out.println("Valor final da casa: " + valorFinal);
            break;

          case 3:
            System.out.print("Digite a taxa: ");
            taxa = leitor.nextInt();
            System.out.println("");

            System.out.println("--------------------------------------------------");

            juro = (valorMoto * taxa) / 100;
            valorFinal = valorMoto + juro;

            System.out.println("Parabéns! Você acaba de adquirir uma moto novinha em folha!");
            System.out.println("");
            System.out.println("Valor base da moto: R$" + valorMoto);
            System.out.println("");
            System.out.println(taxa + "% de taxa: R$" + juro);
            System.out.println("");
            System.out.println("Valor final da moto: " + valorFinal);
            break;

          case 4:
            System.out.print("Digite a taxa: ");
            taxa = leitor.nextInt();
            System.out.println("");

            System.out.println("--------------------------------------------------");

            juro = (valorBike * taxa) / 100;
            valorFinal = valorBike + juro;

            System.out.println("Parabéns! Você acaba de adquirir uma bike nova da moda!");
            System.out.println("");
            System.out.println("Valor base da bike: R$" + valorBike);
            System.out.println("");
            System.out.println(taxa + "% de taxa: R$" + juro);
            System.out.println("");
            System.out.println("Valor final da bike: " + valorFinal);
            break;

          case 5:
            System.out.println("Obrigado pela visita! Volte sempre.");
            System.out.println("");
            break;

          default:
            System.out.println("Você digitou: " + opcao + ". Esse valor é inválido.");
            System.out.println("");
            break;
        }
      } while (opcao != 5);

    }
  }
}