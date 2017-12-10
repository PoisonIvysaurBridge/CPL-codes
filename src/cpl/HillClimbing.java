package cpl;
import java.util.Scanner;

public class HillClimbing {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		String vehicle = scanner.next();
		while (!vehicle.equals("done")) {
			int x0 = scanner.nextInt();
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			
			double stepsForward = Math.abs(x1 - x0);
			double stepsUpward = y1;
			
			
			
			double angle = Math.toDegrees(Math.atan(stepsUpward / stepsForward));
			System.out.println("Y:" + angle);
			boolean possible = false;
			if (angle <= 30) {
				if (vehicle.equals("bike")) {
					possible = true;
				}
			}
			if (angle <= 45) {
				if (vehicle.equals("car")) {
					possible = true;
				}
			}
			if (angle <= 60) {
				if (vehicle.equals("legs")) {
					possible = true;
				}
			}
			
			s.append(possible ? "can do\n" : "no can do\n");
			vehicle = scanner.next();
		}
		
		System.out.print(s);
	}

}
