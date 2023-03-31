package br.ifpr.aula.pacote;

public class Jogador {
    private String corCabelo;
    String corPele;
    public String nome;
    protected String sobrenome;

    private String getcorCabelo(){
        return this.corCabelo;
    }
    public void setcorCabelo(String corCabelo){
        this.corCabelo = corCabelo;

    }
}
