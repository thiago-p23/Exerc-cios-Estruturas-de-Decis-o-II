# Validador de String

Aplicação de console desenvolvida em Java para ler e validar entradas textuais no terminal, garantindo que o conteúdo informado não seja vazio nem composto apenas por espaços em branco.

## Funcionalidades

* **Prevenção de entradas em branco:** Remove espaços nas extremidades com `trim()` e verifica com `isEmpty()` se há conteúdo textual útil.
* **Normalização automática:** Retorna a `String` limpa nas bordas, evitando problemas de formatação ou armazenamento em etapas posteriores.
* **Persistência na solicitação:** Utiliza um laço `while` para repetir a leitura até que o usuário forneça um texto válido.
* **Feedback de extensão:** Exibe a cadeia de caracteres confirmada juntamente com seu comprimento total (`length()`).
* **Método reutilizável:** Encapsula a regra de validação em `lerString`, seguindo a mesma assinatura do validador de inteiros para facilitar o reaproveitamento em outros projetos.

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 8 ou superior.

## Como Executar

1. Salve o código-fonte em um arquivo chamado `ValidaString.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac ValidaString.java
   ```
4. Execute a aplicação:
   ```bash
   java ValidaString
   ```

## Exemplo de Uso

```text
=== VALIDADOR DE STRING ===
Digite uma string:     
Erro: Dado inválido. O texto não pode ficar vazio ou conter apenas espaços.

Digite uma string:   Java Console  

Entrada confirmada!
Você digitou: "Java Console" (12 caracteres)
```

## Estrutura Técnica

* **`java.util.Scanner` e `try-with-resources`:** Gerenciamento seguro da leitura de linhas via `nextLine()`, assegurando o fechamento automático do recurso.
* **`String.trim()` e `String.isEmpty()`:** Combinação utilizada para higienizar a entrada textual e validar a presença de caracteres visíveis.
* **Modularização (`lerString`):** Separa a responsabilidade de entrada e validação do fluxo principal do método `main`.
