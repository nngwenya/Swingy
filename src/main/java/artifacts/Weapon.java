package artifacts;

import java.util.Random;

import charecters.Hero;

public class Weapon {
	public static Weapon weapon = new Weapon();
	public static String[] firearm = {"Gun", "Bomb", "Sword","Lazer", "Black magic"};
	
	public Weapon(){
		
	}
	
	public String getWeapon(Hero hero) {
		Random rand = new Random();
		
		int randWeapon = rand.nextInt(4);
		return firearm[randWeapon];
	}

}
