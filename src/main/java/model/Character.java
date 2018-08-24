package model;

public class Character  {
	
	
	private int id;
	private boolean alive;
	protected int attack;
	protected int defense;
	protected int hit_points;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getHit_points() {
		return hit_points;
	}
	public void setHit_points(int hit_points) {
		this.hit_points = hit_points;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	

}
