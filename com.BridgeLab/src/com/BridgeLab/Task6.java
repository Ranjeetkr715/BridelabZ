package com.BridgeLab;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the  number");
		int l=sc.nextInt();
		System.out.println("enter the number: ");
		int u=sc.nextInt();
		int i;
		for(int x=l+1;x<=u-1;x++)
		{
			for( i=2;i<x;i++)
			{
				if(x%i==0)
					break;
			}
			if(x==i)
			{
				System.out.println(x);
			}
		}

	}

}
