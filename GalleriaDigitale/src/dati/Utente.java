package dati;
import java.util.*;
public class Utente extends Contenuto {
	public Utente(String id, String nome, String mail,String pwd, List<String> preferenze) {
		super(id, nome);
		this.mail = mail;
		this.pwd = pwd;
		this.preferenze = preferenze;
	}
	private String pwd;
	private String mail;
List<String> preferenze;
}
