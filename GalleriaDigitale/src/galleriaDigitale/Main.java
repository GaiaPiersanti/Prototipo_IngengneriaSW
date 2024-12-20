package galleriaDigitale;

import logica.interfacce.VistaSconosciuti;
import logica.motore.GestioneUtenti;
import permanenzaDati.GestoreDati;
import permanenzaDati.InterfacciaDatabase;

public class Main {

	public static void main(String[] args) {
		InterfacciaDatabase d= new GestoreDati();
		GestioneUtenti g=new GestioneUtenti(d);
		VistaSconosciuti v = new VistaSconosciuti(g,d);
		v.vista();
	}

}
