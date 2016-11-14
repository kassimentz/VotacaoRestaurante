package model;

import java.util.Date;

/**
 * Created by kassianesmentz on 14/11/16.
 */

public class Voto {

    private Restaurante restaurante;
    private Profissional profissional;
    private Date diaHoraVotacao;

    public Voto(){}


    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Date getDiaHoraVotacao() {
        return diaHoraVotacao;
    }

    public void setDiaHoraVotacao(Date diaHoraVotacao) {
        this.diaHoraVotacao = diaHoraVotacao;
    }

    public void votar(Restaurante restaurante, Profissional profissional, Date date) {
        this.restaurante = restaurante;
        this.profissional = profissional;
        this.diaHoraVotacao = date;
    }
}
