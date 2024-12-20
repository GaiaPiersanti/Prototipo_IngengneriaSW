package logica.interfacce;

import dati.Contenuto;
import dati.Curatore;
import dati.Utente;

public class ServizioFabbricaInterfacce {
	public static <T extends Utente> InterfacciaUtente<? extends Utente>  getInterfaccia(T utente) {
		InterfacciaUtente p=new VistaRegistrati();
		if (utente instanceof Utente )
		p=new VistaRegistrati();

		if (utente instanceof Curatore)
			p = new VistaCuratori(); 
		return p;

	}

}
