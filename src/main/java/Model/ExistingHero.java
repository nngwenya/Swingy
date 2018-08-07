package Model;

import java.io.IOException;

import artifacts.Armor;
import artifacts.Weapon;
import charecters.Enemy;
import charecters.Hero;
import main.Keyin;
import util.CharacterFactory;
import view.Map;
import view.PlayerStats;

public class ExistingHero {
	
	public static void _typeofHero() 
    {
 	
    	Hero hero = null; 
    	Weapon weapon = new Weapon();
    	Armor armor = new Armor();
    	
    	//PlayerStats.printstats(hero);
    	Storage.Openfile();
    	
       // Storage.getLinesCount();
		//Storage.ReadLine();
		Storage.SplitLine();
    	
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
    		break;
    	default:
    	    System.out.println("Invalid selection");
    	    break; 
    	}
    	}
    	
    

}
