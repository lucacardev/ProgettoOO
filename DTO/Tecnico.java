package DTO;

public class Tecnico {
	
	private String matricola;
	private String nome;
	private String cognome;
	private String codfiscale;
	private String telefono;
	private Laboratorio codl_fk;
	
	public Tecnico (String matricola,String nome,String cognome,String codfis,String tel,Laboratorio lab) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.codfiscale = codfis;
		this.telefono = tel;
		this.laboratorio = lab;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodfiscale() {
		return codfiscale;
	}

	public void setCodfiscale(String codfiscale) {
		this.codfiscale = codfiscale;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	
}
