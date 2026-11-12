import java.util.Locale;
import java.util.Scanner;

public class CalculadoraBlackFriday {

    public static void main(String[] args) {
        // Define o padrão americano para aceitar ponto (.) como separador decimal,
        // ou remova esta linha se quiser usar vírgula (,) conforme o sistema operacional.
        Locale.setDefault(Locale.US);

        // O try-with-resources garante que o Scanner será fechado automaticamente ao final
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== PROMOÇÃO BLACK FRIDAY ===");
            System.out.print("Digite o valor total da compra: R$ ");
            double valorOriginal = scanner.nextDouble();

            // 1. Validação: impede valores negativos ou iguais a zero
            if (valorOriginal <= 0) {
                System.out.println("Erro: O valor da compra deve ser maior que zero.");
                return; // Encerra o programa antecipadamente
            }

            // 2. Exibição do menu de opções
            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1 - À vista (em espécie) - 10% de desconto");
            System.out.println("2 - Cartão de débito     - 5% de desconto");
            System.out.println("3 - Cartão de crédito    - 3% de desconto");
            System.out.println("4 - PIX                  - 7.5% de desconto");
            System.out.print("Opção desejada: ");
            int opcao = scanner.nextInt();

            // 3. Switch Expression (forma moderna e mais limpa de atribuir valores)
            // Também armazena o nome da forma de pagamento para exibir no recibo final
            String formaPagamento;
            double percentualDesconto;

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
                    System.out.println("\nOpção inválida! Reinicie o programa e escolha entre 1 e 4.");
                    return; // Encerra o programa caso a opção não exista
                }
            }

            // 4. Cálculos financeiros
            double valorEconomizado = valorOriginal * percentualDesconto;
            double valorFinal = valorOriginal - valorEconomizado;

            // 5. Saída formatada (printf com %.2f limita a 2 casas decimais)
            System.out.println("\n--- RESUMO DA COMPRA ---");
            System.out.println("Forma de pagamento: " + formaPagamento);
            System.out.printf("Valor original:     R$ %.2f%n", valorOriginal);
            System.out.printf("Desconto (%.1f%%):   - R$ %.2f%n", (percentualDesconto * 100), valorEconomizado);
            System.out.println("------------------------");
            System.out.printf("Valor final:        R$ %.2f%n", valorFinal);
        }
    }
}
