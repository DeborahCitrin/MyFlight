//todos os exercícios foram feitos em conjunto (pela Deborah e pela Pietra, portanto, haverá o nome das duas em todas as classes modificadas)
//Deborah e Pietra
//Na App fizemos os testes de todas as classes do programa

import java.time.LocalDateTime;

public class App 
{
    public static void main(String[] args) 
    {
        Aeronave aviao = new Aeronave("codigo", "descricao");

        CiaAerea companhia = new CiaAerea("codigocia", "nomecia");
        Geo local = new Geo(-22.9035, -43.2096);
        Geo local1 = new Geo(-30.033056, -51.230000);
        Aeroporto Congonhas = new Aeroporto("CON", "concon", local1);
        Aeroporto salgadoFilho = new Aeroporto("salgadinho", "nomeSalga", local);

        Rota rota = new Rota(companhia, salgadoFilho, Congonhas, aviao);

        //teste primeiro construtor da classe Voo
        //Voo voo = new Voo(rota, LocalDateTime.of(2022, 12, 5, 10, 20, 50), Duration.ofHours(2));

        //teste segundo construtor da classe Voo
        //Voo voo1 = new Voo(rota, Duration.ofHours(3));

        //teste método static distância da classe Geo
        Geo outrolocal = new Geo(567, 425);
        double distancia1 = Geo.distancia(local, local1);
        //System.out.println(distancia1);

        //teste método não static distância da classe Geo
        double distancia2 = local.distancia(local1);
        //System.out.println(distancia2);

        //teste interface CompareTo Aeroporto
        Aeroporto Guarulhos = new Aeroporto("GRU", "guagua", outrolocal);
        Guarulhos.compareTo(salgadoFilho);

        //teste interface CompareTo Rota
        Rota rota1 = new Rota(companhia, Guarulhos, Congonhas, aviao);
        rota1.compareTo(rota);

        //teste interface Contavel Aeronave
        Aeronave aviao2 = new Aeronave("1234", "azul");
        aviao2.contar();

        //teste VooEscalas
        //VooEscalas vooEscalas = new VooEscalas(rota, rota1, LocalDateTime.of(2022, 9, 9, 18, 24, 6), Duration.ofHours(1));

        //teste VooVariasEscalas
        Rota rota2 = new Rota(companhia, Congonhas, salgadoFilho, aviao2);
        //VooVariasEscalas voo2 = new VooVariasEscalas(rota, LocalDateTime.of(2022, 8, 15, 2, 40, 45), Duration.ofMinutes(40));
        // voo2.inserirEscala(rota1);
        // voo2.inserirEscala(rota2);

        //TESTANDO VOO NOVO
        VooDireto vood = new VooDireto(LocalDateTime.of(2022, 12, 5, 10, 20, 50), rota);
        //System.out.println(vood.toString());

        VooEscalas vooe = new VooEscalas(LocalDateTime.of(2022, 12, 5, 10, 20, 50));
        vooe.adicionaRota(rota1);
        vooe.adicionaRota(rota2);
        //System.out.println(vooe.toString());

        //teste GerenciadorAeronaves
        GerenciadorAeronaves gerenciadorAeronav = new GerenciadorAeronaves();
        gerenciadorAeronav.adicionar(aviao2);
        gerenciadorAeronav.adicionar(aviao);
        System.out.println(gerenciadorAeronav.listarTodas());

        //teste GerenciadorCias
        GerenciadorCias gerenciadorC = new GerenciadorCias();
        gerenciadorC.adicionar(companhia);
        CiaAerea cia = new CiaAerea("78", "Companhia da Deborah");
        gerenciadorC.adicionar(cia);
        System.out.println(gerenciadorC.listarTodas());

        //teste GerenciadorVoos
        GerenciadorVoos gerenciadorVoo = new GerenciadorVoos();
        gerenciadorVoo.adicionar(vood);
        gerenciadorVoo.adicionar(vooe);
        System.out.println(gerenciadorVoo.listarTodos());

        //teste OrdenaNome GerenciadorAeroportos
        GerenciadorAeroportos gerenciaAeros = new GerenciadorAeroportos();
        gerenciaAeros.adicionar(Guarulhos);
        gerenciaAeros.adicionar(salgadoFilho);
        GerenciadorAeroportos.ordenaNome();
        System.out.println(gerenciaAeros.listaTodos()); 

        //teste OrdenaNome GerenciadorRotas
        GerenciadorRotas gerenciaRotas = new GerenciadorRotas();
        gerenciaRotas.adicionar(rota);
        gerenciaRotas.adicionar(rota2);
        GerenciadorRotas.ordenaNome();
        System.out.println(gerenciaRotas.listarTodas());

        // System.out.println(voo2.toString());

        // System.out.println(vooEscalas.toString());

        

    }
    
}