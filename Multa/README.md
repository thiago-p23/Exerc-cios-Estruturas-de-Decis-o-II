# Calculadora de Multa de Velocidade

Aplicação de console desenvolvida em Java para simular um sistema de radar eletrônico que verifica se um veículo ultrapassou o limite de velocidade permitido na via e calcula o valor da multa proporcional ao excesso registrado.

## Funcionalidades

* **Regras configuráveis por constantes:** Define o limite de velocidade (`80 Km/h`) e o valor cobrado por quilômetro excedido (`R$ 50,00`) por meio de constantes (`final`), facilitando ajustes futuros.
* **Cálculo proporcional de infração:** Calcula automaticamente a diferença entre a velocidade registrada e o limite da via, multiplicando o excedente pelo valor unitário da penalidade.
* **Proteção contra entradas inválidas:** Utiliza verificação prévia de buffer (`hasNextInt()`) e laço de repetição (`do-while`) para impedir falhas (`InputMismatchException`) caso o usuário digite caracteres não numéricos ou velocidades negativas.
* **Relatório detalhado de fiscalização:** Exibe a velocidade aferida, o limite da via, o status do condutor, o excesso cometido e o valor total da multa formatado em duas casas decimais.

## Regras de Fiscalização

| Parâmetro | Valor Definido |
| :--- | :--- |
| Limite de velocidade da via | 80 Km/h |
| Valor por Km/h excedido | R$ 50,00 |

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 8 ou superior.

## Como Executar

1. Salve o código-fonte em um arquivo chamado `CalculoMulta.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac CalculoMulta.java
   ```
4. Execute a aplicação:
   ```bash
   java CalculoMulta
   ```

## Exemplo de Uso

### Cenário 1: Acima do limite permitido

```text
=== RADAR DE VELOCIDADE ===
Limite permitido na via: 80 Km/h

Digite a velocidade registrada (em Km/h): 95

--- RESULTADO DA FISCALIZAÇÃO ---
Velocidade registrada: 95 Km/h
Limite da via:         80 Km/h
Status:                INFRATOR (Acima do limite)
Excesso registrado:    15 Km/h
Cálculo:               15 Km/h x R$ 50.00
Valor da multa:        R$ 750.00
```

### Cenário 2: Dentro do limite permitido

```text
=== RADAR DE VELOCIDADE ===
Limite permitido na via: 80 Km/h

Digite a velocidade registrada (em Km/h): 80

--- RESULTADO DA FISCALIZAÇÃO ---
Velocidade registrada: 80 Km/h
Limite da via:         80 Km/h
Status:                REGULAR (Dentro do limite)
Você está dentro do limite permitido. Sem multa!
```

## Estrutura Técnica

* **`java.util.Scanner` e `try-with-resources`:** Leitura segura de dados numéricos via terminal com encerramento automático do recurso ao final da execução.
* **`java.util.Locale`:** Configurado para `Locale.US` para padronizar o ponto (`.`) como separador decimal na exibição dos valores monetários.
* **Estrutura condicional `if-else`:** Avalia se a velocidade informada ultrapassa o limite estabelecido para determinar o fluxo de cálculo da multa ou liberação do veículo.
