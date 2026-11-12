import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        // Constantes definem o intervalo padrão da tabuada
        final int INICIO = 1;
        final int FIM = 10;

        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("******************************");
            System.out.println("      GERADOR DE TABUADA      ");
            System.out.println("******************************");

            // 1. Leitura e validação da entrada (protegido contra textos e letras)
            int numero = 0;
            boolean entradaValida = false;

            do {
                System.out.print("Informe o número inteiro da tabuada: ");

                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                    entradaValida = true; // Aceita positivos, negativos e zero
                } else {
                    System.out.println("Erro: Digite apenas um número inteiro válido (ex: 7).\n");
                    scanner.next(); // Descarta a entrada inválida do buffer
                }
            } while (!entradaValida);

            // 2. Exibição da tabuada formatada
            System.out.println("\n******************************");
            System.out.println("Tabuada do " + numero + ":");
            System.out.println("******************************");

            for (int i = INICIO; i <= FIM; i++) {
                // %2d reserva 2 espaços para o multiplicador, mantendo o '10' alinhado
                System.out.printf("%2d x %d = %d%n", i, numero, (i * numero));
            }

            System.out.println("******************************");
        }
    }
}
