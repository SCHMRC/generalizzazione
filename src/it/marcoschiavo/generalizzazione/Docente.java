package it.marcoschiavo.generalizzazione;

public class Docente extends Utente{
	private String classeConcorso;
	
	public Docente() {}

	public Docente(String nome,String cognome,String telefono,String cf,String classeConcorso) {
		super(nome,cognome,telefono,cf);
		this.classeConcorso = classeConcorso;
	}
	
	public Docente(Docente d) {
		super(d);
		setClasseConcorso(d.getClasseConcorso());
	}

	public String getClasseConcorso() {
		return classeConcorso;
	}

	public void setClasseConcorso(String classeConcorso) {
		this.classeConcorso = classeConcorso;
	}
	
	

}
