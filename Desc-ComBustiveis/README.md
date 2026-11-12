# Calculadora de Desconto de Combustível

Aplicação de console desenvolvida em Java para calcular o valor final de abastecimentos com base no tipo de combustível escolhido e no volume em litros, aplicando descontos progressivos conforme a quantidade abastecida.

## Funcionalidades

* **Tabela de preços fixa:** Utiliza constantes (`final`) para definir os valores por litro de álcool e gasolina, facilitando manutenções futuras.
* **Desconto progressivo por volume:** Aplica percentuais distintos para abastecimentos de até 20 litros e acima de 20 litros.
* **Validação de tipo de combustível:** Garante que apenas as opções válidas (`A` ou `G`, independentemente de maiúsculas ou minúsculas) sejam aceitas.
* **Proteção contra entradas inválidas:** Verifica previamente o buffer de entrada (`hasNextDouble`) para impedir falhas (`InputMismatchException`) caso o usuário digite caracteres não numéricos, além de bloquear quantidades negativas ou iguais a zero.
* **Relatório detalhado:** Exibe o combustível selecionado, a litragem, o valor bruto, o desconto aplicado e o total líquido formatados em duas casas decimais.

## Regras de Preços e Descontos

| Combustível | Código | Preço por Litro | Desconto (até 20 L) | Desconto (acima de 20 L) |
| :--- | :--- | :--- | :--- | :--- |
| Álcool | `A` | R$ 2,89 | 3% | 5% |
| Gasolina | `G` | R$ 4,95 | 4% | 6% |

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 8 ou superior.

## Como Executar

1. Salve o código-fonte em um arquivo chamado `DescontoCombustivel.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac DescontoCombustivel.java
