import java.util.Locale;
import java.util.Scanner;

public class CalculadoraBlackFriday {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== PROMOÇÃO BLACK FRIDAY ===");

            // 1. Validação do valor da compra com laço do-while
            // Repete a pergunta enquanto o valor digitado for menor ou igual a zero
            double valorOriginal;
            do {
                System.out.print("Digite o valor total da compra: R$ ");
                valorOriginal = scanner.nextDouble();

                if (valorOriginal <= 0) {
                    System.out.println("Erro: O valor deve ser maior que zero. Tente novamente.\n");
                }
            } while (valorOriginal <= 0);

            // Variáveis que guardarão os dados da opção escolhida
            String formaPagamento = "";
            double percentualDesconto = 0;
            boolean opcaoValida;

            // 2. Menu com laço do-while
            // Continua exibindo o menu enquanto 'opcaoValida' for falso
            do {
                System.out.println("\nEscolha a forma de pagamento:");
                System.out.println("1 - À vista (em espécie) - 10% de desconto");
                System.out.println("2 - Cartão de débito     - 5% de desconto");
                System.out.println("3 - Cartão de crédito    - 3% de desconto");
                System.out.println("4 - PIX                  - 7.5% de desconto");
                System.out.print("Opção desejada: ");
                int opcao = scanner.nextInt();

                // Assume que a opção é válida; o 'default' muda para false se errar
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
                        System.out.println("Opção inválida! Digite um número entre 1 e 4.");
                        opcaoValida = false; // Força o laço a repetir
                    }
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
