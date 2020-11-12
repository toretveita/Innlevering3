package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	int id;
	String bruker;
	String dato;
	int likes;
	
	
	
	public Innlegg() {
		
	}
	
	public Innlegg(int Id, String Bruker, String Dato) {

		// TODO 
		id = Id;
		bruker = Bruker;
		dato = Dato;
	}

	public Innlegg(int Id, String Bruker, String Dato, int Likes) {

		// TODO - START
		
		id = Id;
		bruker = Bruker;
		dato = Dato;
		likes = Likes;
		
		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String Bruker) {
		bruker = Bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String Dato) {
		dato = Dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes = likes + 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		int ID = innlegg.getId();
		if (id == ID){
		return true;
		}
		else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		
		String str;
		str = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return str;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
