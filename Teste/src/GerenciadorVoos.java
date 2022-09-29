//Deborah e Pietra
//criamos o método adicionar, que recebe um objeto do tipo Voo como parâmetro e o adiciona ao Arraylist de voos - 23/08
//criamos o método listarTodas, que lista o Arraylist de voos - 23/08
//criamos o método buscarData, que retorna o Voo que possui determinada data - 23/08

import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {
    private ArrayList<Voo> voos = new ArrayList<Voo>();

    public void adicionar(Voo voo) {
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return voos;
    }

    public Voo buscarData(LocalDateTime data) 
    {
        for (int i=0; i<voos.size(); i++)
        {
            if (data == voos.get(i).getDatahora())
            {
                return voos.get(i);
            }
        }
        return null;

    }
}
