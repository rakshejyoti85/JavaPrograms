/******************************************************************************


 *  Purpose: To perform trignometric operations.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class Trig {
public static void main(String args[])
{
	double deg;
	System.out.println("Enter the value for degree:");
	 deg=Utility.doublevalue();
	 double rad=Utility.trigop(deg);
	 
		System.out.println("the radiant value is:");
		System.out.println(rad);


}
}
