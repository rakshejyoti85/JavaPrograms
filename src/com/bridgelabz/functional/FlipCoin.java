package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter amount of times you want the coin to be tossed :");
		int times=Utility.intergervalue();
		
		Utility.flipcoin(times);
		
		}
		
	}
