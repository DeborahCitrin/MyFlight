import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo
{
    private ArrayList<Rota> escalas;  

    public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duracao)
    {
        super(rota, datahora, duracao);
        escalas = new ArrayList<Rota>();
    }

    public void inserirEscala(Rota rotaEscala)
    {
        escalas.add(rotaEscala);
    }
    
}
