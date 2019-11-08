package com.BridgeLab;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number: ");
		int num=sc.nextInt();
		
		if(num%400==0 || (num%4==0 && num%100!=0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}

	}

}
