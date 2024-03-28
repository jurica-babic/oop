package hr.fer.oop.inheritance_p4;

public class MainSucelje {
	
	public static void main(String[] args) {
		UndergradStudent s = new UndergradStudent("fsda", "Baby", "Lasagna", 28);
		
		Gamer gamer = s;
		
		gamer.play();
		gamer.setupGamingRig();
		
		
		Object o = s;
		
		if(o instanceof UndergradStudent) {
			System.out.println("cini se da je ovo under grad stude");
		}
		
		if(o instanceof Singer) {
			System.out.println("cini se da ovaj pjeva");
			
			Singer lokalniPjevac = (Singer) o;
			System.out.println("Pjeva lokalac");
			lokalniPjevac.sing();
			
		} else {
			System.out.println("nema vokalnih mogucnosti");
		}
		
		if(o instanceof String) {
			System.out.println("cini se da je ovaj objekt zapravo string");
		} else {
			System.out.println("nope, ovo nije string");
		}
		
		
		
		
		
		s.warmup();
		
		s.setupGamingRig();
		
		for(int i=0; i<5; i++) {
			s.sing();
			s.play();
		}
	}

}
