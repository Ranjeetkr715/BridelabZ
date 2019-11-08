package com.BridgeLab;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int d=( (b*b) -4 * a *c);
		double x1;
		double x2;
		
		if(d>0)
		{
			System.out.println("root are real:");
			 x1=(-b+ Math.sqrt( (b*b) -4*a*c)/(2*a));
			 x2=(-b+ Math.sqrt( (b*b) -4*a*c)/(2*a));
			
			System.out.println(x1);
			System.out.println(x2);
		}
		else if(d==0)
		{
			System.out.println("root are equal: ");
			x2=x1=(-b/(2*a));
			System.out.println(x1);
			System.out.println(x2);
		}
		else
		{
			System.out.println("imaginary root");
			
		}
	}

}
