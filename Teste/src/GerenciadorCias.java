import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() 
	{
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) 
	{
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas()
	{
		return empresas;
	}
	
	public CiaAerea buscarPorCodigo(String cod)
	{
		for (int i=0; i<empresas.size(); i++)
        {
            if (cod == empresas.get(i).getCodigo())
            {
                return empresas.get(i);
            }
        }
        return null;
	}

	public CiaAerea buscarPorNome(String nome)
	{
		for (int i=0; i<empresas.size(); i++)
        {
            if (nome == empresas.get(i).getNome())
            {
                return empresas.get(i);
            }
        }
        return null;
	}
}
