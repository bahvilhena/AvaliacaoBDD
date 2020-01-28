#language: pt


Funcionalidade: Cadastro

Contexto: entrar na pagina
Dado que entro na pagina de registros

@Cadastro1
Cenario: Cadastrar usuario novo com sucesso 
Quando eu preencho todos campos do formulario 
Entao vai registrar com sucesso

@Cadastro2
Cenario: Cadastrar usuario sem sucesso
Quando preencho todos os campos do formulario com erro
Entao nao consigo registrar o usuario