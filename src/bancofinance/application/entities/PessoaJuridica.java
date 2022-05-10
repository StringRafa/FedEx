package bancofinance.application.entities;

import java.util.ArrayList;
import java.util.List;

import bancofinance.application.enums.TipoConta;

public class PessoaJuridica extends ContaBancaria{

	private String name;
	private String nomeFantasia;
	private List<ContaBancaria> contas = new ArrayList<>();
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(Integer number, Double balance, TipoConta tipoConta, String name, String nomeFantasia) {
		super(number, balance, tipoConta);
		this.name = name;
		this.nomeFantasia = nomeFantasia;
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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("==========Pessoa Juridica==========");
		builder.append("\nNome do Cliente: ");
		builder.append(name);
		builder.append("\nNomeFantasia: ");
		builder.append(nomeFantasia);
		builder.append("\nContas: ");
		for (ContaBancaria contaBancaria : contas) {
			builder.append(contaBancaria);
		}
		builder.append("\n");
		return builder.toString();
	}
	
}
