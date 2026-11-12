import java.util.Locale;
import java.util.Scanner;

public class CalculoViagem {

    public static void main(String[] args) {
        // Padroniza o ponto (.) como separador decimal na entrada de dados
        Locale.setDefault(Locale.US);

        // Constantes facilitam a manutenção caso as tarifas ou o limite de quilometragem mudem
        final double LIMITE_KM_CURTA = 200.0;
        final double TARIFA_CURTA = 0.50;
        final double TARIFA_LONGA = 0.45;

        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== CALCULADORA DE PASSAGENS ===");
            System.out.printf("Até %.0f Km: R$ %.2f/Km | Acima de %.0f Km: R$ %.2f/Km%n%n",
                    LIMITE_KM_CURTA, TARIFA_CURTA, LIMITE_KM_CURTA, TARIFA_LONGA);

            // 1. Leitura e validação da distância (protegido contra textos e valores <= 0)
            double distancia = 0;
            boolean entradaValida = false;

            do {
                System.out.print("Digite a distância da viagem em Km: ");

                if (scanner.hasNextDouble()) {
                    distancia = scanner.nextDouble();

                    if (distancia > 0) {
                        entradaValida = true;
                    } else {
                        System.out.println("Erro: A distância deve ser maior que zero.\n");
                    }
                } else {
                    System.out.println("Erro: Digite um valor numérico válido para a distância.\n");
                    scanner.next(); // Descarta a entrada inválida do buffer
                }
            } while (!entradaValida);

            // 2. Definição da tarifa por Km e cálculo do valor total
            double tarifaAplicada = (distancia <= LIMITE_KM_CURTA) ? TARIFA_CURTA : TARIFA_LONGA;
            String categoriaViagem = (distancia <= LIMITE_KM_CURTA) ? "Curta distância" : "Longa distância";
            double valorPassagem = distancia * tarifaAplicada;

            // 3. Exibição do resumo formatado
            System.out.println("\n--- RESUMO DA VIAGEM ---");
            System.out.println("Categoria:         " + categoriaViagem);
            System.out.printf("Distância:         %.2f Km%n", distancia);
            System.out.printf("Tarifa aplicada:   R$ %.2f/Km%n", tarifaAplicada);
            System.out.println("------------------------");
            System.out.printf("Valor da passagem: R$ %.2f%n", valorPassagem);
        }
    }
}
