
public class PythagoreanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pythagorean p = new Pythagorean(5, 5, 0);
		p.c = p.calcHypotenuse(p.a, p.a);
		System.out.println(p.c);
	}

}
