package academy.devdojo.domain;



public class UserEntity {
    private Integer id;

    private String nome;

    public UserEntity(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public UserEntity() {
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
}
