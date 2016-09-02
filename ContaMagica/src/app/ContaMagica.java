package app;

import java.math.BigDecimal;

public class ContaMagica {
	
	private String nome;
	private BigDecimal saldo;
	private int status;
	
	public ContaMagica(String nome){
		this.status=1;
		 this.nome=nome;
	 }
	 public String getNomeCliente(){
		 return this.nome;
	 }
	 
	 public BigDecimal getSaldo(){
		 return this.saldo;
	 }
	 
	 /*
	  * Status = 1 é Silver
	  * Status = 2 é Gold
	  * Status = 3 é Platinum
	  * */
	 public int getStatus(){
		 return status;
		 
	 }
	 
	 public void deposito(BigDecimal valor) {
		 if(status==1){
			 this.saldo = saldo.add(valor);
		 }
		 else if(status==2){
		
			 this.saldo = valor.add((0.01*valor));
			
		 }
		 
		 
	 }
	 
	 public void retirada(BigDecimal valor) {
		 
	 }
	 
	 private void setStatus(int num){
		 this.status=num;
	 }
	 
	 
	}



