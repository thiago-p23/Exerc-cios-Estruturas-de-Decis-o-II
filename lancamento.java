void main() throws InterruptedException {

    // Contagem regressiva com delay
    for (int i = 10; i >= 0; i--) {
        System.out.println(i);
        Thread.sleep(1000);
    }
    System.out.println("Ignição!");
}