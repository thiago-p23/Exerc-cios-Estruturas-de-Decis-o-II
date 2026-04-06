void main() {

    Scanner scanner = new Scanner(System.in);

    // Entrada de dados
    System.out.print("Digite a distância da viagem em Km: ");
    double distancia = scanner.nextDouble();

    double preco;

    // Verificação do valor por km
    if (distancia <= 200) {
        preco = distancia * 0.50;
    } else {
        preco = distancia * 0.45;
    }

    // Saída
    System.out.println("Distância: " + distancia + " Km");
    System.out.println("Valor da passagem: R$ " + preco);
}