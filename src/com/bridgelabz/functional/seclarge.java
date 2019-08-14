/******************************************************************************


 *  Purpose: To print second largest and second smallest no in an given array..
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   06-08-2019
 *
 ***************************************************************************/



package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class seclarge
{  

public static void main(String args[]){  
    int n, temp;

   // Scanner s = new Scanner(System.in);

    System.out.print("Enter no. of elements you want in array(Minimum 2):");

    n = Utility.intergervalue();
    int i=0;
    int a[] = new int[n];

    System.out.println("Enter all the elements:");

  
   Utility.getSecondSmallest1(a,n);
    System.out.println("Largest :"+a[n-2]);
  System.out.println("Smallest:"+a[1]);
 
}
}