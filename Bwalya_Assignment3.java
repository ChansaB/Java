/**
 * Author: Chansa Bwalya 
 * File: Bwalya_Assignment3.java
 * 
 * Description: Program takes account number, records date created, accepts deposits
 * 			and calculates weekly interest  rates.	
 */

import java.util.Date;
import java.util.Scanner;

public class Bwalya_Assignment3 { //savings account class
	
	private int ID;
	private double balance;
	private double annualIntRate;
	private Date dateEstablished;
	
	//constructors
	public Bwalya_Assignment3 () 
	{
		
	}

	public Bwalya_Assignment3(int ID, double balance)
	{
		this.ID = ID;
		this.balance = balance;
	}
	
	//accessors
	public int getID()
	{
		return ID;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getAnnualIntRate()
	{
		return annualIntRate;
	}
	
	//mutators
	void setID(int ID)
	{
		this.ID = ID;
	}
	
	void setBalance (double balance)
	{
		this.balance = balance;
	}
	
	void setAnnualIntRate(double annualIntRate)
	{
		this.annualIntRate = annualIntRate;
	}
	
	//accessor for date established
	public Date dateEstablished()
	{
		return dateEstablished;
	}
	
	double getWeeklyIntRate()
	{
		double weeklyIntRate =( ((annualIntRate/100) / 52) * balance);
		return weeklyIntRate;	
	}
	
	void deposit()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your deposit amount: " );
		double add = input.nextDouble();
		balance += add;
		System.out.println("Your new balance is: $" + balance);
	}
	
	 void optionsMenu()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("OPTIONS BELOW ");
		System.out.println(" ");
		
		System.out.println("1. Deposit");
		System.out.println("2. View Weekly Interest Rate");
		System.out.println("3. View Account Details");
		System.out.println("4. Exit");
		System.out.println(" ");
		System.out.println("Enter your selection: ");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int selection;
		Bwalya_Assignment3 sav = new Bwalya_Assignment3();
		Date d1 = new Date();
		
		System.out.println("Welcome to your Savings Account App!");
		System.out.println("Enter your account number: ");
		sav.ID = input.nextInt();
		System.out.println("Enter your initial balance: ");
		sav.balance = input.nextDouble();
		System.out.println("Enter your annual interest rate: ");
		sav.annualIntRate =  input.nextDouble();
		
		sav.optionsMenu();
		
		
		
		//selection action
		do
		{
			selection = input.nextInt();
			switch(selection)
			{
			case 1: 
				sav.deposit();
				sav.optionsMenu();
				break;
			case 2:
				System.out.println("Your weekly interest rate is: $" + String.format("%.2f", sav.getWeeklyIntRate()));
				sav.optionsMenu();
				break;
			case 3:
				System.out.println("Account ID: " + sav.ID);
				System.out.println("Account creation Date/Time: " + d1);
				System.out.println("Balance: " + sav.balance);
				System.out.println("Weekly Interest amount: $" + String.format("%.2f", sav.getWeeklyIntRate()));
				sav.optionsMenu();
				break;
			case 4:
				System.out.println("Thank you - Goodbye!");
				input.close();
				break;
			default:
				System.out.println("Error, input correct choice");	
			} 	
		}
		
		while (selection != 4);
		input.close();
	
	}

}
