package model;


public class Elf extends Hero{
	
	public Elf(String name){
		super(name);
		setType("Elf");
		setLevel(2);
		setExperience(120);
		setAttack(10);
		setDefense(30);
		setHit_points(100);
	
	}
}