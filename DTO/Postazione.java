package DTO;

public class Postazione {

    private Integer CodPostazione;
    private Integer num_posti;
    private Laboratorio CodL_fk;

    public Postazione(Integer codPostazione, Integer num_posti, Laboratorio codl_fk) {
        this.CodPostazione = codPostazione;
        this.num_posti = num_posti;
        this.CodL_fk = codl_fk;
    }

    public Integer getCodPostazione() {
        return this.CodPostazione;
    }

    public void setCodPostazione(Integer codPostazione) {
        this.CodPostazione = codPostazione;
    }

    public Integer getNum_posti() {
        return this.num_posti;
    }

    public void setNum_posti(Integer num_posti) {
        this.num_posti = num_posti;
    }

    public Laboratorio getCodL_fk() {
        return this.CodL_fk;
    }

    public void setCodL_fk(Laboratorio codL_fk) {
        this.CodL_fk = codL_fk;
    }
}
