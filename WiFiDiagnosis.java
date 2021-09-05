import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		String answer = "";
		Scanner in = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, "
				+ "this WiFi Diagnosis might work.");
		System.out.println("\nFirst step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		answer = in.nextLine();
		if (answer.equals("no")) {
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			answer = in.nextLine();
			if (answer.equals("   ")) {
				System.out.println("Third step: make sure the cables to your router are plugged in firmly"
						+ " and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				answer = in.nextLine();
				if (answer.equals("no")) {
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					answer = in.nextLine();
					if (answer.equals("no")) {
						System.out.println("Fifth step: contact your ISP");
					}
					else {
						System.out.println("Moving your computer closer to your router seemed to work");
						System.exit(0);
					}
				}
				else {
					System.out.println("Checking the router's cables seemed to work");
					System.exit(0);
				}
			}
			else {
				System.out.println("Rebooting your router seemed to work");
				System.exit(0);
			}
		}
		else {
			System.out.println("Rebooting your computer seemed to work");
			System.exit(0);
		}
		System.out.println("Make sure your ISP is hooked up to your router");
	}
}
