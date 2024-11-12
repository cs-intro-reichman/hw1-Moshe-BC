// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String ampm = "AM";

		if (hours >= 12) {
			ampm = "PM";
			if(hours > 12) {
				hours = hours -12;
			}
		}
		if (hours == 0) {
			ampm = "PM";
		}

		System.out.print(hours + ":");
		System.out.printf("%02d ", minutes);
		System.out.print(" " + ampm);
		

	}
}