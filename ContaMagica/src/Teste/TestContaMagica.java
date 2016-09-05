package Teste;

import  app.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TestContaMagica {
	
	private ContaMagica conta1;
	private ContaMagica conta2;
	private ContaMagica conta3;
	private ContaMagica conta4;
	private ContaMagica conta5;
	private BigDecimal valor;

	@Before
	public void setUp() {
		conta1 = new ContaMagica("Rodrigo");
		conta2 = new ContaMagica("Lucas");
		conta3 = new ContaMagica("Ivanira");
		conta4 = new ContaMagica("Edson");
		conta5 = new ContaMagica("Cristina");
		this.valor = new BigDecimal(0.0);
	}
	
	@Test
	public void testeDepositoSilver(){
		valor = valor.ZERO;
		conta1.setSaldo(valor);
		valor = valor.valueOf(100.0);
		conta1.deposito(valor);
		assertEquals(1,conta1.getStatus());
	}
	
	@Test
	public void testeDepositoGold(){
		valor = valor.ZERO;
		conta1.setSaldo(valor);
		conta1.setStatus(1);
		valor = valor.valueOf(60000.0);
		conta1.deposito(valor);
		assertEquals(2,conta1.getStatus());
	}
	
	@Test
	public void testeDepositoPlatinum(){
		valor = valor.valueOf(0.0);
		conta1.setSaldo(valor);
		conta1.setStatus(1);
		valor = valor.valueOf(300000.0);
		conta1.deposito(valor);
		assertEquals(3,conta1.getStatus());
	}
	
	@Test
	public void testeSaque(){
		valor = valor.ZERO;
		conta1.setSaldo(valor);
		conta1.setStatus(1);
		System.out.println("SALDO = " + conta1.getSaldo() + " STATUS = " + conta1.getStatus());
		valor = valor.valueOf(100000.0);
		conta1.deposito(valor);
		System.out.println("");
		System.out.println("SALDO = " + conta1.getSaldo() + " STATUS = " + conta1.getStatus());
		valor = valor.valueOf(51000.0);
		conta1.retirada(valor);
		System.out.println("");
		System.out.println("SALDO = " + conta1.getSaldo() + " STATUS = " + conta1.getStatus());
		assertEquals(2,conta1.getStatus());
	}
	
	@Test
	public void testeSaqueSilver(){
		valor = valor.ZERO;
		conta1.setSaldo(valor);
		conta1.setStatus(1);
		valor = valor.valueOf(2500.0);
		conta1.deposito(valor);
		valor = valor.valueOf(1000.0);
		conta1.retirada(valor);
		assertEquals(1,conta1.getStatus());
	}

	
	@Test
	public void testeSaqueGold(){
		valor = valor.ZERO;
		conta1.setSaldo(valor);
		conta1.setStatus(1);
		valor = valor.valueOf(50000.0);
		conta1.deposito(valor);
		valor = valor.valueOf(260000.0);
		conta1.retirada(valor);
		assertEquals(1,conta1.getStatus());
	}
	
	
	@Test
	public void testeSaquePlatinum(){
		valor = valor.ZERO;
		conta1.setSaldo(valor);
		conta1.setStatus(1);
		valor = valor.valueOf(255000.0);
		conta1.deposito(valor);
		valor = valor.valueOf(200000.0);
		conta1.retirada(valor);
		assertEquals(1,conta1.getStatus());
	}
	

}
