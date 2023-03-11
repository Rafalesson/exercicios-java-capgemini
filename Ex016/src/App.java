// Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in);){
            float nota1, nota2, nota3, media;            
          
                System.out.print("Digite a nota 1: ");
                nota1 = leitor.nextFloat();

                System.out.print("Digite a nota 2: ");
                nota2 = leitor.nextFloat();

                System.out.print("Digite a nota 3: ");
                nota3 = leitor.nextFloat();
                System.out.println("");
                
                media = (nota1 + nota2 + nota3) / 3;

                if (media >= 7) {
                    System.out.println("Aprovado!");
                    System.out.println("Sua média foi: " + media);

                } else if (media >= 5.1 && media <= 6.9) {
                    System.out.println("Recuperação!");
                    System.out.println("Sua média foi: " + media);

                } else {
                    System.out.println("Reprovado!");
                    System.out.println("Sua média foi: " + media);
                }
                
        }
    }
}