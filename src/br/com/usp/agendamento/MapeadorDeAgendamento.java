package br.com.usp.agendamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MapeadorDeAgendamento {
	
	public void InsiraAgendamento(AgendamentoModel agendamento) {		
		try {
			ConnectionFactory connectionFactory = new ConnectionFactory();
			Connection connection = connectionFactory.recuperarConexao();
			String nomeCliente = agendamento.getCliente().getNome();
			String cpfCliente = agendamento.getCliente().getCpf();
			String contato = agendamento.getCliente().getContato();
			String dataCriado = agendamento.getDataAgendamento();
			String dataHoraMarcada = agendamento.getDataAgendada();
			
			String query = 
					"INSERT INTO AGENDAMENTO (nomeCliente,cpfCliente,contato,data_criado,data_hora_marcado) VALUES (?,?,?,?,?);";
			
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, nomeCliente);
			statement.setString(2, cpfCliente);
			statement.setString(3, contato);
			statement.setString(4, dataCriado);
			statement.setString(5, dataHoraMarcada);
			
			int row = statement.executeUpdate();
			
			System.out.println(row);
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
