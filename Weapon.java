package week08;

public class Weapon {
	String name;
	int damage;
	
	public Weapon(String name, int damage){
		this.name = name;
		this.damage = damage;
	}
	
	public String getName(){
		return name;
	}
	
	public int getDamage(){
		return damage;
	}

}
