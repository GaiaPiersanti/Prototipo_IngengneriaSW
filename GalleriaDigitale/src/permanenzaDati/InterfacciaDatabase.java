package permanenzaDati;

import dati.Contenuto;

public interface  InterfacciaDatabase <T extends Contenuto> {
	public void inserisci (T c);
	public void rimuovi (T c);
	public void aggiorna (T c);
	public T preleva(String s);
public Boolean verifica(String s);
}
