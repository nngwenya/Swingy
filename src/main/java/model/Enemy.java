package model;

import java.awt.Point;
import java.util.Arrays;
import java.util.Random;

import view.Map;

public class Enemy extends Character {

		public String name = "Zombie";
		private boolean alive = true;
		public char nameChar;
		public int xposition = 0;
		public int yposition = 0;
		public static int numOfMonsters = 0;
		
		public Enemy(int attack, int defense, int hit_points, String name ) {
			
			this.attack = attack;
			this.defense = defense;
			this.hit_points = hit_points;
			Map map = new Map(); 
			
			int maxXspace = map.ft_board_len_x();
			int maxYspace = map.ft_board_len_y();
			
			
			int randX, randY;
			
			do {
				randX = (int) (Math.random() * maxXspace);
				randY = (int) (Math.random() * maxYspace);

				
			}while (map.ft_fetch_from_map(randX, randY) != '*');

				this.xposition = randX;
				this.yposition = randY;
				
				this.nameChar = this.name.charAt(0);

				map.ft_put_in_map(xposition, yposition, nameChar);
				
				numOfMonsters++;
	}
		public void setHit_points(int hit_points) {
			this.hit_points = hit_points;
			
	}
		public int getHit_points() {
			return hit_points;
		}
		
		public boolean isDead() {
	        return hit_points <= 0;
	    }
		


}
