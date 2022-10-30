package br.com.usp.agendamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MapeadorDeCliente {
	
	public void CadastreCliente(ClienteModel cliente ) {
		try {
			ConnectionFactory connectionFactory = new ConnectionFactory();
			Connection connection = connectionFactory.recuperarConexao();
			String cpf = cliente.getCpf();
			String nome = cliente.getNome();
			String contato = cliente.getContato();
			
			String query = 
					"INSERT INTO CLIENTE (cpf,nome,contato) VALUES (?,?,?);";
			
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, cpf);
			statement.setString(2, nome);
			statement.setString(3, contato);
			
			int row = statement.executeUpdate();
			
			System.out.println(row);
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
