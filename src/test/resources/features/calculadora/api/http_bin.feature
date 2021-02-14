#language:pt

Funcionalidade: Testar Biblioteca REST do Serenity no httpbin.org

@API
  Cenario: Validar resposta GET
    Dado um usuario que deseja enviar requisicao rest
    Quando realizo uma requisicao GET para "http://httpbin.org/get"
    Entao devo receber o codigo 200 na minha requisicao
    E o corpo da resposta deve conter os seguintes valores:
      | origin   | 191.136.99.196        |
      | url   | http://httpbin.org/get |
