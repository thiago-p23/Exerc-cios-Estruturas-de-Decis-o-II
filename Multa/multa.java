import java.util.Locale;
import java.util.Scanner;

public class CalculoMulta {

    public static void main(String[] args) {
        // Padroniza a saída decimal com ponto (ou remova para usar vírgula conforme o sistema)
        Locale.setDefault(Locale.US);

        // Constantes definem as regras de fiscalização da via
        final int LIMITE_VELOCIDADE = 80;
        final double VALOR_POR_KM_EXCEDIDO = 50.00;

        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== RADAR DE VELOCIDADE ===");
            System.out.println("Limite permitido na via: " + LIMITE_VELOCIDADE + " Km/h\n");

            // 1. Leitura e validação da velocidade (protegido contra textos e valores negativos)
            int velocidade = -1;
            boolean entradaValida = false;

            do {
                System.out.print("Digite a velocidade registrada (em Km/h): ");

                if (scanner.hasNextInt()) {
                    velocidade = scanner.nextInt();

                    if (velocidade >= 0) {
                        entradaValida = true;
                    } else {
                        System.out.println("Erro: A velocidade não pode ser negativa. Tente novamente.\n");
                    }
                } else {
                    System.out.println("Erro: Digite apenas números inteiros (ex: 95).\n");
                    scanner.next(); // Descarta a entrada inválida do buffer
                }
            } while (!entradaValida);

            // 2. Verificação de infração e exibição do resultado
            System.out.println("\n--- RESULTADO DA FISCALIZAÇÃO ---");
            System.out.println("Velocidade registrada: " + velocidade + " Km/h");
            System.out.println("Limite da via:         " + LIMITE_VELOCIDADE + " Km/h");

            if (velocidade > LIMITE_VELOCIDADE) {
                int kmExcedidos = velocidade - LIMITE_VELOCIDADE;
                double valorMulta = kmExcedidos * VALOR_POR_KM_EXCEDIDO;

                System.out.println("Status:                INFRATOR (Acima do limite)");
                System.out.println("Excesso registrado:    " + kmExcedidos + " Km/h");
                System.out.printf("Cálculo:               %d Km/h x R$ %.2f%n", kmExcedidos, VALOR_POR_KM_EXCEDIDO);
                System.out.printf("Valor da multa:        R$ %.2f%n", valorMulta);
            } else {
                System.out.println("Status:                REGULAR (Dentro do limite)");
                System.out.println("Você está dentro do limite permitido. Sem multa!");
            }
        }
    }
}
