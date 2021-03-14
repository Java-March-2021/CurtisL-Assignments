import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
	static int[] myArray = { 1, 3, 5, 7, 9, 13 };
	static int[] negArray = { -2, 2, 4, 5, -7, -1 };

	// print 1-255
	public static void print255() {

		for (int i = 1; i <= 255; i++) {
			System.out.println(i);
		}

	}

	// print odds 1-255
	public static void printOdd255() {

		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	// print sum
	public static void printSum() {
		int sum = 0;
		for (int i = 0; i <= 255; i++) {
			System.out.println("New number: " + i + " Sum: " + sum);
			sum += i;
		}
	}

	// iterate array
	public static void iterArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num);
		}
	}

	// finds max in array
	public static void FindMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Array max value: " + max);
	}

	// Get Average
	public static void FindAvg(int[] arr) {
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg /= arr.length;
		System.out.println("Avg value of array is: " + avg);
	}

	// array list with odd
	public static void ArrayOddList() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				y.add(i);
			}
		}
		System.out.println(y);
	}

	// greater than y
	public static void greaterThanY(int[] arr, int y) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > y) {
				count++;
			}
		}
		System.out.println("there are: " + count + " numbers greater than y in the array");

	}

	// square values
	public static void squareArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}

	// elminate neg numbs
	public static void negNumReplace(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	// max, min, avg
	public static void maxMinAvg(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		int avg = 0;
		int[] results = new int[3];
		for (int i = 0; i < arr.length; i++) {
			if (min >= arr[i]) {
				min = arr[i];
				results[1] = min;
			}
			if (max < arr[i]) {
				max = arr[i];
				results[0] = max;
			}
			avg += arr[i];
		}
		avg /= arr.length;
		results[2] = avg;
		System.out.println(Arrays.toString(results));
	}

	// shifting array values
	public static void shiftArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		BasicJava.shiftArray(myArray);
	}
}
