// Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in);) {
            int maiorIdade = 0;
            int menorIdade = 0;
            List<Integer> maiorIdades = new ArrayList<>();
            List<Integer> menorIdades = new ArrayList<>();

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a " + i + "ª idade: ");
                int idade = leitor.nextInt();

                if (idade >= 18) {
                    maiorIdades.add(idade);
                    maiorIdade++;
                } else {
                    menorIdades.add(idade);
                    menorIdade++;
                }
            }

            Collections.sort(maiorIdades);
            Collections.sort(menorIdades);

            System.out.println("");
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Idades: " + maiorIdades);
            System.out.println("");

            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Idades: " + menorIdades);
        }
    }
}
