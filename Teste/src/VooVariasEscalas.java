import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo
{
    private ArrayList<Escala> escalas;  

    public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duracao)
    {
        super(rota, datahora, duracao);
        escalas = new ArrayList<Escala>();
    }

    public void inserirEscala()
    {
    }
    
}
