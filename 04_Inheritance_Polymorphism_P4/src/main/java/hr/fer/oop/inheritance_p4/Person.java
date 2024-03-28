package hr.fer.oop.inheritance_p4;

/**
 * Primjer bazne klase (nadklase, klase roditelj, super klase). 
 */
public abstract class Person  {
	private String firstname;
	private String lastname;
	
	public static final String DEF_NAME = "Antonio";
	public static final String DEF_LASTNAME = "Zivkovic";
	
	/**
	 * Prema UN-ovoj deklaraciji, svatko ima pravo na slobodu izrazavanja (clanak 19):
	 * https://www.un.org/en/about-us/universal-declaration-of-human-rights,
	 * neka ova metoda bude hello world primjer toga.
	 */
	public void talk() {
		System.out.println("Ja sam "+firstname + " "+ lastname);
	}
	
	/**
	 * Konstruktor koji poziva drugi konstruktor unutar klase Person koristeci "this"
	 */
	public Person() {
		this(DEF_NAME, DEF_LASTNAME);
	} 
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("ispis iz person konstruktora:"+getPersonType());
	}
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	
	/**
	 * Formatirani ispis u obliku Stringa. Primjer metode koju smo naslijedili od klase Object.
	 * Ovdje smo ju odlucili nadjacati i promijeniti implementaciju.
	 */
	@Override
	public String toString() {
		String tipOsobe = getPersonType();
		return String.format("Moje ime je %s %s. Tip osobe: %s %n", firstname, lastname, tipOsobe);
	}
	
	public abstract String getPersonType();

}
