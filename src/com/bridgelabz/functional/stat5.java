/******************************************************************************

 *  Purpose: To calculate average, min value ,max value of five random values.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/



package com.bridgelabz.functional;
import java.lang.Math;

import com.bridgelabz.utility.Utility;

public class stat5
{
	public static void main(String args[])
	{
		
	double val1 =  Math.random();
	System.out.println("the first value is:"+val1);
	
	double val2 = Math.random();
	System.out.println("the second value is:"+val2);
	
	double val3 =  Math.random();
	System.out.println("the third value is:"+val3);
		
	double val4 =  Math.random();
	System.out.println("the fourth value is:"+val4);
			
	double val5 =  Math.random();
	System.out.println("the fifth value is:"+val5);
	
	double avg=0;
	avg= Utility.statop(val1,val2,val3,val4,val5);
	System.out.println("average of five values are:"+avg);
	
	
	
	
	
		System.out.println("The Minimun is");
		
		double min=Math.min(val1,Math.min(val2,Math.min(val3,Math.min(val4,val5))));
		System.out.println(min);

		 double max=Math.max(val1,Math.max(val2,Math.max(val3,Math.max(val4,val5))));
		
		System.out.println("The Maximum is");
				System.out.println(max);
		}	
	
}
