Story:
	Como programador eu desejo
	testar o metodo de concatenação de nomes

Narrative:
	Dado que estou na tela de composição de nomes
	quando informo "Claudio" como nome
	e informo "Neiva" como sobrenome
	e solicito a composição do nome completo
	então é exibido o nome "Claudio Neiva"
	
Scenario: Unir nome e sobrenome

Given usuario ira escrever nome em um campo e sobrenome em outro campo
When ao clicar no botao unir os nomes
Then mostrar nome e sobrenome unidos que sera Claudio Neiva