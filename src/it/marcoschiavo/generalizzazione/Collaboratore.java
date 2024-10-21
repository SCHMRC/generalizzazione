package it.marcoschiavo.generalizzazione;

public class Collaboratore extends Utente{
	private String mansione;

	
	public Collaboratore() {}
	
	public Collaboratore(String nome,String cognome,String telefono,String cf, String mansione) {
		super(nome,cognome,telefono,cf);
		setMansione(mansione);
	}
	
	public Collaboratore(Collaboratore c) {
		super(c);
		setMansione(c.getMansione());
	}
	
	

	public String getMansione() {
		return mansione;
	}

	public void setMansione(String mansione) {
		this.mansione = mansione;
	}

	@Override
	public String toString() {
		return "Collaboratore [mansione=" + mansione + "]";
	}
	
	

	
}
