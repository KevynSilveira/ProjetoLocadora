package model;
public class pessoa extends amigo{
    
    public dvd diretor;
    
    private String nome;

    public dvd getDiretor() {
        return diretor;
    }

    public void setDiretor(dvd diretor) {
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
