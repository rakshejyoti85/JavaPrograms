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
import java.util.Scanner;
public class Utility {
	static Scanner scanner=new Scanner(System.in);
	public static int intergervalue()
	{
		int intergervalue=scanner.nextInt();
		return intergervalue;
	}
	
	public static double doublevalue()
	{
		double doublevalue=scanner.nextDouble();
		return doublevalue;
	}
	
	public static String stringvalue()
	{
		String stringvalue =scanner.nextLine();
		return stringvalue;
	}
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
			
				}
			if(ch==2)
			{
			value=	a * b + c;
	
			}
			
			if(ch==3)
			{
			value=	c + a / b;

			}
			if(ch==4)
			{
			value=	a % b + c;

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
		
		
		
		public static void ED (int x,int y)
		{
			double distance =Math. sqrt(x*x + y*y);
			System.out.println("Euclidian Distance is:");
			System.out.println(distance);
			
		}

	
		/**
		 * @param firstval
		 * @param secondval
		 * @return
		 */
		public static int sumofdice(int firstval ,int secondval)
		{
			

			int	sum=firstval+secondval;
			
			return sum;
			
		}
		
		/**
		 * @param val1
		 * @param val2
		 * @param val3
		 * @param val4
		 * @param val5
		 * @return
		 */
		public static double statop(double val1,double val2,double val3,double val4,double val5)
		{
			double avg=val1+val2+val3+val4+val5/5;
			return avg;
			}
		
		
		/**
		 * @param w
		 * @param t
		 * @return
		 */
		public static double chill(double w,double t)
		{
		double	ans=35.74+0.62215*t+0.4275*t-35.75*Math.pow(t,0.16);
			return ans;
		}
		
		/**
		 * @param day
		 * @param month
		 * @param year
		 * @return
		 */
		public static int week(int day,int month,int year)
		{
			
			int y0 = year -(14- month) / 12;
			int x = y0 + y0/4-y0/100 + y0/400;
			int m0 = month + 12 *((14-month)/12)-2;
			int d0 = (day + x + 31*m0/12)% 7;
			return d0;
		}
		
		/**
		 * @param ftemp
		 * @return
		 */
		public static int calc(int tempc,int tempf)
		{
			
			int f=tempc-32*5/9;
			int c=tempf*(9/5)+32;
			
			System.out.println("The temparature in celcuios:");
			System.out.println(c);
			return f;
		}
		
		
		/**
		 * @param P
		 * @param R
		 * @param Y
		 * @return
		 */
		public static double paycal(double P,double R,double Y)
		{
			double r=R/(12*100);
			double n=12*Y;
			double payment=P*r/Math.pow((1+(R/(12*100))),(-n));
			return payment;
		}
		
		/**
		 * @param deg
		 * @return
		 */
		public static double trigop(double deg)
		{
			double rad=Math.toRadians(deg);
	
		double s=Math.sin(deg);
		System.out.println("The sine value is");
		System.out.println(s);
		double c=Math.cos(deg);
		System.out.println("The cos value is");
		System.out.println(c);
		return rad;
		}
		
		public static int coin(int heads,int toss,int random,int counter,int tails)
		{  while (counter < toss){
			  
	 	         
			  
	 	        if (random > 0.5) {
	 
	 	            heads = heads + 1;
	 
	 	            System.out.println("Head");
	 
	 	        }

	 	        else {
	 
	 	            tails = tails + 1;
	 
	 	            System.out.println("Tail");
	 
	 	        }
	 
	 	            counter++;
	 
	 	          //  random = toss.nextInt(2);
	 
	 	    }
		return toss;
}
}
			

		