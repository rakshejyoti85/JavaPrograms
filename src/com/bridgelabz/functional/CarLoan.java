/******************************************************************************


 *  Purpose: To calculate payment.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/



package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String args[])
	{
		double P,Y,R;
		P=Double.parseDouble(args[0]);
		Y =Double.parseDouble(args[1]);
		R=Double.parseDouble(args[2]);
		
		double payment= Utility.paycal(P, R, Y);
		System.out.println("The payment is:");
		System.out.println(payment);

	}
}