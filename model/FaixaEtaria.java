package model;
public class FaixaEtaria {
    
    public dvd indicacao;
    
    private int de;
    private int ate;
    
    private boolean ehBaixo; 

    public dvd getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(dvd indicacao) {
        this.indicacao = indicacao;
    }

    public int getDe() {
        return de;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public int getAte() {
        return ate;
    }

    public void setAte(int ate) {
        this.ate = ate;
    }

    public boolean isEhBaixo() {
        return ehBaixo;
    }

    public void setEhBaixo(boolean ehBaixo) {
        this.ehBaixo = ehBaixo;
    }
    
    
}
