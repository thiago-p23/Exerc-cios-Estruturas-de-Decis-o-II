import java.util.Locale;
import java.util.Scanner;

public class CalculoGrandezasEletricas {

    public static void main(String[] args) {
        // Padroniza o ponto (.) como separador decimal na entrada de dados
        Locale.setDefault(Locale.US);

        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            // Laço principal: mantém o menu ativo até o usuário escolher a opção 4 (Sair)
            do {
                System.out.println("\n************************************");
                System.out.println("  CÁLCULO DE GRANDEZAS ELÉTRICAS");
                System.out.println("************************************");
                System.out.println("1. Tensão (em Volt)");
                System.out.println("2. Resistência (em Ohm)");
                System.out.println("3. Corrente (em Ampère)");
                System.out.println("4. Sair do programa");
                System.out.println("************************************");

                // Lê a opção garantindo que seja um número inteiro
                opcao = lerInteiro(scanner, "Qual grandeza deseja calcular? ");

                switch (opcao) {
                    case 1 -> {
                        // Fórmula da Tensão: U = R * I
                        double resistencia = lerDoublePositivo(scanner, "Informe a Resistência (Ohm): ", true);
                        double corrente = lerDouble(scanner, "Informe a Corrente (Ampère): ");

                        double tensao = resistencia * corrente;
                        System.out.printf("Resultado -> Tensão (U) = %.2f V%n", tensao);
                    }
                    case 2 -> {
                        // Fórmula da Resistência: R = U / I
                        double tensao = lerDouble(scanner, "Informe a Tensão (Volt): ");
                        double corrente = lerDoubleDiferenteDeZero(scanner, "Informe a Corrente (Ampère): ");

                        double resistencia = tensao / corrente;
                        System.out.printf("Resultado -> Resistência (R) = %.2f Ohm%n", resistencia);
                    }
                    case 3 -> {
                        // Fórmula da Corrente: I = U / R
                        double tensao = lerDouble(scanner, "Informe a Tensão (Volt): ");
                        // Resistência não pode ser zero (divisão por zero) nem negativa
                        double resistencia = lerDoublePositivo(scanner, "Informe a Resistência (Ohm): ", false);

                        double corrente = tensao / resistencia;
                        System.out.printf("Resultado -> Corrente (I) = %.2f A%n", corrente);
                    }
                    case 4 -> System.out.println("Encerrando o programa... Até logo!");
                    default -> System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                }

            } while (opcao != 4);
        }
    }

    // Método auxiliar para ler qualquer número decimal (aceita positivos, negativos e zero)
    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Erro: Digite um valor numérico válido.");
            scanner.next(); // Descarta a entrada inválida do buffer
        }
    }

    // Método auxiliar para ler valores que não podem ser zero (evita divisão por zero)
    private static double lerDoubleDiferenteDeZero(Scanner scanner, String mensagem) {
        while (true) {
            double valor = lerDouble(scanner, mensagem);
            if (valor != 0) {
                return valor;
            }
            System.out.println("Erro: O valor não pode ser zero (divisão por zero).");
        }
    }

    // Método auxiliar para ler valores positivos (ex: resistência elétrica)
    private static double lerDoublePositivo(Scanner scanner, String mensagem, boolean permiteZero) {
        while (true) {
            double valor = lerDouble(scanner, mensagem);
            if (permiteZero ? valor >= 0 : valor > 0) {
                return valor;
            }
            System.out.println(permiteZero
                    ? "Erro: O valor não pode ser negativo."
                    : "Erro: O valor deve ser maior que zero.");
        }
    }

    // Método auxiliar para ler opções do menu como número inteiro
    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Erro: Digite apenas o número da opção (1 a 4).");
            scanner.next(); // Descarta a entrada inválida do buffer
        }
    }
}
