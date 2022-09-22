import java.time.LocalDateTime;

public class App 
{
    public static void main(String[] args) 
    {
        Aeronave aviazinho = new Aeronave("codigo", "descricao");

        CiaAerea ajuda = new CiaAerea("codigocia", "nomecia");
        Geo loca = new Geo(123, 456);
        Aeroporto salgadoFilho = new Aeroporto("salgadinho", "nomeSalga", loca);

        Rota socoror = new Rota(ajuda, salgadoFilho, salgadoFilho, aviazinho);

        //LocalDateTime data =
        //Voo voo1 = new Voo(socoror, 2007-12-03T10:15:30, 34.5)

        //testes que precisamos fazer:
        //arrumar voo
        //testar segundo construtor voo
        //calcular distância classe geo - static e não static
        //testar CompareTo Aeroport
        //testar CompareTo Rota
        //testar interface contavel aeronave
        //testar VooVariasEscalas
        //fazer toString em VooVariasEscalas
        //testar VooEscalas

        
    }
    
}
