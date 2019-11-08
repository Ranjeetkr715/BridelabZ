package com.BridgeLab;

import java.util.Scanner;

public class Tasks5 
{
	public static void main(String[] args)
	{
		int i;
		float sum=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number: ");
	     int n=sc.nextInt();


		for(i=1;i<=n;i++)
		{
		sum=sum+(float)1/i;
         }
       System.out.println(sum);
	}
}


