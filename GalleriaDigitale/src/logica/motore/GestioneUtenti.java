package logica.motore;

import dati.Utente;
import java.util.List;

import dati.Utente;
import permanenzaDati.GestoreDati;
import permanenzaDati.InterfacciaDatabase;

public class GestioneUtenti {
	static Integer conteggio=0;
	public GestioneUtenti(InterfacciaDatabase d) {

		this.d = d;
	}

	InterfacciaDatabase d;

	public Utente autentica(String id, String pwd) {
		Utente u = null;
		if (d.verifica(id))
			u = (Utente) d.preleva(id);

		return u;

	}

	public boolean registraUtente(String nome, String mail, String pwd) {
		String id= Integer.toString(++conteggio);
		d.inserisci(new Utente(id, nome, mail, pwd, null));
		if (d.verifica(id))
			return true;
		else
			return false;
	}

}
