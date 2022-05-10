package bancofinance.application.entities;

import java.util.ArrayList;
import java.util.List;

import bancofinance.application.enums.TipoConta;

public class PessoaFisica extends ContaBancaria{

	private String name;
	private List<ContaBancaria> contas = new ArrayList<>();
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(Integer number, Double balance, TipoConta tipoConta, String name) {
		super(number, balance, tipoConta);
		this.name = name;
		contas.add(new ContaBancaria(number, balance, tipoConta));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(List<ContaBancaria> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n==========Pessoa Fisica==========");
		builder.append("\nNome do CLiente: ");
		builder.append(name);
		builder.append("\nContas: ");
		for (ContaBancaria contaBancaria : contas) {
			builder.append(contaBancaria);
		}
		return builder.toString();
	}
	
}
