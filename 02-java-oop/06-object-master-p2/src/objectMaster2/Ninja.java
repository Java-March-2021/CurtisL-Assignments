package objectMaster2;

public class Ninja extends Human {

	public Ninja() {
		super();
		// TODO Auto-generated constructor stub
		this.setStealth(10);
	}
	
	public void stealth (Human h) {
		h.setHealth(h.getHealth()-this.getStealth());
		System.out.println("ninja steals health");
		this.setHealth(this.getHealth()+10);
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}

	@Override
	public String toString() {
		return "Ninja [getStrength()=" + getStrength() + ", getStealth()=" + getStealth() + ", getIntelligence()="
				+ getIntelligence() + ", getHealth()=" + getHealth() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
