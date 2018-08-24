package view;

import java.util.Random;

import model.Enemy;
import model.Hero;
import artifacts.*;

public class Attacker {
	Random randomNum = new Random();
	private int result;
	private  int hero1;
	private int enemy1;
	
	
	public void attacks(Hero hero, Enemy enemy) {
		result = randomNum.nextInt(2);
		Weapon weapon = new Weapon();

				if (result == 0) {
					if (enemy.getDefense() < hero.getAttack()){
						enemy1 = enemy.getDefense() - hero.getAttack();
						enemy.setHit_points(enemy.getHit_points() + enemy1);
						if (enemy.getHit_points() == 0){
							hero.setExperience(hero.getExperience() + 1000);
							hero.setLevel(hero.getLevel() + 1);
						}
					}
					System.out.println(hero.getName() + " has attacked with " + hero.getAttack() + " points using a " + weapon.getWeapon(hero) + " Enemy is left with " + enemy.getHit_points() + " Health");
				}else {
					if (hero.getDefense() < enemy.getAttack()){
					hero1 = hero.getDefense() - enemy.getAttack();
					hero.setHit_points(hero.getHit_points() + hero1);
				}
				System.out.println("Enemy has attacked with " + enemy.getAttack() + " and dealt " + hero1 + " damage " + hero.getName() + " is left with " + hero.getHit_points() + " Health");
			}
	}

}
