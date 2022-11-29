@tag
Feature: Cliente faz saque de dinheiro Como um cliente, eu gostaria de sacar em caixa eletronico, 
para que eu nao tenha que esperar numa fila de banco

@tag1
Scenario: Cliente especial com saldo negativo 
 Given um cliente especial com saldo atual de -200 reais 
 When for solicirado um saque no valor de 100 reais
 Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
 
 @tag2
 Scenario Outline: Cliente comum com saldo negativo 
 Given um cliente comum com saldo atual de -300 reais
 When solicitar um saque de 200 reais 
 Then nao deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente 



