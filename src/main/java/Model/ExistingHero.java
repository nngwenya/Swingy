package model;

import java.util.ArrayList;
import java.util.List;

import artifacts.Armor;
import artifacts.Weapon;

//import controller.Keyin;
import util.CharacterFactory;
import view.*;
import model.*;
import view.PlayerStats;

public class ExistingHero {
	
	public static void _typeofHero() 
    {
 	
    
    	Weapon weapon = new Weapon();
    	Armor armor = new Armor();
    	
    	
    	Storage.Openfile();
		List<String[]> heroList = Storage.getHeroList();
		int index = 1;
    	
    	for(String[] heroStat: heroList) {
			System.out.println(index + ". " + heroStat[1]);
			index++;	
    	}
    	
    int selectHero;
    selectHero = Keyin.inInt("Select option : ");
    selectHero--;

	String[] heroStat = heroList.get(selectHero);
	
    Storage.closefile();
	
    Hero hero = CharacterFactory.newCharacter(heroStat[1].trim(), heroStat[0].trim());
	
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
   		break;
   	default:
   	    System.out.println("Invalid selection");
   	    break; 
   	}
    }
    	
}
