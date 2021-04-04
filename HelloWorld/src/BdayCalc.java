import java.util.Scanner;

public class BdayCalc {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("How old are you? ");
		System.out.print("Find out by typing your bday");
		System.out.print(" and today in yyyymmdd format.");
		
		Scanner in = new Scanner(System.in);
		int bday = in.nextInt();
		int answer = in.nextInt();
		int answer1 = Math.abs(bday - answer);
		int answer2 = answer1 / 10000;
		
		System.out.printf("You are %d years old!", answer2);
	}

}
