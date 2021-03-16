package mammals2;

public class GiantBat extends Mammal {

	public GiantBat(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
		this.energyLevel=300;
	}
	
	public void fly() {
		System.out.println("swoop swooop");
		this.setEnergyLevel(this.getEnergyLevel()-50);
	}
	
	public void eatHumans() {
		System.out.println("so- well,never mind");
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	public void attackTown() {
		System.out.println("AhH!! its the bat from Godzilla");
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}

	
}
