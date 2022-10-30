package br.com.usp.agendamento;

public class AgendamentoModel {
	
	private int id;
	private ClienteModel cliente;
	private String dataAgendada;
	private String dataAgendamento;
	
	public AgendamentoModel() { };
	
	public AgendamentoModel(ClienteModel cliente, String dataAgendada, String dataAgendamento) {
		this.setCliente(cliente);
		this.setDataAgendada(dataAgendada);
		this.setDataAgendamento(dataAgendamento);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public ClienteModel getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	
	public String getDataAgendada() {
		return dataAgendada;
	}
	
	public void setDataAgendada(String dataAgendada) {
		this.dataAgendada = dataAgendada;
	}
	
	public String getDataAgendamento() {
		return dataAgendamento;
	}
	
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

}
