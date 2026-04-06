void main() {

    Scanner scanner = new Scanner(System.in);

    // Entrada como texto
    System.out.print("Digite um número inteiro: ");
    String entrada = scanner.nextLine();

    // Validação
    if (entrada.trim().isEmpty()) {
        System.out.println("Dado inválido");
    } else {
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Você digitou: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Dado inválido");
        }
    }
}
