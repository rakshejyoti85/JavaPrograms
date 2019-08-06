/******************************************************************************


*  Purpose: To perform power of two.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   6-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;


public class PowerOfTwo {

	 public static void main(String[] args)
	     {
	            //This is the given input number n
	        //    int n = 8;
	 
	           int i =0;
	            int power = 1;
	            System.out.println("Enter the value for n:");
	            int n=Integer.parseInt(args[0]);
	 
	            System.out.println("Powers of 2 that are less than 2^"+n);
	           int powerof=Utility.powerof2(n,i);
	        }
	}

