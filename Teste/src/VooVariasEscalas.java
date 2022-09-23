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
