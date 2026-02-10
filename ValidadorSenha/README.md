# Validador de Senha em Java
Este programa em Java valida a criação de uma senha com base em critérios de segurança.
Ele realiza três tarefas principais:
- Solicita a senha ao usuário
- Verifica se a senha possui pelo menos 8 caracteres
- Verifica se a senha contém ao menos um símbolo especial

## Tecnologias Utilizadas
- Java
- Entrada de dados com `Scanner`
- Estruturas básicas: `while`, `if`, `boolean`
- Expressões regulares com `matches()`

## Como o programa funciona
1. O programa entra em um laço de repetição `while` até que uma senha válida seja informada.
2. O usuário digita uma senha.
3. O tamanho da senha é verificado usando o método `length()`.
4. A presença de ao menos um símbolo especial é validada por meio de uma expressão regular.
5. Se a senha atender aos critérios, o programa exibe a mensagem de sucesso e encerra o laço.
6. Caso contrário, uma mensagem de erro é exibida e o usuário é solicitado a tentar novamente.
