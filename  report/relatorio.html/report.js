$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Busca.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Busca por Produto na HomePage",
  "description": "",
  "id": "busca-por-produto-na-homepage",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 4,
  "name": "Entrar no site advance",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que entro na home inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepsBusca.que_entro_na_home_inicial()"
});
formatter.result({
  "duration": 10849402000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Buscar produto com sucesso",
  "description": "",
  "id": "busca-por-produto-na-homepage;buscar-produto-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@BuscaProdutoTelaInicialComSucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "clico no produto com sucesso",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "localizarar o produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepsBusca.clico_no_produto_com_sucesso()"
});
formatter.result({
  "duration": 36466700,
  "status": "passed"
});
formatter.match({
  "location": "StepsBusca.localizarar_o_produto()"
});
formatter.result({
  "duration": 1788618800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Entrar no site advance",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 5,
  "name": "que entro na home inicial",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepsBusca.que_entro_na_home_inicial()"
});
formatter.result({
  "duration": 10023046501,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Buscar produto sem sucesso",
  "description": "",
  "id": "busca-por-produto-na-homepage;buscar-produto-sem-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 12,
      "name": "@BuscaProdutoTelaInicialComFalha"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "nao achara o produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepsBusca.nao_achara_o_produto()"
});
formatter.result({
  "duration": 1742918399,
  "status": "passed"
});
formatter.uri("Cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro",
  "description": "",
  "id": "cadastro",
  "keyword": "Funcionalidade"
});
formatter.background({
  "line": 6,
  "name": "entrar na pagina",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que entro na pagina de registros",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepsCadastro.que_entro_na_pagina_de_registros()"
});
formatter.result({
  "duration": 10106709400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Cadastrar usuario novo com sucesso",
  "description": "",
  "id": "cadastro;cadastrar-usuario-novo-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@Cadastro1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "eu preencho todos campos do formulario",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "vai registrar com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepsCadastro.eu_preencho_todos_campos_do_formulario()"
});
formatter.result({
  "duration": 4369696800,
  "status": "passed"
});
formatter.match({
  "location": "StepsCadastro.vai_registrar_com_sucesso()"
});
formatter.result({
  "duration": 2424392501,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "entrar na pagina",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que entro na pagina de registros",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepsCadastro.que_entro_na_pagina_de_registros()"
});
formatter.result({
  "duration": 10113636800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Cadastrar usuario sem sucesso",
  "description": "",
  "id": "cadastro;cadastrar-usuario-sem-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 14,
      "name": "@Cadastro2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "preencho todos os campos do formulario com erro",
  "keyword": "Quando "
});
formatter.step({
  "line": 17,
  "name": "nao consigo registrar o usuario",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepsCadastro.preencho_todos_os_campos_do_formulario_com_erro()"
});
formatter.result({
  "duration": 4296185200,
  "status": "passed"
});
formatter.match({
  "location": "StepsCadastro.nao_consigo_registrar_o_usuario()"
});
formatter.result({
  "duration": 1077287100,
  "status": "passed"
});
formatter.uri("Pesquisa.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Pesquisa Produto",
  "description": "",
  "id": "pesquisa-produto",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Pesquisa"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Pesquisar produto com sucesso",
  "description": "",
  "id": "pesquisa-produto;pesquisar-produto-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que entro na pagina inicial",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "pesquiso o produto localizo com sucesso",
  "keyword": "E "
});
formatter.match({
  "location": "StepsPesquisa.que_entro_na_pagina_inicial()"
});
formatter.result({
  "duration": 10019629400,
  "status": "passed"
});
formatter.match({
  "location": "StepsPesquisa.pesquiso_o_produto_localizo_com_sucesso()"
});
formatter.result({
  "duration": 1567147899,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Pesquisar produto sem sucesso",
  "description": "",
  "id": "pesquisa-produto;pesquisar-produto-sem-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 15,
  "name": "que entro na pagina inicial",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "pesquiso o produto não localizo o produto",
  "keyword": "E "
});
formatter.match({
  "location": "StepsPesquisa.que_entro_na_pagina_inicial()"
});
formatter.result({
  "duration": 10034814400,
  "status": "passed"
});
formatter.match({
  "location": "StepsPesquisa.pesquiso_o_produto_não_localizo_o_produto()"
});
formatter.result({
  "duration": 2123595000,
  "status": "passed"
});
});