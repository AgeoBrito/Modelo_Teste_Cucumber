import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	Integer Saldo,Saque, SaldoATT;
    Cliente cliente = new Cliente();
    boolean Tipo = true;
	
	
	
	/**
	 * 
	 * @param Etapa 1   
	 */
	
	@Given("um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
	   this.Tipo = true; // Seta se o cliente for Especial ou não true para Especial ou false para Comum

	   
	   if(-200 != int1 || Tipo != true) {   // Testa o valor de int 1 e se o Cliente for Especial
	    throw new io.cucumber.java.PendingException();
	   }
	}


	/**
	 * 
	 * @param Etapa 2   
	 */
	
	@When("for solicirado um saque no valor de {int} reais")
	public void for_solicirado_um_saque_no_valor_de_reais(Integer int1) {	
		
		 this.Tipo = true;// Seta se o cliente for especial ou não true para Especial ou false para Comum
		
		if(100 != int1 || Tipo != true) {  // Testa o valor de int 1 e se o Cliente for Especial
	    throw new io.cucumber.java.PendingException();
		}
	}


	/**
	 * 
	 * @param Etapa 3   
	 */
	
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		
		this.Tipo = true;// Seta se o cliente for especial ou não true para Especial ou false para Comum
		this.Saldo = -200; // Seta o valor do Saldo para -200
	    this.Saque = 100; // Seta o valor do Saque -100
	    this.SaldoATT = cliente.SaqueOp(Saque, Saldo); //Variável responsavel para o valor do Saldo final
	    
	    if(this.SaldoATT != -300 || Tipo != true) {  // Testa o valor do Saldo referente ao valor pedido e se o Cliente for Especial
	    throw new io.cucumber.java.PendingException();
	    }
	}


	/**
	 * 
	 * @param Etapa 4  
	 */
	
	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
	   
		this.Tipo = false;// Seta se o cliente for especial ou não true para Especial ou false para Comum
	   
	    if(-300 != int1 || Tipo != false) { // Testa o valor de int 1 e se o Cliente for Comum
	    throw new io.cucumber.java.PendingException();
	    }
	}


	/**
	 * 
	 * @param Etapa 5   
	 */
	
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		
		this.Tipo = false;// Seta se o cliente for especial ou não true para Especial ou false para Comum
		
		
		if(200 != int1 || Tipo != false) { // Testa o valor de int 1 e se o Cliente for Comum
	    throw new io.cucumber.java.PendingException();
		}
	}


	/**
	 * 
	 * @param Etapa 6  
	 */	
	
	@Then("nao deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		
		this.Tipo = false;// Seta se o cliente for especial ou não true para Especial ou false para Comum
		this.Saldo = -300; //Seta o valor do Saldo
	    this.Saque = 200; //Seta o valor do Salque
	    this.SaldoATT = cliente.SaqueOp(Saque, Saldo); //Variável responsavel para o valor do Saldo final
	    
	    if (SaldoATT < 0 && Tipo == false) { // Testa o valor do Saldo referente ao valor pedido e se o Cliente for Comum
	    	System.out.print("Saldo Insuficiente");
	    }else {	    
	    throw new io.cucumber.java.PendingException();
	    }
	}
}
