import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salarioMinimo, salario, aumento, novoSalario;
        String nome;
        int totalFuncionarios = 584;
        float totalAumento = 0;
        float novaFolha = 0;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = leitor.nextFloat();

        for (int i = 1; i <= totalFuncionarios; i++) {
            System.out.print("\nDigite o nome do funcionário " + i + ": ");
            nome = leitor.next();

            System.out.print("Digite o salário do funcionário " + i + ": ");
            salario = leitor.nextFloat();

            if (salario < (3 * salarioMinimo)) {
                aumento = salario * 0.5f;
            } else if (salario >= (3 * salarioMinimo) && salario <= (10 * salarioMinimo)) {
                aumento = salario * 0.2f;
            } else if (salario > (10 * salarioMinimo) && salario <= (20 * salarioMinimo)) {
                aumento = salario * 0.15f;
            } else {
                aumento = salario * 0.1f;
            }

            novoSalario = salario + aumento;
            totalAumento += aumento;
            novaFolha += novoSalario;

            System.out.println("\nFuncionário: " + nome);
            System.out.println("Aumento: R$ " + aumento);
            System.out.println("Novo salário: R$ " + novoSalario);
        }

        System.out.println("\nTotal de aumento: R$ " + totalAumento);
        System.out.println("Nova folha de pagamento: R$ " + novaFolha);
    }
}