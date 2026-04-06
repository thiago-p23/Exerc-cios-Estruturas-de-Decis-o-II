void main() {

    Scanner scanner = new Scanner(System.in);

    int opcao;

    System.out.println("******************************");
    System.out.println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
    System.out.println("******************************");
    System.out.println("1. Tensão (em Volt)");
    System.out.println("2. Resistência (em Ohm)");
    System.out.println("3. Corrente (em Ampére)");
    System.out.println("4. Sair do programa");
    System.out.println("******************************");
    System.out.print("Qual grandeza deseja calcular? ");

    opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            // Tensão: U = R * I
            System.out.print("Informe a Resistência (Ohm): ");
            double R1 = scanner.nextDouble();

            System.out.print("Informe a Corrente (Ampére): ");
            double I1 = scanner.nextDouble();

            double U = R1 * I1;

            System.out.println("Tensão (U) = " + U + " V");
            break;

        case 2:// Resistência: R = U / I
            System.out.print("Informe a Tensão (Volt): ");
            double U2 = scanner.nextDouble();

            System.out.print("Informe a Corrente (Ampére): ");
            double I2 = scanner.nextDouble();

            if (I2 != 0) {
                double R = U2 / I2;
                System.out.println("Resistência (R) = " + R + " Ohm");
            } else {
                System.out.println("Erro: divisão por zero!");
            }
            break;

        case 3:
            // Corrente: I = U / R
            System.out.print("Informe a Tensão (Volt): ");
            double U3 = scanner.nextDouble();

            System.out.print("Informe a Resistência (Ohm): ");
            double R3 = scanner.nextDouble();

            if (R3 != 0) {
                double I = U3 / R3;
                System.out.println("Corrente (I) = " + I + " A");
            } else {
                System.out.println("Erro: divisão por zero!");
            }
            break;

        case 4:
            System.out.println("Encerrando o programa...");
            break;

        default:
            System.out.println("Opção inválida!");
    }
}
