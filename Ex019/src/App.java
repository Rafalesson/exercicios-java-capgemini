// Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in);) {
            int quantidaHomens = 0;
            int quantidaMulheres = 0;
            int quantidaOutros = 0;
            List<String> nomesOutros = new ArrayList<>();
            List<String> nomesHomens = new ArrayList<>();
            List<String> nomesMulheres = new ArrayList<>();

            for (int i = 1; i <= 4; i++) {
                System.out.print("Digite o nome da " + i + "ª pessoa: ");
                String nome = leitor.next();

                System.out.print("Digite o sexo da " + i + "ª pessoa (M ou F): ");
                char sexo = leitor.next().charAt(0);

                if (sexo == 'm' || sexo == 'M') {
                    System.out.println(nome + " é homem.");
                    nomesHomens.add(nome);
                    quantidaHomens++;
                    System.out.println("");

                } else if (sexo == 'f' || sexo == 'F') {
                    System.out.println(nome + " é mulher.");
                    nomesMulheres.add(nome);
                    quantidaMulheres++;
                    System.out.println("");
                    
                } else {
                    System.out.println(nome + " tem outro sexo!");
                    nomesOutros.add(nome);
                    quantidaOutros++;
                    System.out.println("");
                }
            }
            
            System.out.println("");
            System.out.println("Total de homens: " + quantidaHomens);
            System.out.println("Nomes dos homens: " + nomesHomens);
            System.out.println("");
            System.out.println("Total de mulheres: " + quantidaMulheres);
            System.out.println("Nomes das mulheres: " + nomesMulheres);
            System.out.println("");
            System.out.println("Total de outros sexos: " + quantidaOutros);
            System.out.println("Nomes dos outros: " + nomesOutros);


        }
    }
}
