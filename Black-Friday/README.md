# Calculadora de Descontos - Black Friday

Aplicação de console desenvolvida em Java para calcular descontos promocionais de Black Friday com base na forma de pagamento escolhida pelo cliente. O projeto implementa validação de entradas, tratamento de exceções de digitação e formatação monetária.

## Funcionalidades

* **Cálculo automático de descontos:** Aplica percentuais distintos de acordo com a modalidade de pagamento selecionada.
* **Validação de valores:** Impede o processamento de valores negativos ou iguais a zero.
* **Proteção contra entradas inválidas:** Utiliza verificação prévia de buffer (`hasNextDouble` e `hasNextInt`) para evitar falhas (`InputMismatchException`) caso o usuário insira letras ou caracteres não numéricos.
* **Persistência de fluxo:** Mantém o menu ativo por meio de laços de repetição (`do-while`) até que uma opção válida seja informada.
* **Relatório detalhado:** Exibe o método de pagamento, o valor original, o montante economizado e o valor final formatados em duas casas decimais.

## Tabela de Descontos

| Código | Forma de Pagamento | Desconto Aplicado |
| :--- | :--- | :--- |
| `1` | À vista (em espécie) | 10,0% |
| `2` | Cartão de débito | 5,0% |
| `3` | Cartão de crédito | 3,0% |
| `4` | PIX | 7,5% |

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 14 ou superior (necessário para o suporte a *Switch Expressions*).

## Como Executar

1. Salve o código-fonte em um arquivo chamado `CalculadoraBlackFriday.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac CalculadoraBlackFriday.java
