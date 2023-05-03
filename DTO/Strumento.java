package DTO;

import java.time.*;

public class Strumento {
	
	private Integer CodStrumento;
	private String caratteristiche_tecniche;
	private String descrizione;
	private Duration tempoMaxUso;
	private Postazione CodPostazione_fk;
	private Sede CodSede_fk;
	
	public Strumento (Integer codStrumento,String car_tec,String descrizione,Duration tempoMuso, Postazione codp_fk,Sede cods_fk) {
		this.CodStrumento = codStrumento;
		this.caratteristiche_tecniche = car_tec;
		this.descrizione = descrizione;
		this.tempoMaxUso = tempoMuso;
		this.CodPostazione_fk = codp_fk;
		this.CodSede_fk = cods_fk;
	}

//GETTERS E SETTERS
	public Integer getCodStrumento() {
		return CodStrumento;
	}

	public void setCodStrumento(Integer codStrumento) {
		this.CodStrumento = codStrumento;
	}

	public String getCaratteristiche_tecniche() {
		return caratteristiche_tecniche;
	}

	public void setCaratteristiche_tecniche(String caratteristiche_tecniche) {
		this.caratteristiche_tecniche = caratteristiche_tecniche;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Duration getTempoMaxUso() {
		return tempoMaxUso;
	}

	public void setTempoMaxUso(Duration tempoMaxUso) {
		this.tempoMaxUso = tempoMaxUso;
	}

	public Postazione getCodPostazione_fk() {
		return CodPostazione_fk;
	}

	public void setCodPostazione_fk(Postazione codPostazione_fk) {
		CodPostazione_fk = codPostazione_fk;
	}

	public Sede getCodSede_fk() {
		return CodSede_fk;
	}

	public void setCodSede_fk(Sede codSede_fk) {
		CodSede_fk = codSede_fk;
	}
	
	

}
