/******************************************************************************

 *  Purpose: To add the two dice numbers randomly.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
import java.lang.Math;
public class SumOfTwoDice {
public static void main(String args[])
{
	
	int firstval=0,secondval=0;
	//int S=4;
	
	 //firstval=S*((int)Math.random()+1);
	     firstval = (int) (Math.random() * 6 + 1);
	System.out.println("the first value is:"+firstval);
	
    secondval = (int) (Math.random() * 6 + 1);
	System.out.println("the second value is:"+secondval);;
	
	int sum= Utility.sumofdice(firstval,secondval);
	 System.out.println("sum of two dice is:"+sum);
	//	System.out.println(sum);
		
}
}
