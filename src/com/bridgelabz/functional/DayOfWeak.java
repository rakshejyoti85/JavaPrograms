package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class DayOfWeak {
	public static void main(String args[])
	{
		/*System.out.println("Enter the day:");
		int day=Utility.intergervalue();
		
		System.out.println("Enter the month:");
		int month=Utility.intergervalue();
		
		System.out.println("Enter the year:");
		int year=Utility.intergervalue();*/
		int day, month ,year;
		day =Integer.parseInt(args[0]);
		
		month =Integer.parseInt(args[1]);
		
		year =Integer.parseInt(args[2]);
	int	result=Utility.week(day, month, year);
		
		System.out.println("The result is:");
		System.out.println(result);
	}
	

}
