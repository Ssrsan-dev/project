package br.com.usp.agendamento;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agendamento")
public class AgendamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String contato = request.getParameter("contato");
		String dataAgendada = request.getParameter("data");
		String dataAgendamento = new Date().toString();
		
		ClienteModel cliente = new ClienteModel(cpf, nome, contato);
		AgendamentoModel agendamento = new AgendamentoModel(cliente, dataAgendada, dataAgendamento);
		
		ProcessoDeCadastroDeCliente processoCadastro = new ProcessoDeCadastroDeCliente();
		ProcessoDeAgendamento processoAgendamento = new ProcessoDeAgendamento();
		processoCadastro.RealizeCadastroCliente(cliente);
		processoAgendamento.RealizeAgendamento(agendamento);
		
		request.setAttribute("nome", cliente.getNome());
		request.setAttribute("data", agendamento.getDataAgendada());
		
		RequestDispatcher rd = request.getRequestDispatcher("/agendamentoConcluido.jsp");
		rd.forward(request, response);
		
	}
}
