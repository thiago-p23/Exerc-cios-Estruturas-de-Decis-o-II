import java.util.Locale;
import java.util.Scanner;

public class DescontoCombustivel {

    public static void main(String[] args) {
        // Padroniza o ponto (.) como separador decimal na entrada de dados
        Locale.setDefault(Locale.US);

        // Constantes facilitam a manutenção caso os preços sejam reajustados
        final double PRECO_ALCOOL = 2.89;
        final double PRECO_GASOLINA = 4.95;

        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== POSTO DE COMBUSTÍVEIS ===");
            System.out.printf("Álcool: R$ %.2f/L | Gasolina: R$ %.2f/L%n%n", PRECO_ALCOOL, PRECO_GASOLINA);

            // 1. Leitura e validação do tipo de combustível
            char tipo;
            do {
                System.out.print("Digite o tipo de combustível (A - Álcool / G - Gasolina): ");
                // Lê a primeira letra digitada e converte para maiúscula
                tipo = scanner.next().toUpperCase().charAt(0);

                if (tipo != 'A' && tipo != 'G') {
                    System.out.println("Erro: Opção inválida! Digite apenas A ou G.\n");
                }
            } while (tipo != 'A' && tipo != 'G');

            // 2. Leitura e validação da quantidade de litros (protegido contra textos)
            double litros = 0;
            boolean litrosValidos = false;

            do {
                System.out.print("Digite a quantidade de litros: ");

                if (scanner.hasNextDouble()) {
                    litros = scanner.nextDouble();

                    if (litros > 0) {
                        litrosValidos = true;
                    } else {
                        System.out.println("Erro: A quantidade de litros deve ser maior que zero.\n");
                    }
                } else {
                    System.out.println("Erro: Digite um valor numérico válido para os litros.\n");
                    scanner.next(); // Descarta a entrada inválida do buffer
                }
            } while (!litrosValidos);

            // 3. Definição de preço, nome e regra de desconto
            String nomeCombustivel;
            double precoLitro;
            double percentualDesconto;

            if (tipo == 'A') {
                nomeCombustivel = "Álcool";
                precoLitro = PRECO_ALCOOL;
                // Operador ternário: até 20L aplica 3%, acima de 20L aplica 5%
                percentualDesconto = (litros <= 20) ? 0.03 : 0.05;
            } else {
                nomeCombustivel = "Gasolina";
                precoLitro = PRECO_GASOLINA;
                // Operador ternário: até 20L aplica 4%, acima de 20L aplica 6%
                percentualDesconto = (litros <= 20) ? 0.04 : 0.06;
            }

            // 4. Cálculos financeiros
            double valorSemDesconto = litros * precoLitro;
            double valorDesconto = valorSemDesconto * percentualDesconto;
            double valorFinal = valorSemDesconto - valorDesconto;

            // 5. Exibição do recibo formatado
            System.out.println("\n--- RESUMO DO ABASTECIMENTO ---");
            System.out.println("Combustível:        " + nomeCombustivel);
            System.out.printf("Quantidade:         %.2f L%n", litros);
            System.out.printf("Valor sem desconto: R$ %.2f%n", valorSemDesconto);
            System.out.printf("Desconto (%.0f%%):      - R$ %.2f%n", (percentualDesconto * 100), valorDesconto);
            System.out.println("-------------------------------");
            System.out.printf("Valor a pagar:      R$ %.2f%n", valorFinal);
        }
    }
}
