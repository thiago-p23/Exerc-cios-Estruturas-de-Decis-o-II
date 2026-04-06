void main() {

    Scanner scanner = new Scanner(System.in);

    // Entrada do valor da compra
    System.out.print("Digite o valor total da compra: R$ ");
    double valor = scanner.nextDouble();

    // Menu de pagamento
    System.out.println("Escolha a forma de pagamento:");
    System.out.println("1 - À vista (em espécie) - 10% de desconto");
    System.out.println("2 - Cartão de débito - 5% de desconto");
    System.out.println("3 - Cartão de crédito - 3% de desconto");
    System.out.println("4 - PIX - 7.5% de desconto");
    System.out.print("Opção: ");

    int opcao = scanner.nextInt();

    double desconto = 0;
    double valorFinal;

    // Verificação da opção
    switch (opcao) {
        case 1:
            desconto = 0.10;
            break;
            case 2:
                desconto = 0.05;
                break;
            case 3:
                desconto = 0.03;
                break;
            case 4:
                desconto = 0.075;
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
    }

    // Cálculo do valor final
    valorFinal = valor - (valor * desconto);

    // Saída
    System.out.println("Valor original: R$ " + valor);
    System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
    System.out.println("Valor final a pagar: R$ " + valorFinal);
}