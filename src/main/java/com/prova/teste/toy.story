Story:
	Como programador eu desejo
	testar o metodo de concatena��o de nomes

Narrative:
	Dado que estou na tela de composi��o de nomes
	quando informo "Claudio" como nome
	e informo "Neiva" como sobrenome
	e solicito a composi��o do nome completo
	ent�o � exibido o nome "Claudio Neiva"
	
Scenario: Unir nome e sobrenome

Given usuario ira escrever nome em um campo e sobrenome em outro campo
When ao clicar no botao unir os nomes
Then mostrar nome e sobrenome unidos que sera Claudio Neiva