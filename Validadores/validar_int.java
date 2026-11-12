import java.util.Scanner;

public class ValidaInteiro {

    public static void main(String[] args) {
        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== VALIDADOR DE NÚMERO INTEIRO ===");

            // Chama o método de leitura validada
            int numero = lerInteiro(scanner, "Digite um número inteiro: ");

            System.out.println("\nEntrada confirmada!");
            System.out.println("Você digitou o número inteiro: " + numero);
        }
    }

    /**
     * Lê uma linha do console e garante que seja convertida com segurança para int.
     * Repete a solicitação até que o usuário forneça um valor válido.
     */
    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            // Lê a linha completa e remove espaços em branco nas extremidades
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println("Erro: Dado inválido. O campo não pode ficar vazio.\n");
                continue;
            }

            try {
                // Tenta converter o texto limpo para um inteiro de 32 bits
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Dado inválido. Digite apenas um número inteiro entre "
                        + Integer.MIN_VALUE + " e " + Integer.MAX_VALUE + ".\n");
            }
        }
    }
}
