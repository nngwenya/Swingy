package charecters;

import javax.validation.constraints.NotNull;

import artifacts.Armor;
import artifacts.Weapon;
import view.Map;

public abstract class Hero extends Character  {
	
	private Weapon weapon;
	
	private Armor armor;
	
	@NotNull
	protected String name;
	protected int level;
	protected int experience;
	private String type;
	protected int xposition;
	protected int yposition;
	protected int movement;
	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	protected char PlayerChar = 'P';
	protected int numOfMonsters = 0;
	
	 public Hero(String name) {
		this.name = name;
		this.level = level;
		this.experience = experience;
		

}

	public void player() {
		Map map = new Map(); 
		
		int maxXspace = map.ft_board_len_x();
		int maxYspace = map.ft_board_len_y();
		
		
		int randX, randY;
		
		do {
			randX = maxXspace / 2;
			randY = maxYspace / 2;

			
		}while (map.ft_fetch_from_map(randX, randY) != '*');

			this.xposition = randX;
			this.yposition = randY;
			
			this.PlayerChar = this.name.charAt(0);

			map.ft_put_in_map(xposition, yposition, PlayerChar);
			numOfMonsters++;
	}
	
	public void movePlayer(Hero hero, int item) {
		Map map = new Map(); 
		
		int maxXBoardSpace = map.ft_board_len_x();
		int maxYBoardSpace = map.ft_board_len_y();
		
			
			map.ft_put_in_map(xposition, yposition, PlayerChar);
			

			if (item == 1)
			{
				if ((yposition - 1) > 0)
				{
					if (map.ft_fetch_from_map(xposition, yposition - 1) != '*')
						System.out.println("You Have came across an Enemy 1");
					yposition = yposition - 1;
				}
				else {
					yposition = yposition - 1;
					System.out.println("You Have Won!");
				}
			}
			else if (item == 2)
			{
				
				if ((xposition + 1) < maxXBoardSpace)
				{
					if (map.ft_fetch_from_map(xposition + 1, yposition) != '*')
						System.out.println("You Have came across an Enemy 2");
					xposition = xposition + 1;
				}
				else{
					xposition = xposition + 1;
					System.out.println("You Have Won!");
				}
			}
			else if (item == 3)
			{
				if ((yposition + 1) < maxYBoardSpace)
				{
					if (map.ft_fetch_from_map(xposition, yposition + 1) != '*')
						System.out.println("You Have came across an Enemy 3");
					yposition = yposition + 1;
				}	
				else {
					yposition = yposition + 1;
					System.out.println("You Have Won!");	
				}
			}
			else if (item == 4)
			{
				if ((xposition - 1) > 0)
				{
					if (map.ft_fetch_from_map(xposition - 1, yposition) != '*')
						System.out.println("You Have came across an Enemy 4");
					xposition = xposition - 1;
				}
				else {
					xposition = xposition - 1;
					System.out.println("You Have Won!");	
				}
			}
			map.updateMap(xposition, yposition, PlayerChar);
			
			
//			for (int i = 0; i < hero.length; i++) {
//				if (i == item) {
//					continue;
//				}
//				if (onMySpace(hero, i, item)) {
//					isSpaceOpen = true;
//					
//				}
//			}
//		}
//		public boolean onMySpace(Hero player, int indexCheck, int indexCheck2) {
//			if ((player[indexCheck].xposition) == player[indexCheck2].yposition)){
//				return true;
//			}
//			
		}
	//	}
		
		
		


	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	
}
