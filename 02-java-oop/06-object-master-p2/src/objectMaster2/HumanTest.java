package objectMaster2;

import java.util.ArrayList;

public class HumanTest {

	public static void main(String[] args) {
		ArrayList<Samurai>samurais= new ArrayList<Samurai>();
		Wizard wiz1 = new Wizard();
		Ninja nin1 = new Ninja();
		Samurai sam1 = new Samurai();
		Samurai sam2 = new Samurai();
		samurais.add(sam2);
		samurais.add(sam1);
		
		wiz1.fireball(sam1);
		
		System.out.println("Samurai health: "+sam1.getHealth());
		System.out.println("sam1 health: "+sam1.getHealth());
		wiz1.heal(wiz1);
		System.out.println("wiz1 health: "+wiz1.getHealth());
		
		nin1.stealth(wiz1);
		nin1.runAway();
		
		nin1.stealth(sam2);
		nin1.stealth(sam1);
		nin1.runAway();
		
		wiz1.fireball(sam2);
		sam1.deathBlow(nin1);
		
		wiz1.fireball(sam2);
		sam2.deathBlow(wiz1);
		
		System.out.println("Samurais still alive: "+samurais.size());
	
	}
}
