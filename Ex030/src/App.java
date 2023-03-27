// Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("\nDigite o 1° número: ");
            int valor1 = leitor.nextInt();

            System.out.print("Digite o 2° número: ");
            int valor2 = leitor.nextInt();

            System.out.print("Digite o 3° número: ");
            int valor3 = leitor.nextInt();

            int menor, medio, maior;

            if (valor1 < valor2 && valor1 < valor3) {
                menor = valor1;

                if (valor2 < valor3) {
                    medio = valor2;
                    maior = valor3;
                } else {
                    medio = valor3;
                    maior = valor2;
                }
            } else if(valor2 < valor1 && valor2 < valor3){
                menor = valor2;

                if (valor1 < valor3) {
                    medio = valor1;
                    maior = valor3;
                } else {
                    medio = valor3;
                    maior = valor2;
                }
            } else {
                menor = valor3;

                if (valor1 < valor2) {
                    medio = valor1;
                    maior = valor2;
                } else {
                    medio = valor2;
                    maior = valor1;
                }
            }

            System.out.println("\nNúmero menor: " + menor);
            System.out.println("Número médio: " + medio);
            System.out.println("Número Maior: " + maior);
        }
    }
}
