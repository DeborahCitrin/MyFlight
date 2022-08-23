import java.util.ArrayList;

public class GerenciadorAeronaves 
{
    private ArrayList<Aeronave> aeronaves = new ArrayList<>();
    
    public void adicionar(Aeronave aviao)
    {
        aeronaves.add(aviao);
    }

    public void listarTodas()
    {
        for (int i=0; i<aeronaves.size(); i++)
        {
            System.out.println(aeronaves.get(i));
        }
    }

    public Aeronave buscarPorCodigo(String cod)
    {
        for (int i=0; i<aeronaves.size(); i++)
        {
            if (cod == aeronaves.get(i).getCodigo())
            {
                return aeronaves.get(i);
            }
        }
        return null;
    }

}
