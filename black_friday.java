import java.util.Locale;
import java.util.Scanner;

public class CalculadoraBlackFriday {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== PROMOÇÃO BLACK FRIDAY ===");

            // 1. Leitura e validação do valor da compra
            double valorOriginal = 0;
            boolean valorValido = false;

            do {
                System.out.print("Digite o valor total da compra: R$ ");

                // Verifica se o que foi digitado realmente pode ser lido como Double
                if (scanner.hasNextDouble()) {
                    valorOriginal = scanner.nextDouble();

                    if (valorOriginal > 0) {
                        valorValido = true; // Valor é número e é positivo
                    } else {
                        System.out.println("Erro: O valor deve ser maior que zero.\n");
                    }
                } else {
                    // Se digitou texto/letras, avisa e LIMPA o buffer do Scanner
                    System.out.println("Erro: Digite apenas números (ex: 150.50).\n");
                    scanner.next(); // Descarta a entrada inválida para não gerar loop infinito
                }
            } while (!valorValido);

            // 2. Leitura e validação do menu de pagamento
            String formaPagamento = "";
            double percentualDesconto = 0;
            boolean opcaoValida = false;

            do {
                System.out.println("\nEscolha a forma de pagamento:");
                System.out.println("1 - À vista (em espécie) - 10% de desconto");
                System.out.println("2 - Cartão de débito     - 5% de desconto");
                System.out.println("3 - Cartão de crédito    - 3% de desconto");
                System.out.println("4 - PIX                  - 7.5% de desconto");
                System.out.print("Opção desejada: ");

                // Verifica se o usuário digitou um número inteiro
                if (scanner.hasNextInt()) {
                    int opcao = scanner.nextInt();
                    opcaoValida = true;

                    switch (opcao) {
                        case 1 -> {
                            formaPagamento = "À vista (espécie)";
                            percentualDesconto = 0.10;
                        }
                        case 2 -> {
                            formaPagamento = "Cartão de débito";
                            percentualDesconto = 0.05;
                        }
                        case 3 -> {
                            formaPagamento = "Cartão de crédito";
                            percentualDesconto = 0.03;
                        }
                        case 4 -> {
                            formaPagamento = "PIX";
                            percentualDesconto = 0.075;
                        }
                        default -> {
                            System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                            opcaoValida = false;
                        }
                    }
                } else {
                    // Se digitou texto no menu, avisa e limpa a entrada inválida
                    System.out.println("Erro: Opção inválida! Digite apenas o número da opção (1 a 4).");
                    scanner.next(); // Descarta o texto digitado
                }
            } while (!opcaoValida);

            // 3. Cálculos financeiros
            double valorEconomizado = valorOriginal * percentualDesconto;
            double valorFinal = valorOriginal - valorEconomizado;

            // 4. Exibição do recibo formatado
            System.out.println("\n--- RESUMO DA COMPRA ---");
            System.out.println("Forma de pagamento: " + formaPagamento);
            System.out.printf("Valor original:     R$ %.2f%n", valorOriginal);
            System.out.printf("Desconto (%.1f%%):   - R$ %.2f%n", (percentualDesconto * 100), valorEconomizado);
            System.out.println("------------------------");
            System.out.printf("Valor final:        R$ %.2f%n", valorFinal);
        }
    }
}
