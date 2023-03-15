public class PositivoOuNegativo {
    public static int positivoNegativo(int entrada) {
        if (entrada > 0) {
            System.out.println("\nVocê digitou: " + entrada + ".");
            System.out.println("Esse número é positivo.");

        } else if (entrada == 0) {
            System.out.println("\nVocê digitou: " + entrada + ".");

        } else {
            System.out.println("\nVocê digitou: " + entrada + ".");
            System.out.println("Esse número é negativo.");
        }

        return entrada;
    }
}
