//Deborah e Pietra
//criamos o método adicionar, que recebe um objeto do tipo Aeroporto como parâmetro e o adiciona ao Arraylist de aeroportos - 23/08
//criamos o método listarTodas, que lista o Arraylist de aeroportos - 23/08
//criamos o método buscarPorCodigo, que retorna o aeroporto que possui determinado código - 23/08
//Adicionamos o método ordenaNome() que realiza a ordenação dos elementos do Arraylist de aeroportos. Para tanto, foi utilizado o método sort da classe Collectons. A ordenação foi possível pela implementação da interface Comparable na classe Aeroporto. - 30/08

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos 
{
    private static ArrayList<Aeroporto> aeroportos = new ArrayList<>();

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

    public static void ordenaNome()
    {
        Collections.sort(aeroportos);
    }

}
