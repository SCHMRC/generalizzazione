package it.marcoschiavo.generalizzazione;

public class Utente {
	private String nome;
	private String cognome;
	private String telefono;
	private String cf;
	
	//costruttore vuoto
	public Utente() {}
	
	//costruttore con parametri
	public Utente(String nome, String cognome, String telefono, String cf) {
		setNome(cognome);
		setCognome(cognome);
		setTelefono(telefono);
		setCf(cf);
	}
	
	//costruttore copia
	public Utente(Utente u) {
		setNome(u.getNome());
		setCognome(u.getCognome());
		setTelefono(u.getTelefono());
		setCf(u.getCf());
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", cf=" + cf + "]";
	}
	
	
	

}
