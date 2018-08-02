package charecters;


public class Elf extends Hero{
	
	public Elf(String name){
		super(name);
		setType("Elf");
		level = 0;
		experience = 120;
		setAttack(10);
		setDefense(30);
		setHit_points(100);
	
	}
}