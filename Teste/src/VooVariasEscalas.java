//Deborah e Pietra
//obs.: a classe está toda comentada, porque não queríamos apagá-la (no último exercício ela deixa de existir)
//criamos a classe - 05/09
//adicionamos o construtor à classe - 06/09
//adicionamos o método inserirEscala, que adiciona as escalas (tipo Rota) ao Arraylist de escalas - 06/09
//adicionamos o método toString, que usa o toString do super (classe Voo) e retorna uma String com as informações que já tinham no toString do super e com as escalas que foram adicionadas ao Arraylist de escalas - 23/09

// import java.time.Duration;
// import java.time.LocalDateTime;
// import java.util.ArrayList;

// public class VooVariasEscalas extends Voo
// {
//     private ArrayList<Rota> escalas;  

//     public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duracao)
//     {
//         super(rota, datahora, duracao);
//         escalas = new ArrayList<Rota>();
//     }

//     public void inserirEscala(Rota rotaEscala)
//     {
//         escalas.add(rotaEscala);
//     }
    
//     @Override 
//     public String toString()
//     {
//         String aux = super.toString();
//         int i = 0;

//         for (i=0; i<escalas.size()-1; i++)
//         {
//             aux += ", Escala " +i+ ": ";
//             aux += escalas.get(i).getDestino().getCodigo();
//         }

//         aux += ", Destino Final: " + escalas.get(i).getDestino().getCodigo();

//         return aux;
        
//     }
// }
// }
