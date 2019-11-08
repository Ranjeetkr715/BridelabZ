package com.BridgeLab;

import java.util.Scanner;

public class Task15 {

			public static void countCurrency(int amount) 
			{ 
				int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
				int[] noteCounter = new int[9]; 
			
				
				for (int i = 0; i < 9; i++)
				{ 
					if (amount >= notes[i])
					{
						noteCounter[i] = amount / notes[i]; 
						amount = amount - noteCounter[i] * notes[i]; 
					} 
				} 
			
				// Print notes 
				System.out.println("Currency Count :-"); 
				for (int i = 0; i < 9; i++) { 
					if (noteCounter[i] != 0) { 
						System.out.println(notes[i] + " : "
							+ noteCounter[i]); 
					} 
				} 
			} 
			
			
			public static void main(String argc[])
			{ 
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the amount: ");
				int amount =sc.nextInt();
				countCurrency(amount); 
			} 
		}


