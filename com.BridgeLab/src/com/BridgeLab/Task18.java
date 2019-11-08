package com.BridgeLab;

import java.util.Scanner;

public class Task18
{
	public static double monthlyPayment(int P ,int Y ,int R)
	{
		double r=R/12*100;
		int n=12*Y;
		double Payment=((P*R)/1-Math.pow(1+r,(-n)));
		return Payment;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int P=sc.nextInt();
		System.out.println("enter the number: ");
		int Y=sc.nextInt();
		System.out.println("enter the number: ");
		int R=sc.nextInt();
		
		double Payment=monthlyPayment(P,Y,R);
		System.out.println(Payment);

	}

}
