package logica.interfacce;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Questa classe rappresenta un'istanza singleton per leggere input da riga di
 * comando. Implementa l'interfaccia Closeable per garantire la chiusura
 * corretta delle risorse.
 */

public class RigaDiComandoSingleton implements Closeable {

	private Scanner scanner = new Scanner(System.in);

	private static RigaDiComandoSingleton rdc = new RigaDiComandoSingleton();

	/**
	 * Ottiene l'istanza singleton della classe.
	 * 
	 * @return l'istanza singleton della classe
	 */

	public static RigaDiComandoSingleton getIstanza() {
		return rdc;
	}

	/**
	 * Restituisce lo scanner associato all'istanza.
	 * 
	 * @return scanner associato all'istanza
	 */

	public Scanner getScanner() {
		return scanner;
	}

	/**
	 * Chiude lo scanner.
	 */

	public void chiudiScanner() {
		scanner.close();
	}

	/**
	 * Legge una stringa da riga di comando.
	 * 
	 * @return la stringa letta
	 */

	String leggiStringa() {
		return scanner.next();
	}

	/**
	 * Legge un intero da riga di comando.
	 * 
	 * @return l'intero letto
	 */

	Integer leggiInteger() {
		return scanner.nextInt();
	}

	/**
	 * Legge una linea da riga di comando.
	 * 
	 * @return la linea letta
	 */

	String leggiLinea() {
		return scanner.nextLine();
	}

	@Override
	public void close() throws IOException {
		scanner.close();
	}

	/**
	 * Legge un intero ammissibile da riga di comando, accettando solo valori tra
	 * quelli specificati.
	 * 
	 * @param valoriAmmissibili gli interi ammissibili
	 * @return l'intero letto
	 */

	public Integer leggiInteroAmmissibile(Integer[] valoriAmmissibili) {
		while (true) {
			try {
				Integer scelta = RigaDiComandoSingleton.getIstanza().leggiInteger();
				if (Arrays.stream(valoriAmmissibili).anyMatch(x -> x == scelta)) {
					scanner.nextLine();
					return scelta;
				}
			} catch (InputMismatchException e) {
				System.out.println("Scelta inammissibile,inserici un valore tra quelli suggeriti");
				scanner.nextLine();

			}
		}
	}

}
