// 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma

import java.util.Scanner;

class App {
  public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
        System.out.print("Digite um número: ");
        int n1 = leitor.nextInt();
        System.out.println("");

        System.out.print("Digite outro número: ");
        int n2 = leitor.nextInt();
        System.out.println("");

        int soma = n1 + n2;
        
        System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a: " + soma);
    }
    
  }
}

