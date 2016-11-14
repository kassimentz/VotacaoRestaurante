package model;

/**
 * Created by kassianesmentz on 14/11/16.
 */
public class Restaurante {

    private Integer id;
    private String nome;

    public Restaurante(){}

    public Restaurante(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
