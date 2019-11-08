package com.BridgeLab;

import java.util.Scanner;

public class Task21
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		System.out.println(Integer.toBinaryString(num));
		int newnum=((num & 0x0F)<< 4 | (num & 0xF0)>> 4);
//		int a=(num & 0x0F);
//		int b=(num & 0xF0);
//		System.out.println(a);
//		System.out.println(b);
//		int c=(a|b);
//		System.out.println(c);
		System.out.println(newnum);
	}

}
