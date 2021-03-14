import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class PuzzleJava {
	public static int[] arr = { 3, 5, 1, 2, 7, 8, 13, 25, 32 };
	public static String[] arr2 = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
	public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); // creates alphabet array

	// method that prints sum and returns array of numbers greater than 10
	public static ArrayList<java.lang.Integer> greaterThan10(int[] arr) {

		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > 10) { // adds array value to arraylist if greater than 10
				arr1.add(arr[i]);
			}
		}
		System.out.println("Sum of all numbers is: " + sum);
		System.out.println(arr1.toString());
		return arr1;

	}

	// method that shuffles array values into arraylist and return names larger than
	// 5 characters
	public static ArrayList<String> shuffleName(String[] arr) {//
		ArrayList<String> names = new ArrayList<String>();
		Random random = new Random();
		int num = 0;

		while (names.size() != arr.length) {// while arraylist and array is same size
			num = random.nextInt(arr.length);

			if (names.contains(arr[num])) {// if arraylist contains array value remove it else adds it
				names.remove(arr[num]);
			} else {
				names.add(arr[num]);
			}
		}
		System.out.println(names);
		Iterator<String> itr = names.iterator();// creates iterator that will properly remove items in list without
												// error

		while (itr.hasNext()) {// while more values to check
			String name = itr.next();
			if (name.length() <= 5) {// remove names 5 characters or shorter
				itr.remove();
			}
		}
		System.out.println(names);
		return names;

	}

	// shuffles char array into a character list and check values
	public static void shuffleChar(char[] arr) {
		ArrayList<Character> charlist = new ArrayList<Character>();
		char[] vowels = "aeiouy".toCharArray();
		Random random = new Random();

		while (charlist.size() != arr.length) {// while list is not the same size as array
			int randomIndSwap = random.nextInt(arr.length);// creat a ranom index for array
			if (charlist.contains(arr[randomIndSwap])) { // if list already contains value skip else add
				continue;
			} else {
				charlist.add(arr[randomIndSwap]);
			}

		}
		System.out.println(charlist.toString());
		for (char vowel : vowels) { // checks if first letter is a vowel
			if (charlist.get(0) == vowel) {
				System.out.println("The first letter is a vowel.");
			}
		}
	}

	// generate and return array with 10 random numbers between 55-100
	public static int[] random50() {
		int[] randArr = new int[10];

		for (int i = 0; i < randArr.length; i++) {
			int random = (int) (55 + (Math.random() * 100));
			randArr[i] = random;
		}
		System.out.println(Arrays.toString(randArr));
		return randArr;
	}

	// generate and return array with 10 random numbers between 55-100 then sort
	public static int[] sortRandom50() {
		int[] randArr = new int[10];

		for (int i = 0; i < randArr.length; i++) {
			int random = (int) (55 + (Math.random() * 100));
			randArr[i] = random;
		}
		Arrays.sort(randArr);
		System.out.println(Arrays.toString(randArr));
		System.out.println("Lowest value: " + randArr[0] + "\nBiggest value: " + randArr[randArr.length - 1]);
		return randArr;
	}

	// creates random string 5 characters long
	public static void randomString(char[] arr) {
		String str = "";

		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int num = rand.nextInt(arr.length);
			str += arr[num];
		}
		System.out.println(str);

	}

	// creates random strings of 5 characters then add them to a String array and
	// prints
	public static void ranStringList(char[] arr) {
		String str = "";
		String[] strList = new String[10];
		Random rand = new Random();

		for (int x = 0; x < strList.length; x++) {
			for (int i = 0; i < 5; i++) {
				int num = rand.nextInt(arr.length);
				str += arr[num];
			}
			strList[x] = str;
			str = "";
		}
		System.out.println(Arrays.toString(strList));
	}

	public static void main(String[] args) {
		// PuzzleJava.greaterThan10(arr);
		// PuzzleJava.shuffleName(arr2);
		// PuzzleJava.shuffleChar(alphabet);
		// PuzzleJava.random50();
		// PuzzleJava.sortRandom50();
		// PuzzleJava.randomString(alphabet);
		// PuzzleJava.ranStringList(alphabet);
	}

}
