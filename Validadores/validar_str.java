import java.util.Scanner;

public class ValidaString {

    public static void main(String[] args) {
        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== VALIDADOR DE STRING ===");

            // Chama o método de leitura validada
            String texto = lerString(scanner, "Digite uma string: ");

            System.out.println("\nEntrada confirmada!");
            System.out.println("Você digitou: \"" + texto + "\" (" + texto.length() + " caracteres)");
        }
    }

    /**
     * Lê uma linha do console e garante que o texto não esteja vazio
     * nem contenha apenas espaços em branco.
     */
    private static String lerString(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            // Lê a linha completa e remove espaços em branco nas extremidades
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println("Erro: Dado inválido. O texto não pode ficar vazio ou conter apenas espaços.\n");
            } else {
                return entrada;
            }
        }
    }
}
