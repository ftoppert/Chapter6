package exercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int high = 0;
		int low = 100;
		int avg;
		int count = 0;
		int userChoice;
		int exitChoice;
		int total = 0;
		String result;

		Scanner input = new Scanner(System.in);
		
		do
		{
		System.out.print("enter a number >>> ");
		userChoice = input.nextInt();	
		if (userChoice > high) {
			high = userChoice;
			count = count + 1;
		}
		else  if (userChoice < low) {
			low = userChoice;
			count = count + 1;
		}	
		else if (userChoice > 100 || userChoice < 0)
		{
			System.out.println("out of range");}
	
		total = total + userChoice;
		System.out.print("enter a number 999 to exit any other number to continue>>> ");
		exitChoice = input.nextInt();	
	
		} while (exitChoice != 999);
		avg = total / count;
		System.out.println("The Average is >> " + avg + "\nThe high was >>> " + high);
		
		System.out.println("The low was >>> " +low);
	
		
	}
	
	}
		

		
	

