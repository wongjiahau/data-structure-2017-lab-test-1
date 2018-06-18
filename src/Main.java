import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		// Test Question1 
		System.out.println("======================");
		System.out.println("Question 1 ");
		System.out.println(calculateInvestmentValue(1000, 0.10, 3));
		System.out.println("======================");

		// Test Question2
		System.out.println("======================");
		System.out.println("Question 2");
		promptUser();
		System.out.println("======================");
	}

	// Question 1
	public static double calculateInvestmentValue(
		double initialInvenstmentAmount,
		double annualInterestRate,
		int numberOfYears
	){
		double currentInvestment = initialInvenstmentAmount + (initialInvenstmentAmount * annualInterestRate);
		if(numberOfYears == 1) {
			return currentInvestment;
		}
		return calculateInvestmentValue(
			currentInvestment,
			annualInterestRate,
			numberOfYears - 1
		);
	}

	// Question 2
	public static void promptUser() {
		System.out.println("Enter a 5 digits number >> ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		printTriangle(padLeft(input, "0", 5));
	}

	public static void printTriangle(String input) {
		System.out.println(input);
		if(input.length() > 0) {
			printTriangle(input.substring(1, input.length()));
		}
	}

	/**
	 * This function is to pad decorators to the left of a string
	 * For example:
	 * 		padLeft("4321", "0", 5) >> "01234"
	 * 		padLeft("321", "0" , 5) >> "00321"
	 */
	public static String padLeft(String target, String decorator, int length) {
		if(target.length() - length == 0) {
			return target;
		}
		return padLeft(decorator + target, decorator, length); 
	}
}
