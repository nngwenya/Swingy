package model;

import model.Storage;
import artifacts.Armor;
import artifacts.Weapon;
import model.Elf;
import model.Enemy;
import model.Flash;
import model.Hero;
import model.Knight;
import model.SuperGirl;
import model.Wizard;
import util.CharacterFactory;
import view.*;
import view.PlayerStats;
import controller.*;

public class HeroType {
	
	public static String heroTypeToStr(int type) {
		if (type == 1) {
			return "Elf";
		}else if (type == 2) {
			return "Flash";
		}else if (type == 3) {
			return "Knight";
		}else if (type == 4) {
			return "SuperGirl";
		}else if (type == 5) {
			return "Wizard";
		}else
			return null;
		
	}
	
    public static void _type(String name) 
    {
    	int heroValue;
    	System.out.println("\n##########CHOOSE HERO WANT TO BE###########\n");
    	System.out.println("1.Elf");
    	System.out.println("2.Flash");
    	System.out.println("3.Knight");
    	System.out.println("4.SuperGirl");
    	System.out.println("5.Wizard");
    	System.out.println("6.Exit");
    	heroValue = Keyin.inInt(" Select option : ");
    	
    	String type = heroTypeToStr(heroValue);
    	
    	Hero hero = CharacterFactory.newCharacter(name, type);
    	Weapon weapon = new Weapon();
		Armor armor = new Armor();
    	
    	if (heroValue == 6) {
    		System.exit(0);
    	}
    	
    	PlayerStats.printstats(hero);
    	Storage.Openfile();
    	String str = hero.getType() + "," + hero.getName() + "," + hero.getLevel() + "," + hero.getHit_points() + "," + hero.getAttack() + "," + hero.getDefense() + "," + weapon.getWeapon(hero) + "," + armor.getArmor(hero) ;
        Storage.writeToFile(str);
    	
        Storage.closefile();
    	
    	int select;
    	System.out.println("\n");
    	System.out.println("1.Start Game");
    	System.out.println("2.Exit");
    	select = Keyin.inInt("Select option : ");
    	
    	switch (select) {
    	case 1:
			System.out.println("\n##########START GAME###########\n");
			Level.levelUp(hero);
        	
    	case 2:
    		System.exit(0);
    		break;
    	default:
    	    System.out.println("Invalid selection");
    	    break; 
    	}
    	}
    	
    


}
