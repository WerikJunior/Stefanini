#language:pt

Funcionalidade: Cadastro

  Contexto:
    Dado que a modal esteja sendo exibida

  @loginComSucesso
  Esquema do Cenario: Realizar cadastro com <identificacao>
    Quando os campos sejam preenchidos da seguinte forma
      | nome  | <nome>  |
      | email | <email> |
      | senha | <senha> |
    E clicar no botao cadastrar
    Entao deve cadastrar usuario no sistema
    Exemplos:
      | identificacao  | nome      | email          | senha    |
      | campos validos | joao jose | joao@email.com | Abc1234# |

  @loginInvalido
  Esquema do Cenario: Realizar cadastro com <identificacao>
    Quando os campos sejam preenchidos da seguinte forma
      | nome  | <nome>  |
      | email | <email> |
      | senha | <senha> |
    E clicar no botao cadastrar
    Entao o sistema deve exibir mensagem de validacao
    Exemplos:
      | identificacao  | nome      | email          | senha    |
      | nome invalido  | joao      | joao@email.com | Abc1234# |
      | email invalido | joao jose | a              | Abc1234# |
      | senha invalida | joao jose | joao@email.com | 123      |



