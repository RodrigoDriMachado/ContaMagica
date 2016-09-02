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
		this.valor = new BigDecimal(0);
	}
	
	@Test
	public void testeDepositoSilver(){
		valor.valueOf(0);
		conta1.setSaldo(valor);
		valor.valueOf(100);
		conta1.deposito(valor);
		assertEquals(1,conta1.getStatus());
	}
	
	@Test
	public void testeDepositoGold(){
		valor.valueOf(0);
		conta1.setSaldo(valor);
		valor.valueOf(50000);
		conta1.deposito(valor);
		assertEquals(2,conta1.getStatus());
	}
	
	@Test
	public void testeDepositoPlatinum(){
		valor.valueOf(0);
		conta1.setSaldo(valor);
		valor.valueOf(3000000);
		conta1.deposito(valor);
		assertEquals(3,conta1.getStatus());
	}
	
	@Test
	public void testeSaque(){
		valor.valueOf(0);
		conta1.setSaldo(valor);
		valor.valueOf(100000);
		conta1.deposito(valor);
		valor.valueOf(51000);
		conta1.retirada(valor);
		assertEquals(2,conta1.getStatus());
	}
	
	@Test
	public void testeSaqueSilver(){
		valor.valueOf(0);
		conta1.setSaldo(valor);
		valor.valueOf(2500);
		conta1.deposito(valor);
		valor.valueOf(1000);
		conta1.retirada(valor);
		assertEquals(1,conta1.getStatus());
	}

	
	@Test
	public void testeSaqueGold(){
		valor.valueOf(0);
		conta1.setSaldo(valor);
		valor.valueOf(50000);
		conta1.deposito(valor);
		valor.valueOf(260000);
		conta1.retirada(valor);
		assertEquals(1,conta1.getStatus());
	}
	
	
	@Test
	public void testeSaquePlatinum(){
		valor.valueOf(0);
		conta1.setSaldo(valor);
		valor.valueOf(255000);
		conta1.deposito(valor);
		valor.valueOf(200000);
		conta1.retirada(valor);
		assertEquals(2,conta1.getStatus());
	}
	

}
