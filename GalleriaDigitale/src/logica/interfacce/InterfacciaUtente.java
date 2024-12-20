package logica.interfacce;

import java.util.ArrayList;

import dati.Contenuto;
import logica.motore.GestioneUtenti;
import permanenzaDati.GestoreDati;
import permanenzaDati.InterfacciaDatabase;

public interface InterfacciaUtente<T extends Contenuto> {
	public ArrayList<T> getContenuti();

	public ArrayList<T> cerca(String s);
  public void setDati(InterfacciaDatabase g,GestioneUtenti u);
	public void vista();
}
