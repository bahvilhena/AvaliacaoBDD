#language: pt

Funcionalidade: Busca por Produto na HomePage
Contexto:Entrar no site advance
Dado que entro na home inicial

@BuscaProdutoTelaInicialComSucesso
Cenario: Buscar produto com sucesso
Quando clico no produto com sucesso
Entao  localizarar o produto

@BuscaProdutoTelaInicialComFalha
Cenario: Buscar produto sem sucesso
Entao  nao achara o produto

