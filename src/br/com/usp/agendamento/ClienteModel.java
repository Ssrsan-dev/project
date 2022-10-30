package br.com.usp.agendamento;

public class ClienteModel {
	
	private String cpf;
	private String nome;
	private String contato;
	
	public ClienteModel(String cpf, String nome, String contato) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setContato(contato);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
}
