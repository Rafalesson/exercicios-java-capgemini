import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;
        boolean equilatero, isosceles, escaleno;

        System.out.print("\nDigite o tamanho do 1° lado do triângulo: ");
        lado1 = sc.nextInt();

        System.out.print("Digite o tamanho do 2° lado do triângulo: ");
        lado2 = sc.nextInt();

        System.out.print("Digite o tamanho do 3° lado do triângulo: ");
        lado3 = sc.nextInt();

        // Verifica se as medidas formam um triângulo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            // Verifica se é um triângulo equilátero
            equilatero = lado1 == lado2 && lado2 == lado3;

            // Verifica se é um triângulo isósceles
            isosceles = lado1 == lado2 || lado2 == lado3 || lado3 == lado1;

            // Verifica se é um triângulo escaleno
            escaleno = !equilatero && !isosceles;

            if (equilatero) {
                System.out.println("\nO triângulo é equilátero.");
            } else if (isosceles) {
                System.out.println("\nO triângulo é isósceles.");
            } else if (escaleno) {
                System.out.println("\nO triângulo é escaleno.");
            }
        } else {
            System.out.println("\nOs lados informados não formam um triângulo.");
        }

    }
}