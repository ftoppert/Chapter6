package practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- for Rock
		//2- for Paper
		//3- Scissors
		
		int userChoice;
		int  count = 0;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Rock, Paper,or  Scissors? >> ");
		userChoice = input.nextInt();
		Random rand = new Random();
		int   computerDecision = rand.nextInt(3) + 1;

		
		if (computerDecision == 3  ) {//scissors
			if(userChoice == 1) {
				result = " You win";
			
		}
			else if (userChoice == 2) {//Paper
				result = "You Lose";
			}
			else//Rock
			{
				result= "Tie";
				count = count + 1;
			}	
		}
		else if (computerDecision == 1  ) {// rock
			if(userChoice == 2) {
				result = " You win";
			}
			else if (userChoice == 3) {// scissors
				result = "You Lose";
			}
			else//paper
			{
				result= "Tie";
				count = count + 1;
			}	
		}
		else if (computerDecision == 2  ) {// paper
			if(userChoice == 3) {
				result = " You win";
			}
				}
			else if (userChoice == 1) {// rock
				result = "You Lose";
				}
			else// scissors
				{
				result= "Tie";
				count = count + 1;
				}			
		}

		{
			String result = null;
			displayMessage(result);
	}


	private static void displayMessage(String result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	


}
}
	



		
	