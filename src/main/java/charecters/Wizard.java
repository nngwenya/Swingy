package charecters;


public class Wizard extends Hero {

	public Wizard(String name) {
		super(name);
		setType("Wizard");
		level = 0;
		experience = 122;
		setAttack(40);
		setDefense(20);
		setHit_points(100);
		
	}

}
