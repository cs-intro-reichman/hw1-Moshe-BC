// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int num1, num2, num3;

		num1 = (int) (Math.random() * range);
		num2 = (int) (Math.random() * range);
		num3 = (int) (Math.random() * range);

		int max = num1, mid = num2, min = num3;

		//sort by size:
		if (num1 >= num2 && num1 >= num3){
			max = num1;
			if (num2 >= num3) {
				mid = num2;
				min = num3;
			}else{
				mid = num3;
				min = num2;
			}
				
			}
			else if (num2 >= num1 && num2 >= num3) {
				max = num2;
				if (num1 >= num3) {
					mid = num1;
					min = num3;
			}else{
					mid = num3;
					min = num1;					
				}
				
			}
			else if (num3 >= num1 && num3 >= num2) {
				max = num3;
				if (num1 >= num2) {
					mid = num1;
					min = num2;
			}else{
					mid = num2;
					min = num1;
				}
				
			}

		
        System.out.println("Random numbers in ascending order: " + min + ", " + mid 
							+ ", " + max);

	}

}