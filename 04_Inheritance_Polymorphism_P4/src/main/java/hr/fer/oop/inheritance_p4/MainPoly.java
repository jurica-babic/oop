package hr.fer.oop.inheritance_p4;

public class MainPoly {
	public static void main(String[] args) {
		
		Person[] osobe = new Person[3]; 
		
		//Person p = new Person("Lucija", "Arlesic");
		
		
		System.out.println("Ispis bi trebao biti ovdje:");
		Student s0 = new UndergradStudent("3434", "Studen1", "Prezime", 18);
		Student s = new UndergradStudent("123", "Igor", "Modric", 20);
		Lecturer l = new Lecturer("4554", "Jurica", "Mamic", "Jurinho");
		
		System.out.println("To string za s0");
		System.out.println(s0);
		
		// polimorfizam
		osobe[0] = s0;
		osobe[1] = s;
		osobe[2] = l;
		
		int i=0;
		for(Person osoba : osobe) {
			System.out.println(i++);
			System.out.println(osoba.getPersonType());
			
		
		}
		
		
	}
}
