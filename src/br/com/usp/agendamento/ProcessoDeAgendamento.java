package br.com.usp.agendamento;

public class ProcessoDeAgendamento {
	public void RealizeAgendamento(AgendamentoModel agendamento) {
		MapeadorDeAgendamento mapeador = new MapeadorDeAgendamento();
		mapeador.InsiraAgendamento(agendamento);
	}
}
