
public class StringManipulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str2 = "world";
		String str4 = "llo";
		System.out.
		println(StringManipulation.
				trimAndConcat(" hello ", " world "));
		
		System.out.println(StringManipulation.getIndexOrNull(str, "o"));
		System.out.println(StringManipulation.getIndexOrNull(str, str4));
		System.out.println(StringManipulation.concatSubstring(str, 2, 4, str2));
	}

}
