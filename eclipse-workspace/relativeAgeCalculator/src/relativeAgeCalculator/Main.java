package relativeAgeCalculator;
import java.util.Scanner;

public class Main {
	public static void main (String args []) {
		System.out.println("Please enter your current age:");
		Scanner scanner = new Scanner(System.in);
		final double STARTAGE = scanner.nextInt();
		final int MAXAGE = 100;//120; 
		
		double relativeDistancedAge = STARTAGE;
		double realAge = STARTAGE;
		
		System.out.printf("Yearly increase %3.2f%% %n",(1/STARTAGE)*100);
		
		while (realAge < MAXAGE) {
			relativeDistancedAge++;
			realAge = realAge*(1+1/STARTAGE);
			//System.out.println(realAge+ ": "+relativeDistancedAge);	
			System.out.printf("Relative Age: %2.0f actual years passed: %3.1f \n",relativeDistancedAge, realAge);
		}	
		scanner.close();
		System.out.print("Feel old yet?");
	}
}
