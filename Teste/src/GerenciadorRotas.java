//Deborah e Pietra
//criamos o método adicionar, que recebe um objeto do tipo Rota como parâmetro e o adiciona ao Arraylist de rotas - 23/08
//criamos o método listarTodas, que lista o Arraylist de rotas - 23/08
//criamos o método buscarPorOrigem, que retorna a Rota que possui determinada origem - 23/08
//Adicionamos o método ordenaNome() que realiza a ordenação dos elementos do Arraylist de rotas. Para tanto, foi utilizado o método sort da classe Collectons. A ordenação foi possível pela implementação da interface Comparable na classe Rota. - 30/08

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