package logica.interfacce;

import java.util.ArrayList;

import dati.Contenuto;
import dati.Utente;
import logica.motore.GestioneUtenti;
import permanenzaDati.InterfacciaDatabase;

public class VistaRegistrati implements InterfacciaUtente<Contenuto> {
	public VistaRegistrati() {
		super();
		// TODO Auto-generated constructor stub
	}

	GestioneUtenti u;
	InterfacciaDatabase d;

	public VistaRegistrati(GestioneUtenti u, InterfacciaDatabase d) {

		this.u = u;
		this.d = d;
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
	public void vista() {while (true) {
		System.out.println("Benvenuto nella  Galleria Digitale 0.0 ");
		System.out.println("questa è la pagina per utenti registrati");
		System.out.println("cosa vuoi fare?");
		System.out.println("Digita un'opzione e premi invio:");
		System.out.println("1. per la promozione a curatore ");
		System.out.println("2.  per fruire dei contenuti ");
		System.out.println("3.  per uscire");

		int c = RigaDiComandoSingleton.getIstanza().leggiInteroAmmissibile(new Integer[] { 1, 2, 3 });
		switch (c) {
		case 1:
			System.out.println("va bene!!");
			System.out.println("digita il  nome utente e premi invio");
			String nome = RigaDiComandoSingleton.getIstanza().leggiLinea();
			System.out.println("digita la tua email utente e premi invio");
			String mail = RigaDiComandoSingleton.getIstanza().leggiLinea();
			System.out.println("digita la password utente e premi invio");
			String pwd = RigaDiComandoSingleton.getIstanza().leggiLinea();
			if (u.registraUtente(nome, mail, pwd))
				System.out.println("la registrazione è andata a buon fine");
			/// FABBRICA INTERFACCIA
			// LANCIA INTERFACCIA
			else
				System.out.println("la procedura di registrazione è fallita");

			break;
		case 2:
			System.out.println("va bene!!");
			System.out.println("digita il  nome utente e premi invio");
			String nomeu = RigaDiComandoSingleton.getIstanza().leggiLinea();
			System.out.println("digita la password utente e premi invio");
			String pwdu = RigaDiComandoSingleton.getIstanza().leggiLinea();
			Utente user = u.autentica(nomeu, pwdu);
			/// FABBRICA INTERFACCIA
			// LANCIA INTERFACCIA
			break;
		case 3:
			System.out.println("Caso 3: La variabile c è uguale a 3.");
			break;
		default:
			System.out.println("Caso predefinito: La variabile c non corrisponde a nessuno dei casi.");
		}
	}
		
		
	}

	public GestioneUtenti getU() {
		return u;
	}

	public void setU(GestioneUtenti u) {
		this.u = u;
	}

	public InterfacciaDatabase getD() {
		return d;
	}

	public void setD(InterfacciaDatabase d) {
		this.d = d;
	}

	@Override
	public void setDati(InterfacciaDatabase g, GestioneUtenti u) {
		// TODO Auto-generated method stub
		
	}

}
