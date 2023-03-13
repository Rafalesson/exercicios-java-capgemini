import java.util.Scanner;

// A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            String modelo;
            int ano, totalCarros = 0, carrosAte2000 = 0;
            float preco;
            float desconto;
            char condicao;

            do {
                System.err.print("Digite o modelo do carro: ");
                modelo = scan.nextLine();

                System.err.print("Digite o ano do carro: ");
                ano = scan.nextInt();

                System.err.print("Digite o preço do carro: ");
                preco = scan.nextFloat();

                Carro carro = new Carro(modelo, ano, preco);

                if (carro.getAno() <= 2000) {
                    desconto = (preco * 12) / 100;

                    carro.setPreco(preco - desconto);
                    carrosAte2000++;
                    totalCarros++;

                    System.out.println("");
                    System.out.println("Parabéns! Seu " + carro.getModelo()
                            + " recebeu 12% de desconto e ficou no valor de R$" + carro.getPreco());
                    System.out.println("");
                } else {
                    desconto = (preco * 7) / 100;

                    carro.setPreco(preco - desconto);
                    totalCarros++;

                    System.out.println("Parabéns! Seu " + carro.getModelo()
                            + " recebeu 7% de desconto e ficou no valor de R$" + carro.getPreco());
                    System.out.println("");
                }

                System.out.println("Carros até ano 2000: " + carrosAte2000);
                System.out.println("Total de Carros: " + totalCarros);
                System.out.println("");

                System.out.println("Deseja continuar? (S) - SIM | (Qualquer outra tecla) - NÃO");
                condicao = scan.next().charAt(0);
                scan.nextLine();

                System.out.println("");
            } while (condicao == 'S' || condicao == 's');

            scan.close();
        }

    }
}
