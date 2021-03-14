
public class fizzBuzz {

	public static void fizzbuzz(int num) {
		if ((num % 3 == 0) && (num % 5 == 0)) {
			System.out.println("FizzBuzz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(num);
		}
	}
}
