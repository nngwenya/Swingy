package main;

import Model.Storage;
import artifacts.Armor;
import artifacts.Weapon;
import charecters.Enemy;
import charecters.Hero;
import util.CharacterFactory;
import view.Map;
import view.PlayerStats;

public class HeroType {
	
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
    	
    	Hero hero = CharacterFactory.newCharacter(name, heroValue);
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
    		Map.buildMap();
    		char[][] temp = new char[10][10];
    		
    		Enemy[] enemy = new Enemy[4];
    	
    		
    		for (int i = 0; i < 4; i++) {
    			enemy[i] = new Enemy(10,5,30,"zombie");
    			
    		}
    		hero.player();
    		
    		while (true)
    		{
    			Map.redrawMap();
        		int move;
            	System.out.println("\n");
            	System.out.println("1.North");
            	System.out.println("2.East");
            	System.out.println("3.South");
            	System.out.println("4.West");
            	move = Keyin.inInt("Select option : ");
            	
            	hero.movePlayer(hero, move);
    			
    		}
        	
    	case 2:
    		System.exit(0);
    		break;
    	default:
    	    System.out.println("Invalid selection");
    	    break; 
    	}
    	}
    	
    


}
