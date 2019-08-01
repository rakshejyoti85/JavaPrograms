/******************************************************************************
 *  
 *  Purpose: To check given input is in between march 20 to june 20 or not. 
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Springseason {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
	
	
	System.out.println("Enter the value of m:");
	int m=scanner.nextInt();
	
	System.out.println("Enter the value of d");
	int d=scanner.nextInt();
	
	  Utility.month(m,d);
	
}
}