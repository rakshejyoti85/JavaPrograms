/******************************************************************************

 *  Purpose: To calculate temparature.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/




package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;


public class WindChill {
public static void main(String args[])
{

	System.out.println("Enter the value of t");
	int t=Utility.intergervalue();
	
	System.out.println("Enter the value of w");
	int w=Utility.intergervalue();
	
	double ans=0;
	 ans= Utility.chill(t,w);
	System.out.println(ans);

}
}
