# Calculadora de Passagem de Viagem

Aplicação de console desenvolvida em Java para calcular o valor total de uma passagem com base na distância percorrida em quilômetros, aplicando tarifas diferenciadas para viagens de curta e longa distância.

## Funcionalidades

* **Regras tarifárias configuráveis por constantes:** Define o limite de quilometragem (`200.0 Km`) e os valores cobrados por quilômetro (`R$ 0,50` e `R$ 0,45`) por meio de constantes (`final`), facilitando reajustes futuros.
* **Classificação automática de tarifa:** Avalia a distância informada para determinar a categoria da viagem e aplicar a tarifa correspondente por quilômetro.
* **Proteção contra entradas inválidas:** Utiliza verificação prévia de buffer (`hasNextDouble()`) e laço de repetição (`do-while`) para impedir falhas (`InputMismatchException`) caso o usuário digite caracteres não numéricos ou distâncias menores ou iguais a zero.
* **Resumo detalhado da viagem:** Exibe a categoria da viagem, a distância total, a tarifa unitária aplicada e o valor final da passagem formatado em duas casas decimais.

## Tabela de Tarifas

| Categoria | Faixa de Distância | Valor por Km |
| :--- | :--- | :--- |
| Curta distância | Até 200 Km | R$ 0,50 |
| Longa distância | Acima de 200 Km | R$ 0,45 |

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 8 ou superior.

## Como Executar

1. Salve o código-fonte em um arquivo chamado `CalculoViagem.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac CalculoViagem.java
   ```
4. Execute a aplicação:
   ```bash
   java CalculoViagem
   ```

## Exemplo de Uso

### Cenário 1: Viagem de curta distância (até 200 Km)

```text
=== CALCULADORA DE PASSAGENS ===
Até 200 Km: R$ 0.50/Km | Acima de 200 Km: R$ 0.45/Km

Digite a distância da viagem em Km: 150

--- RESUMO DA VIAGEM ---
Categoria:         Curta distância
Distância:         150.00 Km
Tarifa aplicada:   R$ 0.50/Km
------------------------
Valor da passagem: R$ 75.00
```

### Cenário 2: Viagem de longa distância (acima de 200 Km)

```text
=== CALCULADORA DE PASSAGENS ===
Até 200 Km: R$ 0.50/Km | Acima de 200 Km: R$ 0.45/Km

Digite a distância da viagem em Km: 300

--- RESUMO DA VIAGEM ---
Categoria:         Longa distância
Distância:         300.00 Km
Tarifa aplicada:   R$ 0.45/Km
------------------------
Valor da passagem: R$ 135.00
```

## Estrutura Técnica

* **`java.util.Scanner` e `try-with-resources`:** Leitura segura de valores decimais via terminal com encerramento automático do recurso ao final da execução.
* **`java.util.Locale`:** Configurado para `Locale.US` para padronizar o ponto (`.`) como separador decimal na entrada e na saída de dados.
* **Operador ternário:** Utilizado para selecionar de forma concisa a tarifa unitária e a categoria da viagem com base no limite de quilometragem.
* **Saída formatada (`System.out.printf`):** Exibe valores monetários e distâncias com precisão de duas casas decimais (`%.2f`).
