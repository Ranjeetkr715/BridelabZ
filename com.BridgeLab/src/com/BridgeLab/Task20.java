package com.BridgeLab;

import java.util.Scanner;

public class Task20   
{
	public static long toBinary(int num)
	{
		 System.out.println("Binary is " + Integer.toBinaryString(num));
	return num;
	}
   public static void main(String [] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number: ");
	  int num= sc.nextInt();
	   toBinary(num);
	  
	  
   }
}
