package week08;

public class Enemy extends Character{

	public Enemy(int health, int mana, int damage) {
		super(health, mana, damage);
		// TODO Auto-generated constructor stub
	}
	
	public int attack(){
		return damage;
	}
	
	public static void main(String[] args) {
		Enemy urod = new Enemy(100, 100, 20);
		System.out.println(urod.isAlive());
	}

}
