package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int Id, String Bruker, String Dato, String Tekst) {
		super(Id, Bruker, Dato);
		tekst = Tekst;
	}
	
	public Tekst(int Id, String Bruker, String Dato, int Likes, String Tekst) {
		super(Id, Bruker, Dato, Likes);
		tekst = Tekst;
	}
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String Tekst) {
		tekst = Tekst;
	}

	@Override
	public String toString() {
		String str;
		str = super.toString();
		str = "TEKST" + "\n" + str + tekst + "\n";
		return str;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
