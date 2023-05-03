package DTO;

public class Sede {

    private Integer CodS;
    private String nome;
    private String indirizzo;
    private String responsabile;

    public Sede (Integer codS,String nome,String indirizzo,String responsabile) {
        this.CodS = codS;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.responsabile = responsabile;
    }

//GETTERS E SETTERS

    public Integer getCodS() {
        return CodS;
    }

    public void setCodS(Integer codS) {
        this.CodS = codS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }


}