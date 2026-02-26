# Inversão de Vetor em Java

Este programa em Java realiza a inversão da ordem dos elementos de um vetor de números inteiros.

Ele executa três tarefas principais:
- Cria um vetor de números inteiros
- Inverte a ordem dos elementos do vetor
- Exibe o vetor invertido no console

## Tecnologias Utilizadas
- Java
- Vetor `int[]`
- Método estático
- Estrutura de repetição `while`
- Estrutura de repetição `for`

## Como o programa funciona
1. Um vetor `int[]` é criado no método `main` com valores definidos.
2. O vetor é passado como parâmetro para o método `inverterList`.
3. Duas variáveis são criadas: `inicio` (primeira posição) e `fim` (última posição do vetor).
4. Um laço while é utilizado para executar enquanto `inicio` for menor que `fim`.
5. Dentro do laço, os valores das posições são trocados utilizando uma variável temporária.
6. A cada repetição, `inicio` é incrementado e `fim` é decrementado.
7. O processo continua até que as posições se encontrem no meio do vetor.
8. O vetor invertido é retornado.
9. Um laço `for` percorre o vetor invertido e imprime os valores no console.
