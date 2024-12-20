package logica.interfacce;

import java.util.ArrayList;

import dati.Contenuto;
import logica.motore.GestioneUtenti;
import permanenzaDati.InterfacciaDatabase;

public class VistaCuratori implements InterfacciaUtente<Contenuto> {

	public VistaCuratori() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Contenuto> getContenuti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Contenuto> cerca(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void vista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDati(InterfacciaDatabase g, GestioneUtenti u) {
		// TODO Auto-generated method stub
		
	}

}
