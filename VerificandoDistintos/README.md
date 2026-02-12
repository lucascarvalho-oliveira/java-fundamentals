# Verificação de Números Distintos em Java

Este programa em Java verifica se uma lista de números inteiros informada pelo usuário contém valores repetidos.

Ele realiza três tarefas principais:
- Recebe a quantidade de números a serem comparados
- Armazena os valores em um vetor
- Verifica se existem números iguais na lista

## Tecnologias Utilizadas
- Java
- Entrada de dados com `Scanner`
- Vetor `int[]`
- Estruturas de repetição: `for`
- Estrutura condicional `if`
- Variável booleana `boolean`

## Como o programa funciona
1. O usuário informa a quantidade de números que deseja comparar.
2. Um vetor `int[]` é criado com o tamanho informado.
3. Os números são armazenados no vetor por meio de um laço `for`.
4. Dois laços `for` aninhados percorrem o vetor para comparar cada elemento com os demais.
5. Se dois valores iguais forem encontrados, a variável de controle é alterada.
6. Ao final, o programa informa se a lista possui ou não números repetidos.
