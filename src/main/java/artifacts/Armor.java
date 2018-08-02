package artifacts;

import java.util.Random;

import charecters.Hero;

public class Armor {
	public static Armor armor = new Armor();
	public static String[] shield = {"Red cape", "Leather jacket", "Sheild","Gold armor", "invisible blanket"};
	
	public Armor(){
		
	}
	
	public String getArmor(Hero hero) {
		Random rand = new Random();
		
		int randSheild = rand.nextInt(4);
		return shield[randSheild];
	}

}
