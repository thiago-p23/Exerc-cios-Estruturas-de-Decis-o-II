# Sistema de Autenticação - Dois Logins

Aplicação de console desenvolvida em Java para simular um sistema de controle de acesso com dois usuários cadastrados, validação de credenciais e bloqueio por limite de tentativas.

## Funcionalidades

* **Múltiplos usuários:** Permite a autenticação de duas contas distintas definidas por constantes (`final`).
* **Tratamento de entrada no usuário:** Remove espaços em branco acidentais nas extremidades (`trim()`) e ignora diferenças entre letras maiúsculas e minúsculas (`equalsIgnoreCase()`) no nome de usuário.
* **Validação estrita de senha:** Exige correspondência exata de caracteres e caixa (`equals()`) para a senha informada.
* **Controle de tentativas:** Concede até 3 tentativas de login por meio de um laço `while`, exibindo a contagem regressiva de chances restantes e bloqueando o acesso caso o limite seja excedido.
* **Saudação personalizada:** Exibe mensagem de boas-vindas identificando o usuário autenticado.

## Credenciais Cadastradas

| Usuário | Senha |
| :--- | :--- |
| `atila` | `12345` |
| `olivia` | `54321` |

## Pré-requisitos

* **Java Development Kit (JDK):** Versão 8 ou superior.

## Como Executar

1. Salve o código-fonte em um arquivo chamado `DoisLogins.java`.
2. Abra o terminal na pasta onde o arquivo foi salvo.
3. Compile o código:
   ```bash
   javac DoisLogins.java
