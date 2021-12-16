/**
 * Author: Chansa Bwalya 
 * File: Bwalya_Assignment2.java
 * 
 * Description: Accepts first 12 digits of ISBN-13 number and outputs full 13 digits
 * 				Also keeps record of all books checked in, out and the total.
 */

import java.util.Scanner;

public class Bwalya_Assignment2 {
	
	static int checkOutCount = 0;
	static int returnCount = 0;
	
	public void startPage()
	{
		int digit = 0;
		int sum = 0;
		String ISBN;
		int value = 0;
		int i = 0;
		
		System.out.println("**********************************************");
		System.out.println("*Welcome to the Daily Book Inventory Program!*");
		System.out.println("**********************************************");
		
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		Scanner input = new Scanner(System.in); 
		ISBN = input.nextLine();
		
		while (ISBN.length()!=12)
		{
			System.out.println("ISBN invalid, re-enter code: ");
			ISBN = input.nextLine();
			
		}
	
				value = ISBN.charAt(i)-48; 
				int x = value*1;
				i++;
				int w = value*3;
				i++;
				int total = x + w;
				sum += total;
				digit = (10 - (sum%10));
				if (digit == 10)
				{
					digit -= 10;
				}
		 
			System.out.print("The ISBN-13 number is " + ISBN + digit);
			System.out.println(" ");
			actionPage();
	}
	
	public void actionPage()
	{
		char choice;
		char decision = 0;
		char c, C;
		char y, Y;
		char n, N;
		String r = null;
		String R = null;
		
	
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 'R' for return or 'C' for check out ");
		
		choice = input.nextLine().charAt(0);
		System.out.println(choice);
		if(choice == 'C' || choice == 'c')
		{
			checkOutCount ++;
			System.out.println("**********************************************");
			System.out.println("*           Daily Book Inventory             *");
			System.out.println("**********************************************");
			System.out.println("Number of books returned: " + returnCount);
			System.out.println("Number of books checked out: " + checkOutCount);
			System.out.println("The total of books processed: " + (returnCount + checkOutCount));
			System.out.println("**********************************************");
			System.out.println("Enter 'Y' to continue, 'N' to quit:");
			decision = input.nextLine().charAt(0);
			if (decision == 'Y' || decision =='y')
			{
				startPage();
			}
			else
			{
				System.out.println("*******Goodbye!**********");
			}
				
			
		}
		else if(choice == 'R' || choice == 'r')
		{
			returnCount ++;
			System.out.println("**********************************************");
			System.out.println("*           Daily Book Inventory             *");
			System.out.println("**********************************************");
			System.out.println("Number of books returned: " + returnCount);
			System.out.println("Number of books checked out: " + checkOutCount);
			System.out.println("The total of books processed: " + (returnCount + checkOutCount));
			System.out.println("**********************************************");
			System.out.println("Enter 'Y' to continue, 'N' to quit:");
			decision = input.nextLine().charAt(0);
			if (decision == 'Y' || decision =='y')
			{
				startPage();
			}
			else
			{
				System.out.println("*******Goodbye!**********");
			}
		}
	}

	public static void main(String[] args) {
		
		Bwalya_Assignment2 obj = new Bwalya_Assignment2();
		obj.startPage();
		}
}
