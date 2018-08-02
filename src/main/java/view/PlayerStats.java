package view;

import artifacts.Armor;
import artifacts.Weapon;
import charecters.Hero;

public class PlayerStats {
	
	public static void printstats(Hero hero) {
		Weapon weapon = new Weapon();
		Armor armor = new Armor();
		
			System.out.println("\n##########HERO STATS###########\n");
			System.out.println("Name :" + hero.getName() );
			System.out.println("Healht :" + hero.getHit_points());
			System.out.println("Level :" + hero.getLevel());
			System.out.println("Attack :" + hero.getAttack());
			System.out.println("Defense :" + hero.getDefense());
			System.out.println("Weapon :" + weapon.getWeapon(hero));
			System.out.println("Armor :" + armor.getArmor(hero));
	}

}
