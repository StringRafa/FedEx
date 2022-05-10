package bancofinance.application.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bancofinance.application.entities.ContaBancaria;
import bancofinance.application.enums.TipoConta;

class ContaBancariaTest {

	ContaBancaria contaBancaria;
	
	@Test
	void testDeposit() {
		contaBancaria = new ContaBancaria(12369, 3000.00, TipoConta.CONTACORRENTE);
		String resultado = contaBancaria.deposit(6000.00);
		
		String resultadoEsperado = "O limite para depositos em conta corrente é de R$ 5000,00";
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	void testDepositSuccess() {
		contaBancaria = new ContaBancaria(12369, 3000.00, TipoConta.CONTACORRENTE);
		String resultado = contaBancaria.deposit(3000.00);
		
		String resultadoEsperado = "Deposito efetuado com sucesso!";
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	void testWithdraw() {
		contaBancaria = new ContaBancaria(12369, 3000.00, TipoConta.CONTAPOUPANCA);
		String resultado = contaBancaria.withdraw(3000.00);
		
		String resultadoEsperado = "O limite para saques em conta poupança é de R$ 2000,00";
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	void testWithdrawWithoutBalance() {
		contaBancaria = new ContaBancaria(12369, 500.00, TipoConta.CONTAPOUPANCA);
		String resultado = contaBancaria.withdraw(1000.00);
		
		String resultadoEsperado = "Saldo insuficiente";
		
		assertEquals(resultado, resultadoEsperado);
	}

	@Test
	void testWithdrawSuccess() {
		contaBancaria = new ContaBancaria(12369, 3000.00, TipoConta.CONTAPOUPANCA);
		String resultado = contaBancaria.withdraw(1000.00);
		
		String resultadoEsperado = "Saque efetuado com sucesso!!!";
		
		assertEquals(resultado, resultadoEsperado);
	}
}
