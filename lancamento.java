void main() throws InterruptedException {

    // Contagem regressiva com delay
    for (int i = 10; i >= 0; i--) {
        IO.println(i);
        Thread.sleep(1000);
    }
    IO.println("Ignição!");
}
