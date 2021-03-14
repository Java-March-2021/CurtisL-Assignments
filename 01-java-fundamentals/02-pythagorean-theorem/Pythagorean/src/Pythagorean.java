
public class Pythagorean {
	 double a,b,c;
	 
	 
	

	public Pythagorean(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public double calcHypotenuse (double legA,double legB) {
		double c;
		c = Math.sqrt((legA*legA) +(legB*legB));
		return c;
	}
}
