# Contagem Regressiva de Lançamento

Aplicação de console desenvolvida em Java para simular a sequência de contagem regressiva de um lançamento espacial, utilizando estruturas de repetição regressivas e controle de tempo de execução.

## Funcionalidades

* **Contagem regressiva configurável:** Executa uma contagem decrescente a partir de um valor inicial definido por constante (`SEGUNDOS_INICIAIS = 10`) até zero.
* **Temporização em tempo real:** Utiliza `Thread.sleep()` para pausar a execução por 1 segundo (`1000` milissegundos) entre cada etapa da contagem.
* **Transição imediata na ignição:** Exibe a mensagem final de lançamento no exato momento em que o contador atinge zero, evitando atrasos desnecessários ao término do ciclo.
* **Sintaxe simplificada:** Emprega recursos modernos do Java (*Compact Source Files* e `java.lang.IO`), dispensando a declaração explícita de classes.

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 25 ou superior (ou JDK 21/23/24 com `--enable-preview` habilitado).

## Como Executar

1. Salve o código-fonte em um arquivo chamado `lancamento.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Execute o arquivo diretamente:
   ```bash
   java lancamento.java
   ```

## Exemplo de Saída

```text
=== INICIANDO SEQUÊNCIA DE LANÇAMENTO ===
T-minus 10...
T-minus 9...
T-minus 8...
T-minus 7...
T-minus 6...
T-minus 5...
T-minus 4...
T-minus 3...
T-minus 2...
T-minus 1...
0 - Ignição! Lançamento realizado!
```

## Estrutura Técnica

* **Laço `for` regressivo:** Controla a contagem iniciando em `SEGUNDOS_INICIAIS`, verificando a condição `i >= 0` e decrementando a variável de controle (`i--`) a cada iteração.
* **`Thread.sleep(long millis)`:** Método da classe `java.lang.Thread` responsável por suspender temporariamente a execução da thread principal pelo intervalo especificado.
* **`throws InterruptedException`:** Declaração na assinatura do método `main` necessária para propagar a exceção verificada caso a thread seja interrompida durante o estado de espera.
* **`IO.println()`:** Método nativo utilizado para imprimir cada etapa da contagem no console.
