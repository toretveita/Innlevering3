package no.hvl.dat100.jplab11.oppgave4;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String filbane = mappe + "/" + filnavn;
		Innlegg[] innleggtabell = samling.getSamling();
		String content = innleggtabell.toString();
		try (Files.writeString(filbane, content, StandardCharsets.UTF_8)) {
		} catch (IOException ex) {
			return false;
			
		}
		return true;
		
	}
}
