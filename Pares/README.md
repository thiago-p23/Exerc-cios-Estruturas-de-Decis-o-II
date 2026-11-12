# Contagem de Números Pares

Aplicação de console desenvolvida em Java para exibir a sequência de todos os números pares positivos de `2` a `100`, demonstrando o uso otimizado de estruturas de repetição com incremento personalizado.

## Funcionalidades

* **Iteração otimizada:** Percorre diretamente os números pares utilizando incremento de 2 em 2 (`i += 2`), reduzindo o número de ciclos à metade em comparação com verificações condicionais de resto (`%`).
* **Intervalo configurável por constantes:** Define os valores de início (`INICIO = 2`), limite (`LIMITE = 100`) e passo (`PASSO = 2`) por meio de constantes (`final`), facilitando alterações futuras no intervalo exibido.
* **Sintaxe simplificada:** Utiliza recursos modernos do Java (*Compact Source Files* e `java.lang.IO`), dispensando a declaração explícita de classes.

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 25 ou superior (ou JDK 21/23/24 com `--enable-preview` habilitado).

## Como Executar

1. Salve o código-fonte em um arquivo chamado `numeros_pares.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Execute o arquivo diretamente:
   ```bash
   java numeros_pares.java
   ```

## Exemplo de Saída

```text
=== NÚMEROS PARES DE 2 A 100 ===
2
4
6
8
...
96
98
100
```

## Estrutura Técnica

* **Laço `for` com passo customizado:** Controla a sequência iniciando em `INICIO`, verificando a condição `i <= LIMITE` e somando `PASSO` (`i += PASSO`) a cada iteração.
* **`IO.println()`:** Método nativo introduzido nas versões recentes do Java para simplificar a saída de dados no terminal.
