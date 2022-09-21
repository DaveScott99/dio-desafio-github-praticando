# Controle de fluxo

Controle de fluxo é a habilidade de ajustar a maneira como o programa realiza suas tarefas. Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

### Classificação: 

 - Estrutura condicionais: if-else, switch-case
 - Estrutura de repetição: for, while, do-while
 - Estrutura de exceções: try-catch-finally, throw


## Estruturas condicionais

A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser **Simples** ou **Composta**

### Condicionais Simples

Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, considerando como uma estrutura **Simples**.

### Condicionais Composta

Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condicionada a uma regra de negócio, este cenário é denominado **Estrutura Condidinal Composta**.

### Condicionais encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao **se** (if) e **senão** (else), poderemos ter uma terceira, quarta e ou inúmeras condições.

### Condição ternária

Como vimos em operadores, podemos abreviar nosso algorítmo condicional refatorando com o conceito de operador ternário.

 - ? (if)
 - : (else) 

### Switch Case

A estrutura **switch** compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando **break** no final de cada bloco de código. O comando **break**, quando executado, encerra a execução da estrutura onde ele se encontrar.