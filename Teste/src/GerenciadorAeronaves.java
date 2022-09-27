//Deborah e Pietra
//criamos o método adicionar, que recebe um objeto do tipo Aeronave como parâmetro e o adiciona ao Arraylist de aeronaves - 23/08
//criamos o método listarTodas, que lista o Arraylist de aeronaves - 23/08
//criamos o método buscarPorCodigo, que retorna a Aeronave que possui determinado código - 23/08

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
