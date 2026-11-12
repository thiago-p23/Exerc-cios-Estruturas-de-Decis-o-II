// Programa: numeros_pares
// Objetivo: Exibir todos os números pares positivos de 2 até 100 no console.

void main() {
    // Constantes facilitam alterar o intervalo da contagem sem mexer na lógica do laço
    final int INICIO = 2;
    final int LIMITE = 100;
    final int PASSO = 2;

    IO.println("=== NÚMEROS PARES DE " + INICIO + " A " + LIMITE + " ===");

    // Laço 'for' otimizado:
    // Inicia em 2 e incrementa de 2 em 2 (i += 2), evitando verificações desnecessárias
    for (int i = INICIO; i <= LIMITE; i += PASSO) {
        IO.println(i);
    }
}
