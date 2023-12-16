package uni.fmi.bachelors;

import java.util.Random;

public class Lizzard extends Thread{

	String name;
	int hp;
	double as;
	int regenRoundsNeeded;
	int regenAmount;
	boolean hasTail;
	int tailBlockChance;
	int invisibleChance;
	
	int invisibleCount = 0;
	int roundsTillRegain;
	
	Random random = new Random();
	Lizzard target;
	
	public Lizzard() {	}

	public Lizzard(String name, int hp, double as, int regenRoundsNeeded, int regenAmount, 
			int tailBlockChance, int invisibleChance) {
		super();
		this.name = name;
		this.hp = hp;
		this.as = as;
		this.regenRoundsNeeded = regenRoundsNeeded;
		this.regenAmount = regenAmount;
		this.tailBlockChance = tailBlockChance;
		this.invisibleChance = invisibleChance;
		roundsTillRegain = regenRoundsNeeded;
	}
	
	@Override
	public void run() {
		
		while(hp > 0 && target.hp > 0) {
			if(target.invisibleCount > 0) {
				target.invisibleCount--;
				System.out.println(name + 
						": looking around confused");
			}else {
				if(target.hasTail) {
					if(random.nextInt(100) <= target.tailBlockChance) {
						System.out.println(target.name + " blocked!");						
					
						if(random.nextBoolean()) {
							target.hasTail = false;
							System.out.println(name + 
									": cut the tail of "
									+ target.name);
						}
					
					}else {
						int dmg = random.nextInt(20);
						target.hp -= dmg;
						
						System.out.println(name + " hit " +
						 target.name + " for " + dmg +
						 " and left him with " + target.hp);
					}
				}else {
					int dmg = random.nextInt(20);
					target.hp -= dmg;
					
					System.out.println(name + " hit " +
					 target.name + " for " + dmg +
					 " and left him with " + target.hp);
				}
				
				roundsTillRegain--;
				if(roundsTillRegain == 0) {
					roundsTillRegain = regenRoundsNeeded;
					hp += regenAmount;
					hasTail = true;
					
					System.out.println(name + ": regenerated"
							+ " and now has " + hp + " left");
				}
				
				invisibleCount--;
				
				if(random.nextInt(100) <= invisibleChance) {
					invisibleCount = 5;
				}
			}
			
			try {
				Thread.sleep((long)(1000 / as));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		if(hp > 0) {
			System.out.println(name + ": HAHAHA NOOOOOOOOB ");
		}else {
			System.out.println(name + ": DURTY CHEATING LIZZARD ....");
		}

	}
	
}
