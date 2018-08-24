package view;

import model.Enemy;
import model.Hero;

public class Simulation {
	private final Hero hero;
	private final Enemy enemy;
	
	public Simulation(Hero hero, Enemy enemy) {
		this.hero = hero;
		this.enemy = enemy;
	}
	
	public void fight() {
        Attacker game = new Attacker();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("INTERUPTED DELAY");
        }

        while (!enemy.isDead() && !hero.isDead())
        {
            game.attacks(hero, enemy);
        }
            if (enemy.isDead()){
                System.out.println("Enemy is dead!");
                victory();
                return;
            }
            
            else if (hero.isDead()){
                System.out.println("You are dead!");
                defeat();
                 return; 
            }
    
	}	

	 private void victory() {
	        System.out.println("You are the ultimate warrior.");
            System.out.println("You Have leveled up.." );
            System.out.println("LEVEL : " + hero.getLevel() + " Experience : " + hero.getExperience() + "\n");
	    }

	    private void defeat() {
	        System.out.println("You're Good...but Not That Good.");
            System.out.println("########## GAME OVER ###########\n");
            System.exit(0);
	    }
}
