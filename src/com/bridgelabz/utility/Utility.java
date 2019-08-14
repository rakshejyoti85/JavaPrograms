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
import java.util.Arrays;
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
		
		
		
		/**
		 * @param x
		 * @param y
		 */
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
		
		/**
		 * @param times
		 * @return
		 */
		public static int flipcoin(int times) {
			
			double heads = 0;
			for(int i=0;i<times;i++)
			{
				if (Math.random() > 0.5)
				{
					heads++;
				}
			}
			System.out.println("heads percentage is " + (float) (heads / times) * 100);
			System.out.println("tails percentage is " + (float) (times - heads) / times * 100);
			return 0;
			
		}
		
		
		/**
		 * @param n
		 * @param i
		 * @return
		 */
		public static int powerof2 (int n,int i)
		{
			int power=1;
			  while (i <= n)
	            {
	                System.out.println("2^"+i+" = " + power);
	                power = power * 2;
	                i++;
		}
			  return power;
}
			
		/**
		 * @param n
		 * @return
		 */
		public static double harmonicnumber (double n)
		{
			 // compute 1/1 + 1/2 + 1/3 + ... + 1/n
	        double sum=0.0;
	        int i=1;
	        for ( i = 1; i <= n; i++) 
	        {
	            sum += 1.0 / i;
	        }
			return sum;
		}
		
		
		/**
		 * @param t
		 * @param epsilon
		 * @param c
		 * @return
		 */
		public static double sqrtcal (double t,double epsilon,double c)
		{
		
        while(Math.abs(t-c/t) > epsilon*t) 
        {
            t = (c/t+t)/2.0;
        }
        return t;
		}		
		
		/**
		 * @param i
		 * @param j
		 * @param s1
		 * @param s2
		 * @param flag
		 * @return
		 */
		/**
		 * @param s1
		 * @param s2
		 * @return
		 */
		/**
		 * @param s1
		 * @param s2
		 * @return
		 */
		/**
		 * @param s1
		 * @param s2
		 * @return
		 */
		public static int primeno(int s1,int s2)
		{
			int flag=0;
			int i;
			//int i,j;
			 for( i = s1; i <= s2; i++)
	         {
	             for(int  j = 2; j < i; j++)
	             {
	                 if(i % j == 0)
	                 {
	                     flag = 0;
	                     break;
	                 }
	                 else
	                 {
	                     flag = 1;
	                 }
	              
	             }
//	             System.out.println(i);
	             if(flag == 1)
	             {
	            	// System.out.println ("The prime numbers in between the entered limits are :");
	                System.out.println(i);
		             }
			
				 
	         }return i;
		}
		

	 	 /**
	 	 * @param arr
	 	 * @param size
	 	 */
	 	public static void printRep(int arr[],int size)  
	 	    { 
	 	        int  i,j; 
	 	        System.out.println("Repeated Elements are :"); 
	 	        for (i = 0; i < size; i++)  
	 	        { 
	 	            for (j = i + 1; j < size; j++)  
	 	            { 
	 	                if (arr[i] == arr[j])  
	 	                   System.out.print(arr[i] + " "); 
	 	            } 
	 	        } 
	 	  
	 	    } 
	 	 
	 	 
	 	 
	 	/**
	 	 * @param a
	 	 * @param n
	 	 */
	 	public static void getSecondSmallest1(int[] a,int n)
	 	{  
	 		int temp;
	 		  for (int i = 0; i < n; i++) 

	 		    {

	 		        a[i] = Utility.intergervalue();

	 		    }

	 		    for (int i = 0; i < n; i++) 

	 		    {

	 		        for (int j = i + 1; j < n; j++) 

	 		        {

	 		            if (a[i] > a[j]) 

	 		            {

	 		                temp = a[i];

	 		                a[i] = a[j];

	 		                a[j] = temp;
	 		             
	 		            }
	 		           
	 		        }
	 		       
	 		       
	 	}
	 		  
	 	
	 	}
	 	  /**
	 	 * @param n
	 	 * @return
	 	 */
	 	public static int primeFactors(int n) 
	 	    { 
	 	        while (n%2==0) 
	 	        { 
	 	            System.out.print(2 + " "); 
	 	            n /= 2; 
	 	        } 
	 	  
	 	       
	 	        for (int i = 3;i <= Math.sqrt(n); i+= 2) 
	 	        { 
	 	            
	 	            while (n%i == 0) 
	 	            { 
	 	                System.out.print(i + " "); 
	 	                n /= i; 
	 	            } 
	 	        } 
	 	  
	 	        
	 	        if (n > 2) 
	 	            System.out.print(n);
	 	        
				return 0;
				
	 	    } 
	 	  
	 	  
	 	  
	 /**
	 * @param n
	 * @return
	 */
	public	 static int generateSquare(int n) 
	     { 
	         int[][] magicSquare = new int[n][n]; 
	           
	         // Initialize position for 1 
	         int i = n/2; 
	         int j = n-1; 
	    
	         // One by one put all values in magic square 
	         for (int num=1; num <= n*n; ) 
	         { 
	             if (i==-1 && j==n) //3rd condition 
	             { 
	                 j = n-2; 
	                 i = 0; 
	             } 
	             else
	             { 
	                 //1st condition helper if next number  
	                 // goes to out of square's right side 
	                 if (j == n) 
	                     j = 0; 
	                       
	                 //1st condition helper if next number is  
	                 // goes to out of square's upper side 
	                 if (i < 0) 
	                     i=n-1; 
	             } 
	               
	             //2nd condition 
	             if (magicSquare[i][j] != 0)  
	             { 
	                 j -= 2; 
	                 i++; 
	                 continue; 
	             } 
	             else
	                 //set number 
	                 magicSquare[i][j] = num++;  
	                   
	             //1st condition 
	             j++;  i--;  
	         } 
	    
	         // print magic square 
	         System.out.println("The Magic Square for "+n+":"); 
	         System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
	         for(i=0; i<n; i++) 
	         { 
	             for(j=0; j<n; j++) 
	                 System.out.print(magicSquare[i][j]+" "); 
	             System.out.println(); 
	         }
			return j; 
	     } 
	
	/**
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int no) 
	    { 
	        // Corner case 
	        if (no<= 1) 
	           return false; 
	        System.out.println(" false"); 
	         //Check from 2 to n-1 
	      
	        for (int i = 2; i < no; i++) 
	            if (no % i == 0) 
	              return false; 
	      //   System.out.println(" true") ;
	         return true; 
	        
		      }
	

	
		         
		           
		 }
	    

		


