//Deborah e Pietra
//adicionamos o método getRotaFinal, que retornava a variável rotafinal - 05/09
//no dia 23/09 fizemos algumas modificações na classe, seguindo o que era pedido no exercício 5, abaixo está o que fizemos:
//modificamos o construtor, fazendo com que ele recebesse somente um parâmetro do tipo LocalDateTime
//criamos o método adicionaRota, para adicionar as rotas ao Arraylist rotas
//adicionamos o método getDuracao, que considera a distância entre os aeroportos (todos os que estiverem na lista), a velocidade média de um avião como 805 km/h e mais 30 minutos para decolagem/aterrissagem e calcula a duração do vôo - 23/09
//adicionamos o método getRota, que retorna a rota do vôo
//adicionamos o método getRotas, que retorna todas as rotas feitas pelo vôo
//adicionamos um método toString para poder fazer testes na App 

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo 
{
    // private Rota rotaFinal;
    private ArrayList<Rota> rotas;

    // public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao)
    // {
    //     super(rota, datahora, duracao);
    //     this.rotaFinal = rotaFinal;
    // }

    public VooEscalas(LocalDateTime datahora)
    {
        super(datahora);
        rotas = new ArrayList<Rota>();
    }

    public void adicionaRota(Rota rota)
    {
        this.rotas.add(rota);
    }
    
    // @Override
    // public String toString()
    // {
    //     return super.toString() + " -> " + rotaFinal.getDestino().getCodigo();
    // }

    @Override
    public Rota getRota()
    {
        return rotas.get(0);
    }

    public ArrayList<Rota> getRotas()
    {
        return rotas;
    }

    @Override
    public Duration getDuracao()
    {
        double distancia = 0;
        for (int i=0; i<rotas.size(); i++)
        {
            distancia += rotas.get(i).getOrigem().getLocal().distancia(rotas.get(i).getDestino().getLocal());
        }
        
        long auxDis = Math.round(distancia);
        long tempo = auxDis/805;

        return Duration.ofMinutes(tempo+(rotas.size()*30));
    }

    @Override
    public String toString()
    {
        String aux = super.toString();
        int i = 0;

        for (i=0; i<rotas.size()-1; i++)
        {
            aux += ", Escala " +i+ ": ";
            aux += rotas.get(i).getDestino().getCodigo();
        }

        aux += ", Destino Final: " + rotas.get(i).getDestino().getCodigo();

        return aux;
        
    }
}