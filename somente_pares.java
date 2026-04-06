void main() throws InterruptedException {

    //Contagem dos pares
    for (int i = 2; i <= 100; i += 2) {
        System.out.println(i);
        Thread.sleep(250);
    }
}