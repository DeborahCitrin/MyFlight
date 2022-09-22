import java.time.LocalDateTime;
import java.time.Duration;

public class VooDireto {

    private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	//private Status status;

    public VooDireto(LocalDateTime datahora, Rota rota){

    }

    public Duration getDuracao(){
        return duracao;
    }

    public Rota getRota(){
        return rota;
    }
}
