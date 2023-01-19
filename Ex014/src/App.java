// 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

import java.util.Scanner;;

class App {
    public static void main(String[] qlqCoisa) {
        try (Scanner leitor = new Scanner(System.in);) {

            int n1;
            int n2;

            System.out.print("Digite um número: ");
            n1 = leitor.nextInt();
            System.out.println("");

            System.out.print("Digite outro número: ");
            n2 = leitor.nextInt();
            System.out.println("");

            if (n1 > n2) {
                System.out.println("--------------------- RESULTADO --------------------");
                System.out.println("");

                System.out.println("Primeira entrada: " + n1);
                System.out.println("");

                System.out.println("Segunda entrada: " + n2);
                System.out.println("");

                System.out.println("Portanto, dentre os número digitados, o maior é: " + n1);
            } else {
                System.out.println("--------------------- RESULTADO --------------------");
                System.out.println("");

                System.out.println("Primeira entrada: " + n1);
                System.out.println("");

                System.out.println("Segunda entrada: " + n2);
                System.out.println("");

                System.out.println("Portanto, dentre os número digitados, o maior é: " + n2);
            }
        }
    }
}
