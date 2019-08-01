/******************************************************************************

 *  
 *  Purpose: To reuse the code.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

public class Utility {
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static int add(int number1,int number2)
	{
		int sum=number1+number2;
				return sum;
	}




	/**
	 * @param year
	 */
	public static void leap(int year) {


		if(year>=1582 && year<10000)   
	         	 { 

	        boolean flag=true;;
			if(year % 400 == 0)
	        {
	            flag = true;
	        }
	        else if (year % 100 == 0)
	        {
	            flag = false;
	        }
	        else if(year % 4 == 0)
	        {
	            flag = true;
	        }
	        else
	        {
	            flag = false;
	        }
	        if(flag)
	        {
	            System.out.println("Year "+year+" is a Leap Year");
	        }
	        else
	        {
	            System.out.println("Year "+year+" is not a Leap Year");
	        }
	       		} 

				else
				{
	                            System.out.println("Year should be less than 1582");			
				}
	    }




		/**
		 * @param a
		 * @param b
		 * @param c
		 * @param ch
		 * @param value
		 * @return
		 */
		public static int operation(int a,int b,int c,int ch,int value)
		{
			if(ch==1)
			{
			value = a + b * c;
			
						
				//System.out.println("Answer of first opeartion is:" + value);
				}
			if(ch==2)
			{
			value=	a * b + c;
			//System.out.println("Answer of second opeartion is:" + value);
			}
			
			if(ch==3)
			{
			value=	c + a / b;
		//	System.out.println("Answer of third opeartion is:" + value);
			}
			if(ch==4)
			{
			value=	a % b + c;
			//System.out.println("Answer of fourth opeartion is:" + value);
			}
		return value;	
		}
		
		




		/**
		 * @param m
		 * @param d
		 */
		public static void month(int m,int d)
		{
			if(m>=3 && m<=6 || d>=20 && d<=20)
			{	
		System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		}
		
		}