//Deborah e Pietra 
//fizemos a classe Aeronave implementar a interface Contavel, sendo assim, a classe deve ter um método chamado contar() que retorne o total de objetos do tipo Aeronave já criados - 30/08

public class Aeronave implements Contavel{

	private static int totalAeronaves = 0;
	private String codigo;
	private String descricao;
	
	public Aeronave(String codigo, String descricao) {
		totalAeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int contar() 
	{
		return totalAeronaves;
	}
}
