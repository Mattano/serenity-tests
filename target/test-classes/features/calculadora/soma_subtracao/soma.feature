#language: pt
Funcionalidade: : Soma

  Eu como usuário, desejo utilizar as operações de soma para realizar o calculo do dia a dia


  Delineacao do Cenario: : Deve ser capaz de realizar operacoes de soma com dois numeros
    Dado que o usuario deseja realizar uma operacao de soma
    Quando ele  tenta somar o <primeiro_numero> o <segundo_numero>
    Entao o sistema deve retornar <resultado>
    Exemplos:
      | primeiro_numero | segundo_numero | resultado |
      | 5               | 8              | 13        |
      | 100             | 0              | 0         |
      | -1              | 1              | 0         |
      | 22.5            | 0.25           | 22.75     |




