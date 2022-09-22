import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo 
{
    private Rota rotaFinal;

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao)
    {
        super(rota, datahora, duracao);
        this.rotaFinal = rotaFinal;
    }

    public void adicionaRota(Rota rota){

    }

    public Duration getDuracao(){
        
    }

    public Rota getRotaFinal()
    {
        return rotaFinal;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " -> " + rotaFinal;
    }
}
