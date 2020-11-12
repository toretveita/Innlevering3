package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	String url;
	
	public Bilde(int Id, String Bruker, String Dato, String Tekst, String Url) {
		super(Id, Bruker, Dato, Tekst);
		url = Url;
		
	}

	public Bilde(int Id, String Bruker, String Dato, int Likes, String Tekst, String Url) {
		super(Id, Bruker, Dato, Likes, Tekst);
		url = Url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String Url) {
		url = Url;
	}

	@Override
	public String toString() {
		String str;
		str = super.toString();
		str = "BILDE" + "\n" + str + url + "\n";
		return str;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
