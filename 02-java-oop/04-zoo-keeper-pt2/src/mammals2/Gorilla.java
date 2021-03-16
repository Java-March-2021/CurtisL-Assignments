package mammals2;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
		if (energyLevel < 5) {
			System.out.println("Gorilla is out of energy, needs banana");
			this.eatBananas();
		}
	}
	
	
	

	public void throwSomething() {
		if (this.getEnergyLevel() < 5) {
			System.out.println("Gorilla is out of energy, needs banana");
			this.eatBananas();
		}
		System.out.println("Gorilla throws item");
		
		this.setEnergyLevel(this.getEnergyLevel()-5);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla eats banana and is satisfied");
		this.setEnergyLevel(this.getEnergyLevel()+10);
	}
	
	public void climb()	{
		if (this.getEnergyLevel() < 10) {
			System.out.println("Gorilla is out of energy, needs banana");
			this.eatBananas();
		}
		System.out.println("Gorilla climbs tree");
		this.setEnergyLevel(this.getEnergyLevel()-10);
	}
	
	

}
