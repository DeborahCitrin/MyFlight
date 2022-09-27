//Deborah e Pietra
//fizemos com que a classe implementasse a interface Comparable, da API Java. Sendo assim, a classe agora implementa um método compareTo, o que permite que ela faça uma comparação entre seus elementos. Nesse caso, a ordenação é feita pelo nome da companhia - 30/08

public class Rota implements Comparable<Rota>{
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;
	}
	
	public CiaAerea getCia() {
		return cia;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}

	public int compareTo(Rota o) {
		return cia.getNome().compareTo(o.cia.getNome());
	}
}
