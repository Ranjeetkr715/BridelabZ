package com.BridgeLab;

import java.util.Scanner;

public class Task26 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lower number: ");
		int l=sc.nextInt();
	     System.out.println("enter the upper number");
	    int u=sc.nextInt();
		
		int i;
		for(int x=l+1;x<=u;x++)
		{
			for(i=2;i<x;i++)
				if(x%i==0)
				break;
			
				if(i==x)
				{
					System.out.println(x);
				}
			}
		}
	}


