// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int current = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int length = Integer.parseInt(args[2]);
		double future = 0;

		future = current * Math.pow(1 + rate / 100, length);

		System.out.println("After " + length + " years, $" + current 
							+ " saved at " + rate + "% will yield $" + (int) future);
	}
}