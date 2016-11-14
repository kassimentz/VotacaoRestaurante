package model;

/**
 * Created by kassianesmentz on 14/11/16.
 */
public class Profissional {

    private Integer id;
    private String nome;

    public Profissional(){}

    public Profissional(Integer id, String nome) {
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
        return "Profissional{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
