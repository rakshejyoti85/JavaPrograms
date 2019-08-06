/******************************************************************************


 *  Purpose: To calculate square root of given number .
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class Sqrt {

	    public static void main(String[] args) { 

	       
	        double c = Double.parseDouble(args[0]);
	        double epsilon = 1e-15;  
	        double t = c;             

	         t=Utility.sqrtcal(t,epsilon,c);

	      
	        System.out.println("Square root is"+t);
	    }

	}


