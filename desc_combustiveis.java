void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Álcool - R$ 2.89 / Gasolina - R$ 4.95\n");

    // Entrada
    System.out.print("Digite o tipo de combustível (A - Álcool / G - Gasolina): ");
    char tipo = scanner.next().toUpperCase().charAt(0);

    System.out.print("Digite a quantidade de litros: ");
    double litros = scanner.nextDouble();

    double precoLitro = 0;
    double desconto = 0;

    // Verificação do tipo
    if (tipo == 'A') {
        precoLitro = 2.89;

        if (litros <= 20) {
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }

    } else if (tipo == 'G') {
        precoLitro = 4.95;

        if (litros <= 20) {
            desconto = 0.04;
        } else {
            desconto = 0.06;
        }

    } else {
        System.out.println("Tipo de combustível inválido!");
        scanner.close();
        return;
    }

    // Cálculo
    double valorSemDesconto = litros * precoLitro;
    double valorDesconto = valorSemDesconto * desconto;
    double valorFinal = valorSemDesconto - valorDesconto;

    // Saída
    System.out.println("Valor sem desconto: R$ " + valorSemDesconto);
    System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
    System.out.println("Valor a pagar: R$ " + valorFinal);
}
