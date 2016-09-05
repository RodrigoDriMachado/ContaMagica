package app;

import java.math.BigDecimal;

public class ContaMagica {

	private String nome;
	private BigDecimal saldo;
	private BigDecimal aux;
	private int status;

	public ContaMagica(String nome) {
		this.status = 1;
		this.nome = nome;
		saldo = new BigDecimal(0.0);
	}

	public void deposito(BigDecimal valor) {
		if (status == 1) {
			saldo = this.saldo.add(valor);
	
		} else if (status == 2) {
			aux = BigDecimal.valueOf(0.0);
			saldo = this.saldo.add(aux.multiply(valor).add(valor));

		} else if (status == 3) {
			aux = BigDecimal.valueOf(0.025);
			saldo = this.saldo.add(aux.multiply(valor).add(valor));
		}
		
		if(this.saldo.compareTo(new BigDecimal(49999.0))==1 && this.saldo.compareTo(new BigDecimal(200000.0))==0){
			this.setStatus(2);
		}
		else if(this.saldo.compareTo(new BigDecimal(200000.0))==1){
			this.setStatus(3);
		}
		

	}
	
	public void retirada(BigDecimal valor) {
		this.saldo.subtract(valor);
		if(new BigDecimal(25000.0).compareTo(this.saldo)==1 && this.saldo.compareTo(new BigDecimal(100000.0))==0){
			setStatus(1);
		}
		
		else if(new BigDecimal(100000.0).compareTo(this.saldo)==1){
			setStatus(2);
		}
	}
	
	/*
	 * Status = 1 é Silver 
	 * Status = 2 é Gold 
	 * Status = 3 é Platinum
	 */
	public int getStatus() {
		return status;

	}

	/*
	 * Status = 1 é Silver 
	 * Status = 2 é Gold 
	 * Status = 3 é Platinum
	 */
	public void setStatus(int num) {
		this.status = num;
	}

	
	public String getNomeCliente() {
		return this.nome;
	}

	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(BigDecimal valor){
		this.saldo = valor;
	}

}
