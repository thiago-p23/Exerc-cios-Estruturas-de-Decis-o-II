void main() {

    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.print("Digite uma string: ");
    String texto = scanner.nextLine();

    // Validação
    if (texto.trim().isEmpty()) {
        System.out.println("Dado inválido");
    } else {
        System.out.println("Você digitou: " + texto);
    }
}
