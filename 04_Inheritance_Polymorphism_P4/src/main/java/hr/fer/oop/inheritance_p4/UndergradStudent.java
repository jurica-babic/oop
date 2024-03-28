package hr.fer.oop.inheritance_p4;

public class UndergradStudent extends Student implements Singer {

	public UndergradStudent(String jmbag, String firstname, String lastname, int age) {
		super(jmbag, firstname, lastname, age);
		
	}

	@Override
	public String getPersonType() {
		
		return "UndergradStudent";
	}

	@Override
	public void sing() {
		System.out.println("Rim tim tagi dim");
	}

	@Override
	public void warmup() {
		System.out.println("La LA LA LA A LA");
		
		
	}




	
	

}
