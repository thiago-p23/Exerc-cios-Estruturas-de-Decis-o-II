// Programa: lancamento
// Objetivo: Simular a contagem regressiva de lançamento de um foguete com pausa de 1 segundo.

void main() throws InterruptedException {
    // Constantes facilitam ajustar o tempo da contagem ou a velocidade do cronômetro
    final int SEGUNDOS_INICIAIS = 10;
    final int INTERVALO_MS = 1000; // 1000 milissegundos = 1 segundo

    IO.println("=== INICIANDO SEQUÊNCIA DE LANÇAMENTO ===");

    // Laço regressivo: começa em 10 e decrementa (-1) até chegar a 0
    for (int i = SEGUNDOS_INICIAIS; i >= 0; i--) {
        if (i > 0) {
            IO.println("T-minus " + i + "...");
            // Pausa a execução da thread atual pelo tempo definido em milissegundos
            Thread.sleep(INTERVALO_MS);
        } else {
            // Quando chega a 0, exibe a mensagem final imediatamente
            IO.println("0 - Ignição! Lançamento realizado!");
        }
    }
}
