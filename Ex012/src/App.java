// 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {

            float valorFabricaGol = 26000;
            float valorFabricaUno = 17000;
            float valorFabricaCorsa = 18000;
            float valorFabricaCelta = 23000;
            float valorCarroComImposto;
            float valorFinalCarro;

            float taxaImposto = 45;
            float valorImposto;
            float taxaDistribuidor = 28;
            float percentualDistribuidor;
            int opcao;

            do {
                System.out.println("--------------------- MENU OPÇÕES --------------------");
                System.out.println("");

                System.out.println("1 - Comprar Gol R$ " + valorFabricaGol);
                System.out.println("");

                System.out.println("2 - Comprar Uno R$ " + valorFabricaUno);
                System.out.println("");

                System.out.println("3 - Comprar Corsa R$ " + valorFabricaCorsa);
                System.out.println("");

                System.out.println("4 - Comprar Celta R$ " + valorFabricaCelta);
                System.out.println("");

                System.out.println("5 - Sair");

                System.out.println("-------------------- FIM MENU -------------------------");
                System.out.println("");

                System.out.print("Digite uma opção (1 - 5): ");
                opcao = leitor.nextInt();
                System.out.println("");

                switch (opcao) {
                    case 1:
                        System.out.println("--------------------- RESULTADO --------------------");
                        System.out.println("");

                        System.out.println("Parabéns! Você acaba de comprar um golzinho bola novinho.");
                        System.out.println("");

                        valorImposto = (valorFabricaGol * taxaImposto) / 100;
                        valorCarroComImposto = valorFabricaGol + valorImposto;
                        percentualDistribuidor = (valorCarroComImposto * taxaDistribuidor) / 100;

                        valorFinalCarro = valorCarroComImposto + percentualDistribuidor;

                        System.out.println("Valor base do carro: " + valorFabricaGol);
                        System.out.println("");

                        System.out.println("Valor do imposto: " + valorImposto);
                        System.out.println("");

                        System.out.println("Percentual do distribuidor: " + percentualDistribuidor);
                        System.out.println("");

                        System.out.println("Valor final do carro: " + valorFinalCarro);
                        System.out.println("");

                        System.out.println("--------------------- FIM RESULTADO --------------------");
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("--------------------- RESULTADO --------------------");
                        System.out.println("");

                        System.out.println("Parabéns! Você acaba de comprar um Uno quadrado louco.");
                        System.out.println("");

                        valorImposto = (valorFabricaUno * taxaImposto) / 100;
                        valorCarroComImposto = valorFabricaUno + valorImposto;
                        percentualDistribuidor = (valorCarroComImposto * taxaDistribuidor) / 100;

                        valorFinalCarro = valorCarroComImposto + percentualDistribuidor;

                        System.out.println("Valor base do carro: " + valorFabricaUno);
                        System.out.println("");

                        System.out.println("Valor do imposto: " + valorImposto);
                        System.out.println("");

                        System.out.println("Percentual do distribuidor: " + percentualDistribuidor);
                        System.out.println("");

                        System.out.println("Valor final do carro: " + valorFinalCarro);
                        System.out.println("");

                        System.out.println("--------------------- FIM RESULTADO --------------------");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("--------------------- RESULTADO --------------------");
                        System.out.println("");

                        System.out.println("Parabéns! Você acaba de comprar um Corsa chique demais!");
                        System.out.println("");

                        valorImposto = (valorFabricaCorsa * taxaImposto) / 100;
                        valorCarroComImposto = valorFabricaCorsa + valorImposto;
                        percentualDistribuidor = (valorCarroComImposto * taxaDistribuidor) / 100;

                        valorFinalCarro = valorCarroComImposto + percentualDistribuidor;

                        System.out.println("Valor base do carro: " + valorFabricaCorsa);
                        System.out.println("");

                        System.out.println("Valor do imposto: " + valorImposto);
                        System.out.println("");

                        System.out.println("Percentual do distribuidor: " + percentualDistribuidor);
                        System.out.println("");

                        System.out.println("Valor final do carro: " + valorFinalCarro);
                        System.out.println("");

                        System.out.println("--------------------- FIM RESULTADO --------------------");
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("--------------------- RESULTADO --------------------");
                        System.out.println("");

                        System.out.println("Parabéns! Você acaba de comprar um Celta rebaixado.");
                        System.out.println("");

                        valorImposto = (valorFabricaCelta * taxaImposto) / 100;
                        valorCarroComImposto = valorFabricaCelta + valorImposto;
                        percentualDistribuidor = (valorCarroComImposto * taxaDistribuidor) / 100;

                        valorFinalCarro = valorCarroComImposto + percentualDistribuidor;

                        System.out.println("Valor base do carro: " + valorFabricaCelta);
                        System.out.println("");

                        System.out.println("Valor do imposto: " + valorImposto);
                        System.out.println("");

                        System.out.println("Percentual do distribuidor: " + percentualDistribuidor);
                        System.out.println("");

                        System.out.println("Valor final do carro: " + valorFinalCarro);
                        System.out.println("");

                        System.out.println("--------------------- FIM RESULTADO --------------------");
                        System.out.println("");
                        break;

                    case 5:
                        System.out.println("Obrigado pela visita! Volte sempre.");
                        System.out.println("");
                        break;

                    default:
                        System.out.println("Você digitou '" + opcao
                                + "', essa é uma opção inválida. Favor digitar algum número de 1 a 5.");
                        System.out.println("");
                        break;
                }
            } while (opcao != 5);
        }
    }
}