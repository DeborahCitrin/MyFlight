import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos 
{
    private ArrayList<Aeroporto> aeroportos = new ArrayList<>();

    public void adicionar(Aeroporto aero)
    {
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listaTodos()
    {
        return aeroportos;
    }

    public Aeroporto buscarPorCodigo(String cod)
    {
        for (int i=0; i<aeroportos.size(); i++)
        {
            if (cod == aeroportos.get(i).getCodigo())
            {
                return aeroportos.get(i);
            }
        }
        return null;
    }

    public void ordenaNome()
    {
        Collections.sort(aeroportos);
    }

}
