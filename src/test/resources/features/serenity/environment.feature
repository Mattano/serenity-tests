#language: pt
Funcionalidade: Environments

  Desejo saber se consigo ler as variaveis de ambiente do serenity


  @Serenity
  Cenario: : Deve ser capaz de ler as variaveis de ambiente
    Dado a variavel token carregada
    Quando busco pela variavel "user.email"
    E busco pela variavel "user.password"
    Entao o sistema deve retornar o resultado de acordo com o ambiente







