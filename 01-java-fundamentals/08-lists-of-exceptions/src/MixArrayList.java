import java.util.ArrayList;

public class MixArrayList {

	public static void main(String[] args) {
		ArrayList<Object> mixlist = new ArrayList<Object>();
		mixlist.add("Bose");
		mixlist.add(1989);
		mixlist.add("Music");
		mixlist.add("rythym");

		for (int i = 0; i < mixlist.size(); i++) {
			try {

				Integer castValue = (Integer) mixlist.get(i);

				System.out.println(castValue);
			} catch (ClassCastException e) {
				e.printStackTrace();
				System.out.println("String cannot be cast to Integer");
			}
		}

	}
}
