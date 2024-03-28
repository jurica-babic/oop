package hr.fer.oop.inheritance_p4;

public class MainEnum {
	
	public static void main(String[] args) {
		
		Lecturer l = new Lecturer("123", "Josipa", "Salamander", "sale");
		
		//l.setLecturerType("REDOVITI");
		
		l.setLecturerType(LecturerType.REDOVITI);

		System.out.println(l.getLecturerType());
		
		//l.setLecturerType("VANJSKI_dgdgtgfthfhfz");
		
		l.setLecturerType(LecturerType.VANJSKI);
		
		switch (l.getLecturerType()) {
		case REDOVITI:
			System.out.println("Hej, ja sam redovita!!!");
			break;
		case VANJSKI:
			System.out.println("Znas sto, ja sam vanjska");
			break;
		default:
			break;
		}
		
		System.out.println(l.getLecturerType());
		
		
		
		
	}

}
