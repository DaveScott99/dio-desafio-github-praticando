# Collections

 - Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.

 - Serve para armazenar e processar conjuntos de dados de forma eficiente.


## Composição Collections

 - **Interfaces:** É um contrato que quando assumido por uma classe deve ser implementado.

 - **Implementações ou Classes:** são as materializações, a codificação das interfaces.

 - **Algoritmos:** É uma sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

## Lists (listas)




## SET

O Set é apenas uma interface. A ordem depende da implementação.

### Implementações

 - O HashSet não tem garantia nenhuma de ordem. Na prática é aleatório.

 - O LinkedHashSet mantém a ordem na qual os elementos são inseridos. 

 - O TreeSet ordena os elementos de acordo com a ordenação natural (crescente, alfabética, etc). É possível passar um Comparator no construtor para especificar como ele deve ordenar caso a ordenação natural não exista ou não seja a desejada.

## MAP

O Map é apnes uma interface. A ordem depende da implementação.

- O HashMap não tem garantia nenhuma de ordem. Na prática é aleatório.

 - O LinkedHashMap mantém a ordem na qual os elementos são inseridos. 

 - O TreeMap ordena os elementos de acordo com a ordenação natural (crescente, alfabética, etc).
