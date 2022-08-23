public class App 
{
    public static void main(String[] args) 
    {
        Aeronave aviazinho = new Aeronave("codigo", "descricao");

        CiaAerea ajuda = new CiaAerea("codigocia", "nomecia");
        Geo loca = new Geo(123, 456);
        Aeroporto salgadoFilho = new Aeroporto("salgadinho", "nomeSalga", loca);

        Rota socoror = new Rota(ajuda, salgadoFilho, salgadoFilho, aviazinho);

        // Voo voo1 = new Voo(socoror, datahora, duracao)

        
    }
    
}
