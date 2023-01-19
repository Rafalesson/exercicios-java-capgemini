// 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética);

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in);) {

            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = leitor.nextLine();
            System.out.println("");

            System.out.print("Digite a 1ª nota do aluno: ");
            float nota1 = leitor.nextFloat();
            System.out.println("");

            System.out.print("Digite a 2ª nota do aluno: ");
            float nota2 = leitor.nextFloat();
            System.out.println("");

            System.out.print("Digite a 3ª nota do aluno: ");
            float nota3 = leitor.nextFloat();
            System.out.println("");

            float mediaAluno = (nota1 + nota2 + nota3) / 3;

            System.out.println("Nome do Aluno: " + nomeAluno);
            System.out.println("Média do Aluno: " + mediaAluno);
        }
    }
}