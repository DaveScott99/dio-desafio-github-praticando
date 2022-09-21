# Estruturas de Repetição

Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

#### Laços ou repetições são representados pelas seguintes estruturas: 

 - **For** (para)
 - **While** (enquanto)
 - **Do While** (faça enquanto)


## For

O comando **for** (na tradução para a língua portuguesa "para") permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe uma variável contadora, a condição e o valor de incrementação.

#### A estrutura de sintaxe do controle de repetição é exibida abaixo: 

		for (bloco de inicialização; expressão booleanade validação; bloco de atualização) {
			Comando que será executado até que a expressão de validação torne-se falsa
		}

		for (int i = 0; i < 5; i++) {
			Código
		}

## Breack e continue

**Break** significa quebrar, parar, frear, interromper, E é isso que se faz quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando **break** interrompe o laço, já o **continue** interrompe somente a iteração autal.

## While

O laço **while** (na tradução literal para a língua portuguesa "enquanto") determina que enquanto uma condição for válida, o bloco de código será executado. O laco **while** testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

#### Veja a estrutura de sintaxe **while** abaixo:

		while (expressão booleana de validação) {
			comando será executado até que a expressão de validação torne-se falsa
		}

## Do While

O laço **do/while** (na tradução para a língua portuguesa "faça enquanto"), assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado. Entretanto, **do / while** testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.

#### Veja a estrutura de sintaxe do / while abaixo: 

		do {
			comando que será executado até que a expressão de validação torne-se falsa
		}
		while (expressão booleana de validação);
