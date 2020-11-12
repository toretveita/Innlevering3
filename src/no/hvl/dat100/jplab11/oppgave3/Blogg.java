package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggtabell;
	int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		int antall = 0;
		for (int i = 0; i < innleggtabell.length; i++) {
			antall = antall + 1;
		}
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if(innleggtabell[i].getId() == innlegg.getId()) {
				return innleggtabell[i].getId();
			}
			}
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if(innleggtabell[i].getId() == innlegg.getId()) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] == null) {
				return true;
			}
		}
		return false;
		}

	
	public boolean leggTil(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] == null) {
				innleggtabell[i] = innlegg;
				return true;
			}
		}
		return false;
		
	}
	
	public String toString() {
		String str = null;
		for (int i = 0; i < innleggtabell.length; i++) {
			str = str + "\n" + innleggtabell[i].getClass() + "\n" + innleggtabell[i].getId() + "\n" + innleggtabell[i].getBruker() + "\n" + innleggtabell[i].getDato() + "\n" + innleggtabell[i].getLikes();
		
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}