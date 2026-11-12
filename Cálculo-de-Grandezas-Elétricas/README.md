# Calculadora de Grandezas Elétricas

Aplicação de console desenvolvida em Java para calcular as três grandezas fundamentais da Primeira Lei de Ohm — Tensão, Resistência e Corrente Elétrica — por meio de um menu interativo contínuo e validação de entradas.

## Funcionalidades

* **Cálculo das grandezas da Lei de Ohm:** Permite calcular Tensão (`U`), Resistência (`R`) ou Corrente (`I`) a partir das outras duas variáveis informadas.
* **Menu interativo contínuo:** Utiliza um laço `do-while` para manter a aplicação em execução após cada cálculo, encerrando apenas quando o usuário seleciona a opção de saída.
* **Prevenção contra divisão por zero:** Bloqueia valores iguais a zero quando utilizados como denominadores nos cálculos de Resistência e Corrente.
* **Validação física e de entrada:** Impede valores negativos para resistência elétrica e verifica previamente o buffer (`hasNextDouble` e `hasNextInt`) para evitar falhas (`InputMismatchException`) caso caracteres não numéricos sejam inseridos.
* **Saída padronizada:** Exibe os resultados formatados em duas casas decimais acompanhados de suas respectivas unidades de medida (`V`, `Ohm` e `A`).

## Fórmulas Utilizadas

| Opção | Grandeza | Fórmula | Unidade de Medida |
| :--- | :--- | :--- | :--- |
| `1` | Tensão (`U`) | $U = R \times I$ | Volt (`V`) |
| `2` | Resistência (`R`) | $R = \frac{U}{I}$ | Ohm (`Ohm`) |
| `3` | Corrente (`I`) | $I = \frac{U}{R}$ | Ampère (`A`) |

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 14 ou superior (necessário para o suporte a *Switch Expressions*).

## Como Executar

1. Salve o código-fonte em um arquivo chamado `CalculoGrandezasEletricas.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac CalculoGrandezasEletricas.java
