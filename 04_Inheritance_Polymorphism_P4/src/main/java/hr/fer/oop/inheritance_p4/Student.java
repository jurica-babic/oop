package hr.fer.oop.inheritance_p4;


/**
 * Student "je" osoba.
 * Student "is a " person.
 * Posljedicno: student moze naslijediti osobu: "extends Person" 
 */
public class Student extends Person {
	// jmbag se ne mijenja, zato final
	private final String jmbag;

	private int age;
	private double points;

	public Student(String jmbag, int age) {
		// super() - uociti da nismo pisali super, racunati da ce se automatski dodati super(), ali samo ako postoji prazan konstruktor u baznoj klasi (konkretno: Person() )
		this.jmbag = jmbag;
		this.age = age;
	}

	public Student(String jmbag, String firstname, String lastname, int age) {
		// prvo: pozovi odgovarajuci konstruktor bazne klase, aka Person
		super(firstname, lastname);

		// drugo: napravi sto hoces, tj. inicijaliziraj preostale atribute specificne za studenta
		this.jmbag = jmbag;
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public String getJmbag() {
		return jmbag;
	}

	public double getPoints() {
		return points;
	}

	@Override
	public String toString() {

		// drugi nacin primjene kljucne rijeci super: poziv metode iz bazne klase
		// motivacija: Zelimo da tekstualna reprezentacija studenta bude "Moje ime je ime prezime" (vidi metodu toString() u Person) i nakon toga kaze da je student.
		
		// RJESENJE:
		
		// Korak 1: najprije pozovi implementaciju toString() od bazne klase
		String stringOdBazneImplementacije = super.toString();
		
		// Korak 2: nalijepi tekst ovisno sto zelis
		String output = stringOdBazneImplementacije + "Ja sam student!";

		// Korak 3: vrati String jer se to trazi od metode toString
		return output;
	}
	
	
	/**
	 * Naslijedili i nadjacali metodu. Student ce najprije izjaviti:
	 * "Ja sam ime prezime" (vidi super.talk())
	 * i nakon toga ce izjaviti
	 * "OFC"
	 */
	@Override
	public void talk() {
		super.talk();
		System.out.println("OFC!");
	}
	
	public void setPoints(double points) {
		this.points = points;
	}
	
	/**
	 * Nadjacali metodu equals koju smo naslijedili od klase Object.
	 * Logika koju smo dogovorili: dva studenta su jednaka ako im je JMBAG jednak 
	 * 
	 * Pretpostavljamo da ce korisnici ove klase uvijek koristiti studenta kao parametar.
	 * Upozorenje: sto ako pozovu ovu metodu s nekim predavacem? ili Stringom? ili null?
	 */
	@Override
	public boolean equals(Object obj) {
		// korak 1: downcastaj obj na studenta
		Student other = (Student) obj;
		// korak 2: provjeri i vrati rezultat
		
		boolean jesmoLiJednaki = jmbag.equals(other.jmbag);
		
		return jesmoLiJednaki;
		
	}

}
