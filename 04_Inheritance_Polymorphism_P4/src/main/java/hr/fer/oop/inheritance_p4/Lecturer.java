package hr.fer.oop.inheritance_p4;

/**
 * Hrv:
 * Predavac "je" osoba.
 * Engl:
 * Lecturer "is a" person.
 * 
 * Uociti "je" odnosno "is a". S ovim odnosom zakljucujemo da predavac moze naslijediti osobu.
 * U kodu je oznaceno s "extends Person"
 */
public class Lecturer extends Person implements Gamer {

	private final String mbz;
	private String nickname;
	
	private LecturerType lecturerType;

	public Lecturer(String mbz, String firstname, String lastname, String nickname) {
		// ako ne napišemo super onda ce dodati super(), ako postoji prazan konstruktor u klasi Person
		// u ovom slucaju stavljamo svoj super:
		super(firstname, lastname);
		
		// nakon toga inicijaliziramo atribute specificne za predavaca
		this.mbz = mbz;
		this.nickname = nickname;
	}
	
	public LecturerType getLecturerType() {
		return lecturerType;
	}
	
	public void setLecturerType(LecturerType lecturerType) {
		this.lecturerType = lecturerType;
	}
	
	

	public String getMbz() {
		return mbz;
	}

	public String getNickname() {
		return nickname;
	}
	
	/**
	 * Predavac ce naslijediti talk() od Persona. Nije nam se svidjelo sto izgovara "Ja sam ime prezime." pa smo se odlucili za nadjacavanje odnosno overriding.
	 * Promijenili smo implementaciju metode talk() koja pita studente je li sve jasno.
	 */
	@Override
	public void talk() {
		System.out.println("Je li sve jasno, dragi studenti?");
	}
	
	@Override
	public String getPersonType() {
		return "Lecturer";
	}

	@Override
	public void setupGamingRig() {
		System.out.println("postavio monitor i komp!");
		
	}

	@Override
	public void play() {
		System.out.println("igram vockice");
		
	}

}
