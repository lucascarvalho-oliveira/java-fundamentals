# Conversor de Segundos em Java

Este programa em Java converte um valor inteiro informado pelo usuário, representando segundos, para horas, minutos e segundos.

Ele realiza três tarefas principais:
- Recebe um valor inteiro em segundos
- Calcula a quantidade correspondente de horas e minutos
- Exibe o tempo convertido no console

## Tecnologias Utilizadas
- Java
- Entrada de dados com `Scanner`
- Operadores aritméticos: `/` e `%`
- Variáveis do tipo `int`

## Como o programa funciona
1. O usuário informa um número inteiro representando segundos.
2. O programa calcula as horas utilizando divisão inteira por 3600.
3. O restante é obtido utilizando o operador `%`.
4. A partir do restante, são calculados os minutos por divisão inteira por 60.
5. O valor final restante representa os segundos.
6. O resultado é exibido no formato: `Xh Ymin Zseg`.
