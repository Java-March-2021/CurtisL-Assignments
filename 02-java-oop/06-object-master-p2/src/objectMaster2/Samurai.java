package objectMaster2;

import java.util.ArrayList;

public class Samurai extends Human{

	public Samurai() {
		super();
		// TODO Auto-generated constructor stub
		this.setHealth(200);
	}
	
	public void deathBlow (Human h) {
		h.setHealth(0);
		System.out.println(h.getClass()+" dies");
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate () {
		this.setHealth(200);
	}
	
	public void howMany (ArrayList<Samurai> s) {
		System.out.println("Samurai count: "+s.size());
	}

	@Override
	public String toString() {
		return "Samurai [getStrength()=" + getStrength() + ", getStealth()=" + getStealth() + ", getIntelligence()="
				+ getIntelligence() + ", getHealth()=" + getHealth() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
