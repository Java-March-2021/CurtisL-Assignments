
public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Project proj1 = new Project();

		proj1.setName("FHOB cafeteria reno");
		proj1.setDescription("Replace floors");

		proj1.setInitialCost(319451.12);
		System.out.println(proj1.elevatorPitch());

		Project proj2 = new Project("Rhob 3rd Floor", "Replace tile", 240000.00);
		Project proj3 = new Project("Capitol W wall", "Powerwash stone", 4500.00);
		Portfolio.projects.add(proj2);
		Portfolio.projects.add(proj3);
		Portfolio.projects.add(proj1);
		
		Portfolio.showPortfolio();
	}

}
