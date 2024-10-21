package it.marcoschiavo.generalizzazione;

import it.marcoschiavo.generalizzazione.*;
public class Main {


	public static void main(String[] args) {
		Amministrativo a = new Amministrativo("Marco", "Schiavo", "3276774029", "SCHMRC81E05F839N");
		System.out.println(a.getNome());
		System.out.println(a.getNumSwUtilizzati());
		a.addSoftware("Excel");
		a.addSoftware("Word");
		a.addSoftware("Power Point");
		a.addSoftware("Pages");
		a.addSoftware("Illustrator");
		a.removeSoftware("illustrator");
		a.changeSoftware("Word","Ciao");
		System.out.println(a.getNumSwUtilizzati());
		int i = 0;
		while(i < a.getNumSwUtilizzati()) {
			System.out.println(a.getSwUtilizzati()[i]);
			i++;
		}
		
		
	}

}
