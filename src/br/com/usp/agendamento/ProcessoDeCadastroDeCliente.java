package br.com.usp.agendamento;

public class ProcessoDeCadastroDeCliente {
	
	public void RealizeCadastroCliente(ClienteModel cliente) {
		MapeadorDeCliente mapeador = new MapeadorDeCliente();
		mapeador.CadastreCliente(cliente);
	}
}
