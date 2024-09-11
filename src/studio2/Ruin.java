package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Starting Amount: ");
	double startAmount = in.nextDouble();
	
	System.out.println("Win Limit: ");
	double winLimit = in.nextDouble();
	
	System.out.println("Win Chance (out of 100): ");
	double winChance = in.nextDouble();
	
	System.out.println("Total Simulations: ");
	int totalSimulations = in.nextInt();
	
	while (winLimit>startAmount && startAmount>0) {
		if (winChance > (Math.random()*100)) {
			startAmount++;
			totalSimulations++;
		}
		else {
			startAmount--;
			totalSimulations++;
		}
		while (winLimit==startAmount) {
		
			
		}
	}

	}

}
