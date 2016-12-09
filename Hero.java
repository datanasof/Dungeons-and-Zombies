package week08;

public class Hero extends Character {
	int maxManaLevel;
	Weapon currentWeapon;
	Spell currentSpell;

	public Hero(String name, String title, int health, int mana, int manaRegenerate) {
		super(name, title, health, mana, manaRegenerate);
		this.maxManaLevel = mana;
	}
	
	public String knownAs(){
		return name + " the " + title;
		
	}
	
	@Override
	public void takeMana(int mana){
		manaLevel += mana;
		if (manaLevel > maxManaLevel){
			manaLevel = maxManaLevel;
		}
	}
		
	public int attack(String tool){
		if(tool == "weapon" && currentWeapon != null){
			return currentWeapon.getDamage();
		}
		if(tool == "magic" && currentSpell != null){
			if(manaLevel >= currentSpell.getManaCost()){
				manaLevel -= currentSpell.getManaCost();
				return currentSpell.getDamage();				
			}			
		}
		return damage;
	}
	
	public void equip(Weapon w){
		this.currentWeapon = w;
	}
	
	public void learn(Spell s){
		this.currentSpell = s;
	}
	
	public static void main(String[] args) {
		Hero a = new Hero("asen", "braveDog", 100,100,4);
		Weapon sword = new Weapon("theMagicStick",45);
		a.equip(sword);
		Spell curse = new Spell("theCurse", 33, 35, 1);
		a.learn(curse);
		System.out.println(a.knownAs());
		System.out.println(a.attack("magic"));
		System.out.println(a.getMana());
	}
}
