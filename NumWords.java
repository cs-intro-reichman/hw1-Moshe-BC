// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = 0;
		int singles = 0, tens = 0, hundreds = 0;

		num = Integer.parseInt(args[0]);

		singles = num % 10;
		tens = ((num % 100) - singles) / 10;
		hundreds = (num / 100);
		
		System.out.println(hundreds + " hundreds, " + tens + " tens, and "+ singles + " ones.");


	}
}
