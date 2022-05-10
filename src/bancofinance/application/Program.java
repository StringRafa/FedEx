package bancofinance.application;

import java.util.Arrays;
import java.util.Scanner;

import bancofinance.application.entities.ContaBancaria;
import bancofinance.application.entities.PessoaFisica;
import bancofinance.application.entities.PessoaJuridica;
import bancofinance.application.enums.TipoConta;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PessoaFisica joao = new PessoaFisica(12564, 5000.00, TipoConta.CONTACORRENTE,"João Silva");
		
		PessoaJuridica tnt = new PessoaJuridica(13698, 2000.00, TipoConta.CONTACORRENTE,"TNT", "TNT Cargas e Encomendas");
		
		ContaBancaria cp1 = new ContaBancaria(11456, 3000.00, TipoConta.CONTAPOUPANCA);
		
		System.out.print("Digite o valor que deseja sacar: ");
		double valorSaque = sc.nextDouble();
		
		System.out.println(cp1.withdraw(valorSaque));
		
		System.out.print("Digite o valor de deposito: ");
		double valorDeposito = sc.nextDouble();
		
		System.out.println(joao.deposit(valorDeposito));
		
		joao.getContas().addAll(Arrays.asList(cp1));
		
		System.out.println(joao);
		System.out.println(tnt);
		
		sc.close();
	}
}
