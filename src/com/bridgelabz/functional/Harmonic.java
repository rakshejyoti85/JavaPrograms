/******************************************************************************


 *  Purpose: To print n th harmonic no.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class Harmonic {
	    public static void main(String[] args) { 

	        // command-line argument
	        double n = Double.parseDouble(args[0]);
	       
	       double sum=Utility.harmonicnumber(n);

	        // print the nth harmonic number
	        System.out.println(sum);
	    }

	}


