package calculatorII;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		boolean check = false;
		Scanner input = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.println("enter 1st number ");

		while (!check) {
			try {
				calc.setOperandOne(input.nextDouble());
				check = true;
			} catch (Exception e) {
				System.out.println("Please enter a number");
				input.nextLine();
			}

		}
		input.nextLine();
		check = false;
		while (!check) {
			try {
				String inp = ";";
				System.out.println("Enter an operand");
				inp = input.next();
				calc.setOperation(inp);
				check = true;
			} catch (Exception e) {
				System.out.println("Please enter an operand");
				input.nextLine();
			}

		}

		input.nextLine();
		check = false;
		while (!check) {
			try {
				System.out.println("Enter 2nd number");
				calc.setOperandTwo(input.nextDouble());
				check = true;
			} catch (Exception e) {
				System.out.println("Please enter a number");
				input.nextLine();
			}

		}

		calc.getResults();
		input.close();
	}

}
