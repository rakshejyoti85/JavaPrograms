package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;


public class MathFunction2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr[];
		int a[]=new int []{4,7,2,8,9,3};
		  int max = a[0];
		  int min=a[0];

        for(int i = 0; i < 6; i++)

        {

            if(max < a[i])

            {

                max = a[i];

            }
            
            if(min>a[i])
            {
            	min=a[i];
            }

        }

        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);
		}

}
