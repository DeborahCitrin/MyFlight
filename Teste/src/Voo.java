//Deborah e Pietra
//criamos dois construtores, um que recebe a rota, data+horário e a duração e outro que não recebe a data+horário - 30/08
//modificamos a classe para uma classe abstrata, que é uma classe onde há falta de implementação de alguns métodos (nesse caso, o getRota e o getDuracao) - 23/09
//deixamos a classe com somente um construtor que recebe como parâmetro uma variável do tipo LocalDateTime - 23/09
//adicionamos um toString para podermos testar na classe App - 23/09

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora; //
	// private Duration duracao;
	// private Rota rota;
	// private Status status;

	public Voo(LocalDateTime datah)
	{
		this.datahora = datah;
	}

	public LocalDateTime getDatahora() 
	{
		return datahora;
	}

	public abstract Rota getRota();

	public abstract Duration getDuracao();

	// public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
	// 	this.rota = rota;
	// 	this.datahora = datahora;
	// 	this.duracao = duracao;
	// 	this.status = Status.CONFIRMADO; // default é confirmado
	// }
	// public Voo(Rota rota, Duration duracao)
	// {
	// 	this.rota = rota;
	// 	this.duracao = duracao;
	// 	this.datahora = LocalDateTime.of(2016, 8, 12, 12, 0, 0);
	// 	this.status = Status.CONFIRMADO;
	// }
	
	// public Rota getRota() {
	// 	return rota;
	// }
	
	
	
	// public Duration getDuracao() {
	// 	return duracao;
	// }
	
	// public Status getStatus() {
	// 	return status;
	// }
	
	// public void setStatus(Status novo) {
	// 	this.status = novo;
	// }

	public String toString()
	{
		return "Duração: " + getDuracao().toString() + ", Data e horário de saída: " + getDatahora().toString()
		+ ", Origem: " +getRota().getOrigem().getCodigo() + ", Destino: " +getRota().getDestino().getCodigo(); 
	}
}
