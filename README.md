# Repositório de Estudos em Java (Console)

Coleção de aplicações de console desenvolvidas em Java com foco em lógica de programação, estruturas de controle, validação de entradas, modularização e boas práticas de desenvolvimento.

---

## Índice de Projetos

1. [Calculadora de Desconto (Black Friday)](#1-calculadora-de-desconto-black-friday)
2. [Sequência de Cinco Números](#2-sequência-de-cinco-números)
3. [Calculadora de Desconto de Combustível](#3-calculadora-de-desconto-de-combustível)
4. [Sistema de Autenticação de Dois Usuários](#4-sistema-de-autenticação-de-dois-usuários)
5. [Calculadora de Grandezas Elétricas (Lei de Ohm)](#5-calculadora-de-grandezas-elétricas-lei-de-ohm)
6. [Contagem Regressiva de Lançamento](#6-contagem-regressiva-de-lançamento)
7. [Calculadora de Multa de Velocidade](#7-calculadora-de-multa-de-velocidade)
8. [Contagem de Números Pares](#8-contagem-de-números-pares)
9. [Gerador de Tabuada](#9-gerador-de-tabuada)
10. [Validador de Número Inteiro](#10-validador-de-número-inteiro)
11. [Validador de String](#11-validador-de-string)
12. [Calculadora de Passagem de Viagem](#12-calculadora-de-passagem-de-viagem)

---

## Detalhamento dos Projetos e Métodos Utilizados

### 1. Calculadora de Desconto (Black Friday)
* **Objetivo:** Calcular o valor final de um produto após a aplicação de um percentual de desconto promocional.
* **Métodos e Estruturas Utilizadas:**
  * `Scanner.hasNextDouble()` e `Scanner.nextDouble()`: Garantem que o preço e a porcentagem informados sejam valores numéricos válidos antes da leitura.
  * `System.out.printf()`: Formata os valores monetários com duas casas decimais (`%.2f`), exibindo o valor original, o desconto obtido e o preço final.
  * Constantes (`final`): Definem limites percentuais (0% a 100%) para evitar cálculos inconsistentes.

### 2. Sequência de Cinco Números
* **Objetivo:** Exibir uma sequência numérica controlada de 5 elementos no console.
* **Métodos e Estruturas Utilizadas:**
  * Laço `for` com limites definidos por constantes (`INICIO` e `LIMITE`): Controla a quantidade exata de iterações sem uso de valores soltos no código.
  * `IO.println()` / `System.out.println()`: Realiza a saída sequencial de cada número da contagem.

### 3. Calculadora de Desconto de Combustível
* **Objetivo:** Calcular o valor a ser pago no abastecimento de Álcool ou Gasolina, aplicando descontos progressivos conforme o tipo de combustível e a litragem.
* **Métodos e Estruturas Utilizadas:**
  * `String.equalsIgnoreCase()` / `Character.toUpperCase()`: Normalizam a escolha do tipo de combustível (`A` ou `G`), aceitando entradas em maiúsculo ou minúsculo.
  * Estruturas condicionais aninhadas (`if-else`): Avaliam primeiramente o tipo de combustível e, em seguida, a faixa de litragem para aplicar a alíquota correta de desconto.
  * `Scanner.hasNextDouble()`: Impede erros de execução caso a quantidade de litros seja inválida ou negativa.

### 4. Sistema de Autenticação de Dois Usuários
* **Objetivo:** Validar credenciais de acesso (usuário e senha) comparando-as com dois perfis cadastrados.
* **Métodos e Estruturas Utilizadas:**
  * `Scanner.nextLine()` e `String.trim()`: Capturam o login e a senha removendo espaços acidentais nas extremidades.
  * `String.equals()` e `String.equalsIgnoreCase()`: Realizam a comparação segura entre strings (diferenciando maiúsculas e minúsculas na senha, mas ignorando no nome de usuário).
  * Operadores lógicos (`&&` e `||`): Combinam as condições de autenticação para validar se as credenciais pertencem ao primeiro ou ao segundo usuário autorizado.

### 5. Calculadora de Grandezas Elétricas (Lei de Ohm)
* **Objetivo:** Calcular Tensão ($U$), Resistência ($R$) ou Corrente ($I$) por meio de um menu interativo contínuo.
* **Métodos e Estruturas Utilizadas:**
  * `lerInteiro(Scanner, String)`: Método auxiliar que valida a opção escolhida no menu via `hasNextInt()`.
  * `lerDouble(Scanner, String)`: Método auxiliar genérico para leitura de números decimais.
  * `lerDoubleDiferenteDeZero(Scanner, String)`: Impede divisão por zero ao calcular Resistência ($R = U / I$) ou Corrente ($I = U / R$).
  * `lerDoublePositivo(Scanner, String, boolean)`: Garante restrições físicas, impedindo valores negativos para a resistência elétrica.
  * *Switch Expressions* (`case ->`) e laço `do-while`: Mantêm o menu ativo até que a opção de encerramento seja selecionada.

### 6. Contagem Regressiva de Lançamento
* **Objetivo:** Simular a contagem regressiva de um lançamento espacial em tempo real.
* **Métodos e Estruturas Utilizadas:**
  * Laço `for` regressivo (`i--`): Decrementa o contador segundo a segundo a partir da constante `SEGUNDOS_INICIAIS` até zero.
  * `Thread.sleep(long millis)`: Suspende temporariamente a execução da thread principal por 1000 milissegundos (1 segundo) a cada passo.
  * `throws InterruptedException`: Propaga a exceção verificada exigida pelo controle de temporização da JVM.

### 7. Calculadora de Multa de Velocidade
* **Objetivo:** Verificar se um veículo excedeu o limite da via (`80 Km/h`) e calcular a multa proporcional (`R$ 50,00` por Km/h excedido).
* **Métodos e Estruturas Utilizadas:**
  * Constantes (`LIMITE_VELOCIDADE` e `VALOR_POR_KM_EXCEDIDO`): Isolam as regras de negócio da lógica condicional.
  * `Scanner.hasNextInt()` com laço `do-while`: Bloqueia entradas não numéricas e velocidades negativas.
  * Estrutura `if-else` e `System.out.printf()`: Separam o fluxo entre condutor regular e infrator, detalhando o cálculo da penalidade.

### 8. Contagem de Números Pares
* **Objetivo:** Exibir todos os números pares positivos de `2` até `100`.
* **Métodos e Estruturas Utilizadas:**
  * Laço `for` com passo customizado (`i += PASSO`): Incrementa a variável de controle de 2 em 2, reduzindo o número de iterações à metade e dispensando testes condicionais de resto (`% 2 == 0`).

### 9. Gerador de Tabuada
* **Objetivo:** Exibir a tabuada de multiplicação (de `1` a `10`) de qualquer número inteiro informado pelo usuário.
* **Métodos e Estruturas Utilizadas:**
  * `Scanner.hasNextInt()`: Valida se o multiplicando digitado é um número inteiro válido (aceitando positivos, negativos e zero).
  * `System.out.printf("%2d x %d = %d%n", ...)`: Utiliza especificadores de largura (`%2d`) para alinhar visualmente os números de um e dois dígitos em colunas.

### 10. Validador de Número Inteiro
* **Objetivo:** Ler uma entrada textual e garantir sua conversão segura para o tipo primitivo `int`.
* **Métodos e Estruturas Utilizadas:**
  * `lerInteiro(Scanner, String)`: Método reutilizável que captura a linha inteira com `Scanner.nextLine()` e limpa espaços com `String.trim()`.
  * `String.isEmpty()`: Rejeita entradas em branco antes da tentativa de conversão.
  * `Integer.parseInt(String)` dentro de bloco `try-catch (NumberFormatException)`: Converte o texto em inteiro de 32 bits e captura falhas caso haja letras, decimais ou estouro de limite (`Integer.MIN_VALUE` a `Integer.MAX_VALUE`).

### 11. Validador de String
* **Objetivo:** Validar entradas textuais no console, impedindo campos vazios ou compostos apenas por espaços.
* **Métodos e Estruturas Utilizadas:**
  * `lerString(Scanner, String)`: Método reutilizável que normaliza o texto com `Scanner.nextLine().trim()` e verifica o preenchimento com `String.isEmpty()`.
  * `String.length()`: Retorna e exibe a quantidade exata de caracteres válidos após a higienização da entrada.

### 12. Calculadora de Passagem de Viagem
* **Objetivo:** Calcular o preço de uma passagem aplicando tarifas diferentes para viagens de até `200 Km` (`R$ 0,50/Km`) e acima de `200 Km` (`R$ 0,45/Km`).
* **Métodos e Estruturas Utilizadas:**
  * `Scanner.hasNextDouble()`: Garante que a distância informada seja um número decimal estritamente maior que zero.
  * Operador ternário (`condicao ? valorVerdadeiro : valorFalso`): Seleciona de forma concisa a tarifa unitária e a categoria da viagem (`Curta distância` ou `Longa distância`).
  * `System.out.printf()`: Exibe o resumo completo da viagem com precisão de duas casas decimais.

---

## Padrões Técnicos Adotados no Repositório

* **Gerenciamento de Recursos (`try-with-resources`):** Todas as classes que utilizam `java.util.Scanner` instanciam o objeto dentro de blocos `try (...)`, garantindo o fechamento automático do fluxo de entrada ao término da execução.
* **Padronização Regional (`Locale.US`):** Aplicado nas aplicações com ponto flutuante para assegurar o uso consistente do ponto (`.`) como separador decimal.
* **Programação Defensiva:** Nenhuma leitura de dados confia diretamente na entrada do usuário; todas passam por validação de tipo (`hasNext*`) ou tratamento de exceções (`try-catch`) em laços de repetição até que um dado válido seja fornecido.
* **Legibilidade e Manutenibilidade:** Uso sistemático de constantes (`final`) para regras de negócio e extração de métodos auxiliares (`lerInteiro`, `lerDouble`, `lerString`) para evitar duplicação de código.

---

## Pré-requisitos e Execução

* **Java Development Kit (JDK):**
  * Versão **8 ou superior** para projetos estruturados com declaração explícita de classe (`public class NomeDaClasse`).
  * Versão **25 ou superior** (ou JDK 21+ com `--enable-preview`) para projetos que utilizam *Compact Source Files* (`void main()`) e `java.lang.IO`.

### Compilação e Execução Padrão

```bash
# Compilar o arquivo desejado
javac NomeDoArquivo.java

# Executar a classe compilada
java NomeDoArquivo
```

### Execução Direta (Compact Source Files - Java 25+)

```bash
java nome_do_arquivo.java
```
