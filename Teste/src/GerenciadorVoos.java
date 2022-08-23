import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {
    ArrayList<Voo> voos = new ArrayList<Voo>();

    public void adicionar(Voo voo) {
        voos.add(voo);
    }

    public void listarTodos(){
        for(int i = 0; i < voos.size(); i++){
            System.out.println(voos.get(i));        
        }
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
