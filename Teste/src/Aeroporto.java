//Deborah e Pietra
//fizemos com que a classe implementasse a interface Comparable, da API Java. Sendo assim, a classe agora implementa um método compareTo, o que permite que ela faça uma comparação entre seus elementos. Nesse caso, a ordenação é feita pelo nome do aeroporto - 30/08

public class Aeroporto implements Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public int compareTo(Aeroporto o) 
	{
		return nome.compareTo(o.nome);
	}

	public String toString(){
		return String.format("%5s %-15s ", getCodigo(),getNome());  
	}


}
