# Distribuição de Cédulas em Java
Este programa em Java calcula a distribuição de cédulas de dinheiro a partir de um valor inteiro informado pelo usuário.
Ele realiza três tarefas principais:
- Recebe um valor inteiro múltiplo de 10
- Calcula a quantidade de cédulas de R$ 50, R$ 20 e R$ 10
- Exibe o resultado da distribuição no console

## Tecnologias Utilizadas
- Java
- Entrada de dados com `Scanner`
- Estruturas básicas: `if` implícito na lógica, operadores aritméticos, variáveis do tipo `int`

## Como o programa funciona
1. O usuário informa um número inteiro múltiplo de 10.
2. O programa calcula a quantidade de notas de R$ 50 usando divisão inteira.
3. O restante do valor é calculado utilizando o operador `%`.
4. A partir do restante, são calculadas as notas de R$ 20.
5. O valor final restante é convertido em notas de R$ 10.
6. A quantidade de cada cédula é exibida no console.
