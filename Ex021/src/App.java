
// Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            char sexo;
            int idade, aptos = 0, inaptos = 0;
            boolean saude;
            char condicao;

            do {
                System.out.print("Digite o nome: ");
                nome = scan.nextLine();

                System.out.print("Digite o sexo (M) - (F) - (O): ");
                sexo = scan.next().charAt(0);

                System.out.print("Digite a idade: ");
                idade = scan.nextInt();

                System.out.print("Digite a saúde (True) ou (False): ");
                saude = scan.nextBoolean();

                Pessoa milico = new Pessoa(nome, sexo, idade, saude);

                if (milico.verificarAptidao()) {
                    System.out.println("");
                    System.out.println("Parabéns, " + milico.getNome() + "! Você está apto à roçar mato.");
                    aptos++;

                } else {
                    if (milico.getIdade() < 18 && !milico.getSaude()) {
                        System.out.println("");
                        System.out.println("Desculpa, " + milico.getNome() + "! Você além de ser muito novo, não tem saúde.");

                    } else if (milico.getIdade() < 18 && milico.getSaude()) {
                        System.out.println("");
                        System.out.println("Desculpa, " + milico.getNome() + "! Você é muito novo para pintar meio-fio.");

                    } else {
                        System.out.println("");
                        System.out.println("Desculpa, " + milico.getNome() + "! Você não tem saúde para matar mosquito da dengue.");
                    }
                    inaptos++;
                }

                System.out.println("");
                System.out.println("Total de aptos: " + aptos);
                System.out.println("Total de inaptos: " + inaptos);
                System.out.println("");

                System.out.println("Novo alistamento: (S) - SIM | (Qualquer tecla) - NÃO ");
                condicao = scan.next().charAt(0);
                scan.nextLine();

                System.out.println("");

            } while (condicao == 's' || condicao == 'S');

            scan.close();
        }
    }

}
