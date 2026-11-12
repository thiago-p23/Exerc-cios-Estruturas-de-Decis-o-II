// Programa: cinco_numeros
// Objetivo: Exibir uma contagem sequencial de 1 a 5 no console.

void main() {
    // Laço 'for' dividido em 3 partes:
    // 1. int i = 1  -> Inicializa a variável contadora em 1
    // 2. i <= 5     -> Condição de parada (executa enquanto 'i' for menor ou igual a 5)
    // 3. i++        -> Incrementa o valor de 'i' em +1 a cada repetição
    for (int i = 1; i <= 5; i++) {
        // Imprime o número atual no console
        IO.println(i);
    }
}
