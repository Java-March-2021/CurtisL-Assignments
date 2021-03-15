import java.util.ArrayList;

public class Portfolio {

	public static ArrayList<Project> projects = new ArrayList<Project>();

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public static double getPortfolioCost() {
		double portfolioCost = 0;
		for (Project proj : projects) {
			portfolioCost += proj.getInitialCost();

		}
		return portfolioCost;
	}

	public static void showPortfolio() {
		for (Project proj : projects) {
			System.out.println(proj.elevatorPitch());
		}
		System.out.println("Total portfolio cost: $" + Portfolio.getPortfolioCost());
	}
}
