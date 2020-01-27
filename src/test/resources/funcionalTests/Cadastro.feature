#language: pt

@Cadastro
Funcionalidade: Cadastro


Cenario: Cadastrar usuario com sucesso

Dado que entro na pagina de registro
Quando preencho todos campos do formulario
E sou registrado com sucesso


Cenario: Cadastrar usuario sem sucesso

Dado que entro na pagina de registro
Quando preencho todos campos do formulario com erro
E não consigo registrar