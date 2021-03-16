package objectMaster2;

public class Wizard extends Human {

	public Wizard() {
		super();
		// TODO Auto-generated constructor stub
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human h) {
		h.setHealth(h.getHealth()+this.getIntelligence());
	}
	
	public void fireball(Human h) {
		h.setHealth(h.getHealth()-(this.getIntelligence()*3));
		if(h.getHealth()<=0) {
			System.out.println("Victim dies");
		}
	}

	@Override
	public String toString() {
		return "Wizard [getStrength()=" + getStrength() + ", getStealth()=" + getStealth() + ", getIntelligence()="
				+ getIntelligence() + ", getHealth()=" + getHealth() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
