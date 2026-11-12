# Validador de Número Inteiro

Aplicação de console desenvolvida em Java para ler entradas textuais do usuário e validar sua conversão segura para números inteiros (`int`), evitando falhas de execução e problemas de buffer no terminal.

## Funcionalidades

* **Leitura baseada em linha completa:** Captura a entrada como `String` via `nextLine()`, eliminando resíduos de quebra de linha no buffer do `Scanner`.
* **Normalização de espaços:** Utiliza `trim()` antes da conversão para ignorar espaços em branco acidentais nas extremidades do valor digitado.
* **Bloqueio de campos vazios:** Verifica previamente se a entrada está vazia (`isEmpty()`) antes de tentar o processamento numérico.
* **Tratamento seguro de exceções:** Emprega `Integer.parseInt()` dentro de um bloco `try-catch` (`NumberFormatException`) para rejeitar letras, símbolos, números decimais ou valores fora do intervalo de 32 bits (`Integer.MIN_VALUE` a `Integer.MAX_VALUE`).
* **Persistência na solicitação:** Mantém um laço `while` ativo até que um valor inteiro válido seja informado, encapsulado no método reutilizável `lerInteiro`.

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 8 ou superior.

## Como Executar

1. Salve o código-fonte em um arquivo chamado `ValidaInteiro.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac ValidaInteiro.java
   ```
4. Execute a aplicação:
   ```bash
   java ValidaInteiro
   ```

## Exemplo de Uso

```text
=== VALIDADOR DE NÚMERO INTEIRO ===
Digite um número inteiro: 
Erro: Dado inválido. O campo não pode ficar vazio.

Digite um número inteiro: abc
Erro: Dado inválido. Digite apenas um número inteiro entre -2147483648 e 2147483647.

Digite um número inteiro:   42  

Entrada confirmada!
Você digitou o número inteiro: 42
```

## Estrutura Técnica

* **`java.util.Scanner` e `try-with-resources`:** Leitura segura de dados via terminal com encerramento automático do recurso ao final da execução.
* **`Integer.parseInt(String s)`:** Realiza a análise sintática (*parsing*) da `String` normalizada para o tipo primitivo `int`.
* **Modularização (`lerInteiro`):** Isola a lógica de validação em um método estático reutilizável em outras aplicações de console.
