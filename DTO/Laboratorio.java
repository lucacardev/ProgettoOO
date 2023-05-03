package DTO;

import java.time.LocalTime;

public class Laboratorio {
	
	private String CodL;
	private String descrizione;
	private LocalTime orario_apertura;
	private LocalTime orario_chiusura;
	private Integer num_tecnici;
	private Integer num_postazioni;
	
	public Laboratorio(String codL, String descrizione, LocalTime oraInizio, LocalTime oraFine, int numTecnici, int numPostazioni) {
        this.CodL = codL;
        this.descrizione = descrizione;
        this.orario_apertura = oraInizio;
        this.orario_chiusura = oraFine;
        this.num_tecnici = numTecnici;
        this.num_postazioni = numPostazioni;
    }

//GETTERS E SETTERS
	
	public String getCodL() {
		return CodL;
	}


	public void setCodL(String codL) {
		this.CodL = codL;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	
	public LocalTime getOrario_apertura() {
		return orario_apertura;
	}


	public void setOrario_apertura(LocalTime orario_apertura) {
		this.orario_apertura = orario_apertura;
	}


	public LocalTime getOrario_chiusura() {
		return orario_chiusura;
	}


	public void setOrario_chiusura(LocalTime orario_chiusura) {
		this.orario_chiusura = orario_chiusura;
	}

	public Integer getNum_tecnici() {
		return num_tecnici;
	}


	public void setNum_tecnici(Integer num_tecnici) {
		this.num_tecnici = num_tecnici;
	}

	
	public Integer getNum_postazioni() {
		return num_postazioni;
	}

	
	public void setNum_postazioni(Integer num_postazioni) {
		this.num_postazioni = num_postazioni;
	}
}
