package week08;

public class Character {
	String name;
	String title;
	int manaRegenerate;
	int healthLevel;
	int manaLevel;
	int damage;
	
	public Character(int health, int mana, int damage){
		this.healthLevel = health;
		this.manaLevel = mana;
		this.damage = damage;		
	}
	
	public Character(String name, String title, int health, int mana, int manaRegenerate) {
		this.name = name;
		this.title = title;
		this.healthLevel = health;
		this.manaLevel = mana;
		this.manaRegenerate = manaRegenerate;
		this.damage = 2;	
	}
	
	public boolean isAlive(){
		return healthLevel > 0;
	}
	
	public boolean canCast(int manaPoints){
		return manaLevel >= manaPoints;
	}
	
	public int getHealth(){
		return healthLevel;
	}
	
	public int getMana(){
		return manaLevel;
	}
	
	public void takeHealing(int healing){
		healthLevel += healing;
		if(healthLevel > 100){
			healthLevel = 100;
		}
	}
	
	public void takeMana(int mana){
		manaLevel += mana;
	}
	
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	public void takeDamage(int damage){
		healthLevel -= damage;
		if(healthLevel < 0){
			healthLevel = 0;
		}
	}

}
