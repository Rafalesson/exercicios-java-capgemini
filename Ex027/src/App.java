// A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            String modelo;
            float preco;
            String combustivel;
            float desconto = 0;

            System.out.print("\nDigite o modelo do carro: ");
            modelo = leitor.nextLine();

            System.out.print("Digite o valor do carro: ");
            preco = leitor.nextFloat();

            System.out.print("Digite o tipo de combustível: ");
            combustivel = leitor.next();

            Carro carro = new Carro(modelo, preco, combustivel);

            if (carro.getCombustivel() == "Álcool" || carro.getCombustivel() == "álcool"
                    || carro.getCombustivel() == "alcool") {
                        
                desconto = (carro.getPreco() * 25) / 100;

                System.out.println("\nPreço inicial: " + carro.getPreco());
                carro.setPreco(carro.getPreco() - desconto);

                System.out.println("Descoto R$" + desconto);
                System.out.println("Valor final R$" + carro.getPreco());

            } else if (carro.getCombustivel() == "Gasolina" || carro.getCombustivel() == "gasolina") {
                desconto = (carro.getPreco() * 21) / 100;

                System.out.println("\nPreço inicial: " + carro.getPreco());
                carro.setPreco(carro.getPreco() - desconto);

                System.out.println("Desconto R$" + desconto);
                System.out.println("Valor final R$" + carro.getPreco());
                
            } else {
                desconto = (carro.getPreco() * 14) / 100;

                System.out.println("\nPreço inicial: " + carro.getPreco());
                carro.setPreco(carro.getPreco() - desconto);

                System.out.println("Desconto R$" + desconto);
                System.out.println("Valor final R$" + carro.getPreco());
            }
        }
    }
}
