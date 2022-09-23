import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas 
{
    private static ArrayList<Rota> rotas = new ArrayList<>();

    public void adicionar(Rota rota)
    {
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas()
    {
        return rotas;
    }

    public Rota buscarPorOrigem(Aeroporto orig)
    {
        for (int i=0; i<rotas.size(); i++)
        {
            if (orig == rotas.get(i).getOrigem())
            {
                return rotas.get(i);
            }
        }
        return null;
    }

    public static void ordenaNome()
    {
        Collections.sort(rotas);
    }

}