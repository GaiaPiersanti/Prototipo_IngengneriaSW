package logica.interfacce;

import java.util.ArrayList;

import dati.Contenuto;
import dati.Utente;
import logica.motore.GestioneUtenti;
import permanenzaDati.InterfacciaDatabase;

public class VistaSconosciuti implements InterfacciaUtente<Contenuto> {
	GestioneUtenti u;
	InterfacciaDatabase d;

	public VistaSconosciuti(GestioneUtenti u, InterfacciaDatabase d) {

		this.u = u;
		this.d = d;
	}

	@Override
	public void vista() {
		while (true) {
			System.out.println("Benvenuto nella Galleria Digitale 0.0 ");
			System.out.println("questa è la pagina per utenti NON registrati");
			System.out.println("cosa vuoi fare?");
			System.out.println("Digita un'opzione e premi invio:");
			System.out.println("1. per Registrarti");
			System.out.println("2.  per Autenticarti");
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
				if (u.registraUtente(nome, mail, pwd)) {
					System.out.println("la registrazione è andata a buon fine");
				
				System.out.println("adesso fai il log in");
				System.out.println("digita il  nome utente e premi invio");
				String nomeu = RigaDiComandoSingleton.getIstanza().leggiLinea();
				System.out.println("digita la password utente e premi invio");
				String pwdu = RigaDiComandoSingleton.getIstanza().leggiLinea();
				Utente user = u.autentica(nomeu, pwdu);
				/// FABBRICA INTERFACCIA
				InterfacciaUtente i=ServizioFabbricaInterfacce.getInterfaccia(user);
				// LANCIA INTERFACCIA
				i.vista();
				// LANCIA INTERFACCIA
				
				}
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
				InterfacciaUtente i=ServizioFabbricaInterfacce.getInterfaccia(user);
				//SETTAGGIO INTERFACCA
				i.setDati(d, u);
				// LANCIA INTERFACCIA
				i.vista();
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

	@Override
	public ArrayList<Contenuto> getContenuti() {

		return null;
	}

	@Override
	public ArrayList<Contenuto> cerca(String s) {

		return null;
	}

	@Override
	public void setDati(InterfacciaDatabase g, GestioneUtenti u) {
		// TODO Auto-generated method stub
		
	}

}
