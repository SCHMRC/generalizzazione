package it.marcoschiavo.generalizzazione;

public class Amministrativo extends Utente{
	private final int numeroSw = 5;
	private String swUtilizzati[];

	public Amministrativo() {}
	
	public Amministrativo(String nome, String cognome, String telefono, String cf) {
		super(nome,cognome,telefono,cf);
		this.swUtilizzati = new String[this.numeroSw];
	}
	
	public Amministrativo(Amministrativo a) {
		super(a);
		setSwUtilizzati(a.getSwUtilizzati());
		
	}
	public String[] getSwUtilizzati() {
		return this.swUtilizzati;
	}

	public int getNumSwUtilizzati() {
		int length = 0;
		for(int i = 0 ; i < this.numeroSw ; i++) {
			if(this.swUtilizzati[i] != null && this.swUtilizzati[i].length() > 0) {
				length++;
			};
		}
		return length;
	}

	public void setSwUtilizzati(String[] swUtilizzati) {
		this.swUtilizzati = swUtilizzati;
	}
	
	public int addSoftware(String sw) {
		int length = getNumSwUtilizzati();
		if(length < this.numeroSw) {
			this.swUtilizzati[length] = sw;
			return 0;
		}
		return -1;// Indica che il limite è stato raggiunto
	}
	
	public int removeSoftware(String sw) {
		int i = 0;
		//cerca all'interno dell'elenco il software
		for( ; i < this.numeroSw ; i++ ) {
			//se lo trovi elimina la stringa
			if(this.swUtilizzati[i].equalsIgnoreCase(sw)) {
				this.swUtilizzati[i] = "";
				break;
			}
		}
		//se il software era nell'elenco
		if(i<this.numeroSw) {
			//sposta tutti gli elementi dell'elenco
			while(i < this.numeroSw && i != this.numeroSw-1) {
				this.swUtilizzati[i] = this.swUtilizzati[i+1];
				i++;
			}
			//assegna all'ultimo elemento dell'elenco una stringa vuota
			this.swUtilizzati[i] = "";
		}else {
			return -1;//il software NON era nell'elenco
		}


		return 0;
	}

	public boolean changeSoftware(int index, String sw) {
		this.swUtilizzati[index] = sw;
		return false;
	}
	
	public boolean changeSoftware(String sw, String newSw) {
		int index = getIndex(sw);
		if(index >= 0) {
			this.swUtilizzati[index] = newSw;
		}
			
		
		return false;
	}
	
	private int getIndex(String sw) {
		int index = -1;
		for(String item : this.swUtilizzati) {
			if(sw.equalsIgnoreCase(item)) {
				break;
			}
			index++;
		}
		return index+1;
	}
	
	
}
