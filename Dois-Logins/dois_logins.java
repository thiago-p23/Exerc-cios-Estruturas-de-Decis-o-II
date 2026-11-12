import java.util.Scanner;

public class DoisLogins {

    public static void main(String[] args) {
        // Credenciais válidas definidas como constantes
        final String USUARIO_1 = "atila";
        final String SENHA_1 = "12345";

        final String USUARIO_2 = "olivia";
        final String SENHA_2 = "54321";

        // Limite máximo de tentativas permitidas
        final int MAX_TENTATIVAS = 3;
        int tentativas = 0;
        boolean acessoPermitido = false;

        // O try-with-resources fecha o Scanner automaticamente ao final
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("=== SISTEMA DE ACESSO ===");

            // Laço que permite até 3 tentativas enquanto o acesso não for liberado
            while (tentativas < MAX_TENTATIVAS && !acessoPermitido) {
                System.out.print("\nDigite o usuário: ");
                // .trim() remove espaços em branco acidentais nas pontas
                String usuarioDigitado = scanner.nextLine().trim();

                System.out.print("Digite a senha: ");
                String senhaDigitada = scanner.nextLine();

                // Validação:
                // - Usuário ignora maiúsculas/minúsculas (equalsIgnoreCase)
                // - Senha exige correspondência exata (equals)
                boolean login1Valido = usuarioDigitado.equalsIgnoreCase(USUARIO_1) && senhaDigitada.equals(SENHA_1);
                boolean login2Valido = usuarioDigitado.equalsIgnoreCase(USUARIO_2) && senhaDigitada.equals(SENHA_2);

                if (login1Valido || login2Valido) {
                    acessoPermitido = true;
                    System.out.println("\nAcesso liberado! Seja bem-vindo(a), " + usuarioDigitado.toLowerCase() + "!");
                } else {
                    tentativas++;
                    int restantes = MAX_TENTATIVAS - tentativas;

                    System.out.println("Erro: Usuário e senha não conferem.");

                    if (restantes > 0) {
                        System.out.println("Tentativas restantes: " + restantes);
                    } else {
                        System.out.println("Número máximo de tentativas excedido. Acesso bloqueado.");
                    }
                }
            }
        }
    }
}
