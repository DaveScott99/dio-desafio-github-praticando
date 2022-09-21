# Métodos

### Fundamentos
É uma porção de código (sub-rotina) que é disponibilizada por uma clase. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento.

### Particularidades
 - Assinatura: é a forma de identificar unicamente o método

		Ass = nome + parametros

 - Construtor ou Destrutor: são métodos usados na Orientação a Objetos.
	Os contrutores criam objetos a partir de classes. Os destrutores auxiliam na destruição de objetos.

 - Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe. É o que faz o software de fato funcionar. São as execuções dos métodos, as mensagens que são passadas para eles para que eles executem seus procedimentos (códigos) internos. 



## Sobrecarga
É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.

Conseguimos criar vários métodos com o mesmo nome, mas que poderão se comportas diferente(contexto) de acordo com sua lista de parametros. Ou seja, essa lista pode mudar.

Quando os parametros são completamente iguais devemos alterar o tipo de dado, por exemplo tipo de dado double que estão iguais deverá ser alterado para float

### Sobrecarga x Sobrescrita
Embora sejam dois conceitos relacionados a métodos, estas são completamente diferentes. A sobrecarga, como disse tem relação ao mesmo método com parametros diferentes. Já a sobrescrita, tem relação com herança, qual é um assunto relacionado a orientação a objeto. Então não confunda. Ambos tem relação com método mas tem formas diferentes de definição, uso, além de comportamentos diferentes.



## Return (retorno)

### Funcionamento
O método executa seu retorno quando: 

 - Completa todas as suas instruções internas.
 - Chega a uma declaração explicita de retorno.
 - Lança uma exceção

### Considerações
 - O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;

 - O tipo de dado do return deve ser compatível com o do método;

 - Se o método for sem retorno (void), pode ou não ter um "return" para encerrar sua execução
