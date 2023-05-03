package DTO;

import java.time.*;

public class Prenotazione {
    private Integer CodPrenotazione;
    private LocalDate data_prenotazioneS;
    private LocalTime ora_prenotazioneS;
    private Duration tempo_utilizzoS;
    private Utente Username_fk;
    Strumento CodStrumento_fk;

    public Prenotazione(Integer CodPrenotazione, LocalDate data_prenotazioneS, LocalTime ora_prenotazioneS, Duration tempo_utilizzoS, String Username_fk, Integer CodStrumento_fk) {
        this.CodPrenotazione = CodPrenotazione;
        this.data_prenotazioneS = data_prenotazioneS;
        this.ora_prenotazioneS = ora_prenotazioneS;
        this.tempo_utilizzoS = tempo_utilizzoS;
        this.Username_fk = Username_fk;
        this.CodStrumento_fk = CodStrumento_fk;
    }

    public Integer getCodPrenotazione() {
        return this.CodPrenotazione;
    }

    public void setCodPrenotazione(Integer codPrenotazione) {
        this.CodPrenotazione = codPrenotazione;
    }

    public LocalDate getData_prenotazioneS() {
        return this.data_prenotazioneS;
    }

    public void setData_prenotazioneS(LocalDate data_prenotazioneS) {
        this.data_prenotazioneS = data_prenotazioneS;
    }

    public LocalTime getOra_prenotazioneS() {
        return this.ora_prenotazioneS;
    }

    public void setOra_prenotazioneS(LocalTime ora_prenotazioneS) {
        this.ora_prenotazioneS = ora_prenotazioneS;
    }

    public Duration getTempo_utilizzoS() {
        return this.tempo_utilizzoS;
    }

    public void setTempo_utilizzoS(Duration tempo_utilizzoS) {
        this.tempo_utilizzoS = tempo_utilizzoS;
    }

    public String getUsername_fk() {
        return this.Username_fk;
    }

    public void setUsername_fk(String username_fk) {
        this.Username_fk = username_fk;
    }

    public Integer getCodStrumento_fk() {
        return this.CodStrumento_fk;
    }

    public void setCodStrumento_fk(Integer codStrumento_fk) {
        this.CodStrumento_fk = codStrumento_fk;
    }
}
