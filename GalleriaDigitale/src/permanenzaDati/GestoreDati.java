package permanenzaDati;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import dati.Contenuto;

public class GestoreDati implements InterfacciaDatabase,Serializable  {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Map <String,Contenuto> map =new HashMap<>();

	@Override
	public void inserisci(Contenuto c) {
		map.put(c.getId(), c);
		
	}

	@Override
	public void rimuovi(Contenuto c) {
		map.remove(c.getId());
		
	}

	@Override
	public void aggiorna(Contenuto c) {
		map.replace(c.getId(), c);
		
	}

	@Override
	public Contenuto preleva(String s) {
		return map.get(s);
	}

	@Override
	public Boolean verifica(String s) {
		return map.containsKey(s);
	}

}
