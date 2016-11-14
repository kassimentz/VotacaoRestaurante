package model;

/**
 * Created by kassianesmentz on 14/11/16.
 */
public class Restaurante {

    private String nome;

    public Restaurante(){}

    public Restaurante(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                ", nome='" + nome + '\'' +
                '}';
    }
}
