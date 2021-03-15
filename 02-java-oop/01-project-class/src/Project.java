
public class Project {
	private String name, description;
	private double initialCost;
	
	public String elevatorPitch () {
		
		return this.getName()+"("+String.valueOf(this.getInitialCost())+") "+ this.getDescription();
	}
	public double getInitialCost() {
		return initialCost;
	}
	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Project() {
		super();
	}
	public Project(String name) {
		super();
		this.name = name;
	}
	public Project(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Project(String name, String description, double initialCost) {
		super();
		this.name = name;
		this.description = description;
		this.initialCost = initialCost;
	}
	
	

}
