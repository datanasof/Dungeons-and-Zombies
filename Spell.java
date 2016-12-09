package week08;

public class Spell {
	String name;
	int damage;
	int manaCost;
	int castRange;
	
	public Spell(String name, int damage, int manaCost, int castRange){
		this.name = name;
		this.damage = damage;
		this.manaCost = manaCost;
		this.castRange = castRange;
	}
	
	public String getName(){
		return name;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public int getManaCost(){
		return manaCost;
	}
	
	public int getCastRange(){
		return castRange;
	}
	

}
