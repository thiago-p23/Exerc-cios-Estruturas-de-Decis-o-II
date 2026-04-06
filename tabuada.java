void main() {

    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("******************************");
    System.out.print("Informe o número da tabuada: ");
    int numero = scanner.nextInt();
    System.out.println("******************************");

    // Tabuada de 1 a 10
    for (int i = 1; i <= 10; i++) {
        System.out.println(i + " x " + numero + " = " + (i * numero));
    }
}