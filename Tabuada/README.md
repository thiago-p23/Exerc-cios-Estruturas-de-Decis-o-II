# Gerador de Tabuada

Aplicação de console desenvolvida em Java para gerar e exibir a tabuada de multiplicação de um número inteiro informado pelo usuário, abrangendo o intervalo padrão de `1` a `10` com formatação alinhada.

## Funcionalidades

* **Intervalo configurável por constantes:** Define os limites inicial (`INICIO = 1`) e final (`FIM = 10`) da tabuada por meio de constantes (`final`), facilitando ajustes futuros na extensão da tabela.
* **Suporte a qualquer número inteiro:** Calcula tabuadas de números positivos, negativos ou zero.
* **Proteção contra entradas inválidas:** Utiliza verificação prévia de buffer (`hasNextInt()`) e laço de repetição (`do-while`) para impedir falhas (`InputMismatchException`) caso o usuário digite caracteres não numéricos.
* **Alinhamento visual tabular:** Emprega especificadores de largura na saída formatada (`%2d`) para manter os multiplicadores de um e dois dígitos alinhados em coluna.

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 8 ou superior.

## Como Executar

1. Salve o código-fonte em um arquivo chamado `Tabuada.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac Tabuada.java
   ```
4. Execute a aplicação:
   ```bash
   java Tabuada
   ```

## Exemplo de Uso

```text
******************************
      GERADOR DE TABUADA      
******************************
Informe o número inteiro da tabuada: 7

******************************
Tabuada do 7:
******************************
 1 x 7 = 7
 2 x 7 = 14
 3 x 7 = 21
 4 x 7 = 28
 5 x 7 = 35
 6 x 7 = 42
 7 x 7 = 49
 8 x 7 = 56
 9 x 7 = 63
10 x 7 = 70
******************************
```

## Estrutura Técnica

* **`java.util.Scanner` e `try-with-resources`:** Leitura segura de dados inteiros via terminal com encerramento automático do recurso ao final da execução.
* **Laço de repetição `for`:** Percorre sequencialmente os multiplicadores de `INICIO` até `FIM`, calculando e exibindo cada linha da operação.
* **Saída formatada (`System.out.printf`):** Utiliza o marcador `%2d` para reservar dois espaços de largura ao multiplicador e `%n` para quebra de linha independente de sistema operacional.
