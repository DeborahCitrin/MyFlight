import java.util.ArrayList;
import java.time.LocalDate;

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

    public static void buscarData(LocalDate data) {

    }
}
