/******************************************************************************

 *  
 *  Purpose: To add the two numbers.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
import java.util.Scanner;
public class Addition {
public static void main(String args[])
{
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("We  need addition of two numbers");
	
	System.out.println("Enter the first number:");
	int FirstNumber =scanner.nextInt();
	
	System.out.println("enter the second no:");
	int SecondNumber=scanner.nextInt();
		int sum = Utility.add(FirstNumber,SecondNumber);
		System.out.println("Addition of two numbers:"+sum);
		scanner.close();
}
}
