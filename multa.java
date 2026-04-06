void main() {

    Scanner scanner = new Scanner(System.in);

    // Limite de velocidade
    int limite = 80;

    // Entrada de dados
    System.out.print("Digite a velocidade em Km/h: ");
    int velocidade = scanner.nextInt();

    System.out.println("Limite = " + limite + "Km/h");

    // Verificação
    if (velocidade > limite) {
        int excedeu = velocidade - limite;
        int multa = excedeu * 50;

        System.out.println("Excedeu " + excedeu + "Km/h");
        System.out.println("Multa = " + excedeu + "Km/h * R$ 50,00");
        System.out.println("Valor da multa: R$ " + multa + ",00");
    } else {
        System.out.println("Você está dentro do limite. Sem multa 👍");
    }
}