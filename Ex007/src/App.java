// 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de conversão é: F = (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius; 

import java.util.Scanner;;

class Main {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {

            System.out.print("Digite a temperatura em Celsius: ");
            float temperaturaC = leitor.nextFloat();
            System.out.println("");

            float temperaturaF = (9 * temperaturaC + 160) / 5;

            System.out.println(temperaturaC + "°C equivale a " + temperaturaF + "°F");
        }
    }
}