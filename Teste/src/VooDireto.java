import java.time.LocalDateTime;
import java.time.Duration;
import java.lang.Math;

public class VooDireto extends Voo{

	private Rota rota;

    public VooDireto(LocalDateTime datahora, Rota rota)
    {
        super(datahora);
        // this.datahora = datahora;
        this.rota = rota;
    }

    @Override
    public Duration getDuracao()
    {
        double distancia = rota.getOrigem().getLocal().distancia(rota.getDestino().getLocal());
        long auxDis = Math.round(distancia);
        long tempo = auxDis/805;

        return Duration.ofMinutes(tempo+30);
    }

    @Override
    public Rota getRota()
    {
        return rota;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Duração: " + getDuracao().toString() + 
        ", Origem: " +getRota().getOrigem().getCodigo() + ", Destino: " +getRota().getDestino().getCodigo();
    }
}