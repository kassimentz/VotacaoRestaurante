package controller;


import model.Profissional;
import model.Restaurante;
import model.Voto;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by kassianesmentz on 14/11/16.
 */
public class VotacaoDiariaTest {

    private Voto voto;
    private Restaurante r;
    private Profissional p;
    private Date date;
    private List<Voto> votos;
    //private Map<String, Restaurante> votacaoDiaria;

    @Before
    public void setup(){
        r = new Restaurante("Restaurante 1");
        p = new Profissional("Profissional 1");
        date = new Date();
        voto = new Voto();
        votos = new ArrayList<Voto>();
        //votacaoDiaria = new HashMap<String, Restaurante>();
    }

    @Test
    public void devePermitirVotarNoMeuRestauranteFavorito() throws Exception {

        voto.votar(r, p, date);
    }

    @Test public void devePermitirVotarSomenteUmaVezPorDia() throws Exception {
        voto.votar(r, p, date);
        if(!votos.contains(voto)){
            votos.add(voto);
        }

    }


}

