package bancofinance.application.entities;

import bancofinance.application.enums.TipoConta;

public class ContaBancaria {

	private Integer number;
	private Double balance;
	private TipoConta tipoConta;
	private static final double LIMITWITHDRAW = 2000.00;
	private static final double LIMITDEPOSIT = 5000.00;
	
	public ContaBancaria() {
	}

	public ContaBancaria(Integer number, Double balance, TipoConta tipoConta) {
		this.number = number;
		this.balance = balance;
		this.tipoConta = tipoConta;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public String withdraw(double amount) {
		if (tipoConta == TipoConta.CONTAPOUPANCA && amount > LIMITWITHDRAW) {
			return "O limite para saques em conta poupança é de R$ 2000,00";
		}
		if (amount > balance) {
			return "Saldo insuficiente";
		} else {
			balance -= amount;
		}
		return "Saque efetuado com sucesso!!!";
	}

	public String deposit(double amount) {
		if (tipoConta == TipoConta.CONTACORRENTE && amount > LIMITDEPOSIT) {
			return "O limite para depositos em conta corrente é de R$ 5000,00";
		}else {
			balance += amount;
			return "Deposito efetuado com sucesso!";
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nNúmero da conta: ");
		builder.append(number);
		builder.append("\nBalance: ");
		builder.append(balance);
		builder.append("\nTipoConta: ");
		builder.append(tipoConta);
		builder.append("\n");
		return builder.toString();
	}
	
}
