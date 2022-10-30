package br.com.usp.agendamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperarConexao() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(
				"jdbc:mysql://localhost/servico_agendamento?useTimezone=true&serverTimezone=UTC",
				"root",
				"admin");
	}
}
