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
