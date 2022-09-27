//Deborah e Pietra
//criamos a classe e adicionamos um construtor que recebe uma variável do tipo LocalDateTime e uma variável do tipo Rota a ela - 23/09
//adicionamos o método getDuracao, que considera a distância entre os aeroportos, a velocidade média de um avião como 805 km/h e mais 30 minutos para decolagem/aterrissagem e calcula a duração do vôo - 23/09
//adicionamos o método getRota, que retorna a rota do vôo - 23/09
//adicionamos um método toString para poder fazer testes na App - 23/09

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
