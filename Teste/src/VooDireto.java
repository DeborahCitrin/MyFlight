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

    public Duration getDuracao()
    {
        double distancia = rota.getOrigem().getLocal().distancia(rota.getDestino().getLocal());
        long auxDis = Math.round(distancia);
        long tempo = auxDis/805;

        return Duration.ofMinutes(tempo+30);
    }

    public Rota getRota()
    {
        return rota;
    }
}
